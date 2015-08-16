package com.kuange.framework.dao;

import com.kuange.framework.model.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);
}