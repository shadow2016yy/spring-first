package com.ryan.www.service.impl;

import com.ryan.www.dao.MyActivityDao;
import com.ryan.www.entity.MyActivity;
import com.ryan.www.service.MyActivityService;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ryan on 2018/11/14.
 */
@Service
public class MyActivityServiceImpl implements MyActivityService {
    @Autowired
    private MyActivityDao dao;
//    @Autowired
//    private RedissonClient redissonClient;

    @Override
    public List<MyActivity> loadByCustomerId(int customerId) {

        return dao.loadAllByCustomerId(customerId);
    }

    @Override
    public void save(MyActivity myActivity) {
//        RLock lock = redissonClient.getLock(myActivity.getActType() + "");
//        try {
//            if (lock.tryLock(0, 10, TimeUnit.SECONDS)) {
//                System.out.println("哇哇 我获取到锁了");
//                try {
//                    dao.create(myActivity);
//                } finally {
//                    //释放锁
//                    lock.unlock();
//                }
//            }
//
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
    }
}
