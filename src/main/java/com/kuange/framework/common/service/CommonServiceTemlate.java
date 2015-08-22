package com.kuange.framework.common.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/8/20.
 */
public interface CommonServiceTemlate<T> {

    T queryById(Long id);

    List<T> queryListByMap(Map<String,Object> params);

    void createEntity(T entity);

    void deleteEntity(Long id);

    void updateEntity(T entity);
}
