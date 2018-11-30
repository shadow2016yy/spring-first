package com.ryan.www.service;

import com.ryan.www.entity.MyActivity;

import java.util.List;

/**
 * Created by Ryan on 2018/11/14.
 */
public interface MyActivityService {
    /**
     * 查询品牌所有活动
     * @param customerId
     * @return
     */
    List<MyActivity> loadByCustomerId(int customerId);
}
