package com.dbpf.nobug.service.impl;

import com.dbpf.nobug.database.dto.SysUser;
import com.dbpf.nobug.database.mapper.AuthorizationMapper;
import com.dbpf.nobug.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author juebing
 * @version v1.0
 * @date 2019/5/16 14:54
 * @description
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private AuthorizationMapper authorizationMapper;

    @Override
    public SysUser findSysUserByUserName(String username) {
        SysUser result = new SysUser();
        if(StringUtils.isNotBlank(username)) {
            result = authorizationMapper.findSysUserByUsername(StringUtils.trim(username));
        }
        return result;
    }

    @Override
    public Set<String> queryRoleByUserId(Integer userId) {
        Set<String> result = new HashSet<String>();
        if (userId != null) {
            List<String> list = authorizationMapper.queryRoleByUserId(userId);
            for (String s : list) {
                result.add(s);
            }
        }

        return result;
    }

    @Override
    public Set<String> queryPermissionByUserId(Integer userId) {
        Set<String> result = new HashSet<String>();
        if (userId != null) {
            List<String> list = authorizationMapper
                    .queryPermissionByUserId(userId);
            for (String s : list) {
                result.add(s);
            }
        }
        return result;
    }
}