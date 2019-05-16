package com.dbpf.nobug.config.shiro;

import com.dbpf.nobug.database.dto.SysUser;
import com.dbpf.nobug.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.util.SimpleByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author juebing
 * @version v1.0
 * @date 2019/5/15 19:32
 * @description
 */
public class CustomRealm extends AuthorizingRealm {

    private static final Logger logger = LoggerFactory.getLogger(CustomRealm.class);

    public CustomRealm() {
        super();
    }

    @Autowired
    @Lazy
    private UserService userService;

    /**
     * 账号授权
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SysUser user = (SysUser) principals.getPrimaryPrincipal();
        // 根据账户从数据库中查询用户数据
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(this.setUserRoles(user));
        authorizationInfo.addStringPermissions(this.setUserPermissions(user));
        return authorizationInfo;
    }

    /**
     * 账号认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String account = (String) authenticationToken.getPrincipal();
        SysUser user = this.getUserByAccount(account);
        if (user == null) {
            throw new UnknownAccountException();
        }
        if ("0".equals(user.getUserStatus())) {
            throw new LockedAccountException();
        }

        ByteSource saltKey = new SimpleByteSource(user.getSaltKey());
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user, user.getPassword(), saltKey, getName());
        return authenticationInfo;
    }

    protected SysUser getUserByAccount(String username) {
        SysUser user = null;
        try {
            user = userService.findSysUserByUserName(username);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

        return user;
    }

    /**
     * 设置用户拥有角色
     * @param user
     * @return
     */
    protected Set<String> setUserRoles(SysUser user) {
        Set<String> roles = new HashSet<String>();
        roles = userService.queryRoleByUserId(user.getId());
        return roles;
    }

    /**
     * 设置用户拥有权限
     * @param user
     * @return
     */
    protected Set<String> setUserPermissions(SysUser user) {
        Set<String> permissions = new HashSet<String>();
        permissions = userService.queryPermissionByUserId(user.getId());
        return permissions;
    }

    @Override
    public void clearCachedAuthorizationInfo(PrincipalCollection principals) {
        super.clearCachedAuthorizationInfo(principals);
    }

    @Override
    public void clearCachedAuthenticationInfo(PrincipalCollection principals) {
        super.clearCachedAuthenticationInfo(principals);
    }

    @Override
    public void clearCache(PrincipalCollection principals) {
        super.clearCache(principals);
    }

    @Override
    protected void doClearCache(PrincipalCollection principals) {
        clearAllCache();
    }

    public void clearAllCachedAuthorizationInfo() {
        getAuthorizationCache().clear();
    }

    public void clearAllCachedAuthenticationInfo() {
        getAuthenticationCache().clear();
    }

    public void clearAllCache() {
        clearAllCachedAuthenticationInfo();
        clearAllCachedAuthorizationInfo();
    }
}