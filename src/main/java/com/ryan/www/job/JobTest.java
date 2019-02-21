package com.ryan.www.job;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by Ryan on 2019/1/24.
 */
@Configuration
public class JobTest {
    @Scheduled(cron = "0/10 * * * * ?")
    public void  testJob(){
        System.out.println("测试job执行");
    }
}
