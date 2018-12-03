package com.ryan.www.dao;

import com.ryan.www.entity.BasicEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Ryan on 2018/12/3.
 */
public interface BasicDao<T extends BasicEntity> {
    public T findById(Integer id);

    public int create(T entity);

    public void update(T entity);

    public void delete(T entity);

    void batchCreate(@Param("list") List<T> list);

    void batchDelete(@Param("list") List<T> list);
}
