package com.kuange.framework.service.impl;

import com.kuange.framework.dao.SysUserMapper;
import com.kuange.framework.dao.SysUserMapper;
import com.kuange.framework.model.SysUser;
import com.kuange.framework.service.SysUserService;
import com.kuange.framework.model.SysUser;
import com.kuange.framework.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/8/15 0015.
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public SysUser queryById(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    public List<SysUser> queryListByMap(Map<String, Object> params) {
        return null;
    }

    public void createEntity(SysUser entity) {
        sysUserMapper.insert(entity);
    }

    public void deleteEntity(Long id) {
        sysUserMapper.deleteByPrimaryKey(id);
    }

    public void updateEntity(SysUser entity) {
        sysUserMapper.updateByPrimaryKey(entity);
    }
}
