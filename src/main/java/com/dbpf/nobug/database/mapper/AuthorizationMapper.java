package com.dbpf.nobug.database.mapper;

import com.dbpf.nobug.database.dto.AuthInfo;
import com.dbpf.nobug.database.dto.CusUser;
import com.dbpf.nobug.database.dto.Menu;
import com.dbpf.nobug.database.dto.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthorizationMapper {

	List<Menu> findMenusByUserId(Integer userId);
	
	List<AuthInfo> findAuthInfos(@Param("userId") Integer userId, @Param("roleName") String roleName);

	List<String> queryRoleByUserId(@Param("userId") Integer userId);

	List<String> queryPermissionByUserId(@Param("userId") Integer userId);

	SysUser findSysUserByUsername(@Param("username") String username);
	
	CusUser findCusUserByAccount(@Param("account") String account);

}
