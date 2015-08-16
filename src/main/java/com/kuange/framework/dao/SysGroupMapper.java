package com.kuange.framework.dao;

import com.kuange.framework.model.SysGroup;
import com.kuange.framework.model.SysGroup;
import java.util.List;

public interface SysGroupMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysGroup record);

    SysGroup selectByPrimaryKey(Long id);

    List<SysGroup> selectAll();

    int updateByPrimaryKey(SysGroup record);
}