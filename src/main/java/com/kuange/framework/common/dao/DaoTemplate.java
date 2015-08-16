package com.kuange.framework.common.dao;

import java.util.List;

/**
 * Created by Administrator on 2015/8/16 0016.
 */
public interface DaoTemplate<T> {

    int deleteByPrimaryKey(Long id);

    int insert(T record);

    T selectByPrimaryKey(Long id);

    List<T> selectAll();

   int updateByPrimaryKey(T record);
}
