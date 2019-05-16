package com.dbpf.nobug.database.mapper;

import com.dbpf.nobug.database.domain.UserRoleRef;
import com.dbpf.nobug.database.domain.UserRoleRefExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserRoleRefMapper {
    int countByExample(UserRoleRefExample example);

    int deleteByExample(UserRoleRefExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserRoleRef record);

    int insertSelective(UserRoleRef record);

    List<UserRoleRef> selectByExample(UserRoleRefExample example);

    UserRoleRef selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserRoleRef record, @Param("example") UserRoleRefExample example);

    int updateByExample(@Param("record") UserRoleRef record, @Param("example") UserRoleRefExample example);

    int updateByPrimaryKeySelective(UserRoleRef record);

    int updateByPrimaryKey(UserRoleRef record);
}