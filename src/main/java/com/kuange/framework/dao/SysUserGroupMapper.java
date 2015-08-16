package com.kuange.framework.dao;

import com.kuange.framework.model.SysUserGroup;
import java.util.List;

public interface SysUserGroupMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserGroup record);

    SysUserGroup selectByPrimaryKey(Long id);

    List<SysUserGroup> selectAll();

    int updateByPrimaryKey(SysUserGroup record);
}