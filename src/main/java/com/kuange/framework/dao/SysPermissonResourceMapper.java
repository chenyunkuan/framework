package com.kuange.framework.dao;

import com.kuange.framework.model.SysPermissonResource;
import com.kuange.framework.model.SysPermissonResource;
import java.util.List;

public interface SysPermissonResourceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysPermissonResource record);

    SysPermissonResource selectByPrimaryKey(Long id);

    List<SysPermissonResource> selectAll();

    int updateByPrimaryKey(SysPermissonResource record);
}