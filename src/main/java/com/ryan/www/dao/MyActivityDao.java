package com.ryan.www.dao;

import com.ryan.www.entity.MyActivity;

import java.util.List;

/**
 * Created by Ryan on 2018/11/14.
 */
public interface MyActivityDao  {
    /**
     * 根据customerId读取所有活动
     * @param customerId
     * @return
     */
    List<MyActivity> loadAllByCustomerId(int customerId);

    void  create(MyActivity myActivity);
}
