package com.ryan.www.service;

import com.ryan.www.aspect.SelfAdvice;
import com.ryan.www.entity.MyActivity;
import com.ryan.www.service.impl.MyActivityServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Ryan on 2018/11/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyActivityServiceTest  {
    @Autowired
    private MyActivityService myActivityService;
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testLoadAll(){
        List<MyActivity> myActivities = myActivityService.loadByCustomerId(3);
        System.out.println(myActivities.size());
        myActivities.forEach(c-> System.out.println(c));
    }

//    @Test
//    public void  testIntRedis(){
//        ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
//        String ryan = opsForValue.get("ryan");
//        System.out.println(ryan);
//    }

    @Test
    public void  testAdvice(){
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new MyActivityServiceImpl() );
        proxyFactory.addAdvice(new SelfAdvice());
        MyActivityService service = (MyActivityService) proxyFactory.getProxy();
        service.loadByCustomerId(3);
    }


}
