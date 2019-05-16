package com.dbpf.nobug.database.mapper;

import com.dbpf.nobug.database.domain.RolePermissionRef;
import com.dbpf.nobug.database.domain.RolePermissionRefExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolePermissionRefMapper {
    int countByExample(RolePermissionRefExample example);

    int deleteByExample(RolePermissionRefExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RolePermissionRef record);

    int insertSelective(RolePermissionRef record);

    List<RolePermissionRef> selectByExample(RolePermissionRefExample example);

    RolePermissionRef selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RolePermissionRef record, @Param("example") RolePermissionRefExample example);

    int updateByExample(@Param("record") RolePermissionRef record, @Param("example") RolePermissionRefExample example);

    int updateByPrimaryKeySelective(RolePermissionRef record);

    int updateByPrimaryKey(RolePermissionRef record);
}