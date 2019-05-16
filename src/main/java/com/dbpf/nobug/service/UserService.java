package com.dbpf.nobug.service;

import com.dbpf.nobug.database.dto.SysUser;
import org.springframework.cache.annotation.CacheConfig;

import java.util.Set;

/**
 * @author juebing
 * @version v1.0
 * @date 2019/5/16 14:46
 * @description
 */
@CacheConfig(cacheNames = "user")
public interface UserService {

//    @Cacheable(key = "'userName'.concat(#userName)")
    SysUser findSysUserByUserName(String username);

    Set<String> queryRoleByUserId(Integer userId);

    Set<String> queryPermissionByUserId(Integer userId);
}