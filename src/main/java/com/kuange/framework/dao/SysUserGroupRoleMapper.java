package com.kuange.framework.dao;

import com.kuange.framework.model.SysUserGroupRole;
import java.util.List;

public interface SysUserGroupRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserGroupRole record);

    SysUserGroupRole selectByPrimaryKey(Long id);

    List<SysUserGroupRole> selectAll();

    int updateByPrimaryKey(SysUserGroupRole record);
}