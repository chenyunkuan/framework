package com.kuange.framework.dao;

import com.kuange.framework.model.SysUserPermisson;
import com.kuange.framework.model.SysUserPermisson;
import java.util.List;

public interface SysUserPermissonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserPermisson record);

    SysUserPermisson selectByPrimaryKey(Long id);

    List<SysUserPermisson> selectAll();

    int updateByPrimaryKey(SysUserPermisson record);
}