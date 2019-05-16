package com.dbpf.nobug.config.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;
import org.apache.shiro.cache.Cache;

import java.util.concurrent.atomic.AtomicInteger;

public class RetryLimitSimpleCredentialsMatcher extends SimpleCredentialsMatcher {
	private Cache<String, AtomicInteger> passwordRetryCache;

	private PasswordHelper passwordHelper = new PasswordHelper();

	public RetryLimitSimpleCredentialsMatcher() {}

	public void setPasswordHelper(PasswordHelper passwordHelper) {
		this.passwordHelper = passwordHelper;
	}

	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		UsernamePasswordToken loginToken = (UsernamePasswordToken) token;
		SimpleAuthenticationInfo sinfo = (SimpleAuthenticationInfo) info;
		String password = String.valueOf(loginToken.getPassword());

		String username = (String) loginToken.getPrincipal();
		String saltKey = sinfo.getCredentialsSalt().toString();

		String user_input_login_pass = passwordHelper.encryptPassword(password, saltKey);
		Object db_login_password = getCredentials(info);
		// 将密码加密与系统加密后的密码校验，内容一致就返回true,不一致就返回false
		boolean matches = super.equals(user_input_login_pass, db_login_password);

		return matches;
	}
}
