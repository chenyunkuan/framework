package com.kuange.framework.dao;

import com.kuange.framework.model.SysResourceElement;
import com.kuange.framework.model.SysResourceElement;
import java.util.List;

public interface SysResourceElementMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysResourceElement record);

    SysResourceElement selectByPrimaryKey(Long id);

    List<SysResourceElement> selectAll();

    int updateByPrimaryKey(SysResourceElement record);
}