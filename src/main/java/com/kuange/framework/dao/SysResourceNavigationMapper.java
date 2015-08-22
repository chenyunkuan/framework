package com.kuange.framework.dao;

import com.kuange.framework.model.SysResourceNavigation;
import java.util.List;

public interface SysResourceNavigationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysResourceNavigation record);

    SysResourceNavigation selectByPrimaryKey(Long id);

    List<SysResourceNavigation> selectAll();

    int updateByPrimaryKey(SysResourceNavigation record);
}