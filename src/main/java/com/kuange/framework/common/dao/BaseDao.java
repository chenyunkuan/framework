package com.kuange.framework.common.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Administrator on 2015/8/16 0016.
 */
public abstract class BaseDao{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public List<Map<String,Objects>> selectBySql(){
       return this.sqlSessionTemplate.selectList("");
    }
}
