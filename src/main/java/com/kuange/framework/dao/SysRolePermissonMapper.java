package com.kuange.framework.dao;

import com.kuange.framework.model.SysRolePermisson;
import java.util.List;

public interface SysRolePermissonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRolePermisson record);

    SysRolePermisson selectByPrimaryKey(Long id);

    List<SysRolePermisson> selectAll();

    int updateByPrimaryKey(SysRolePermisson record);
}