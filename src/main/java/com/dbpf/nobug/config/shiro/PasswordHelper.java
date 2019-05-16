package com.dbpf.nobug.config.shiro;

import com.dbpf.nobug.common.utils.MD5Util;

/**
 * @author juebing
 * @version v1.0
 * @date 2019/5/16 18:22
 * @description
 */
public class PasswordHelper {

    public PasswordHelper(){}
    /**
     * 根据用户名与密码做md5单向hash加密
     *
     * @param username
     *            用户名
     * @param password
     *            用户密码明文
     * @return md5(username+password)
     */

    public String encryptPassword(String password, String saltKey) {
        return MD5Util.sign(password, saltKey, MD5Util.CHARSET_UTF8);
    }
}