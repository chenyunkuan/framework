package com.kuange.framework.dao;

import com.kuange.framework.model.SysResourceMenu;
import com.kuange.framework.model.SysResourceMenu;
import java.util.List;

public interface SysResourceMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysResourceMenu record);

    SysResourceMenu selectByPrimaryKey(Long id);

    List<SysResourceMenu> selectAll();

    int updateByPrimaryKey(SysResourceMenu record);
}