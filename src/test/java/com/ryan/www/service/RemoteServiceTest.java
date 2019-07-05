package com.ryan.www.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Ryan on 2019/7/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RemoteServiceTest  {
    @Autowired
    private RemoteService remoteService;

    @Test
    public void  testRetry() throws Exception {
       remoteService.call();

    }
}
