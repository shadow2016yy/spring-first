package com.ryan.www.service.impl;

import com.ryan.www.dao.MyActivityDao;
import com.ryan.www.entity.MyActivity;
import com.ryan.www.service.MyActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ryan on 2018/11/14.
 */
@Service
public class MyActivityServiceImpl implements MyActivityService {
    @Autowired
    private MyActivityDao dao;
    @Override
    public List<MyActivity> loadByCustomerId(int customerId) {

        return dao.loadAllByCustomerId(customerId);
    }
}
