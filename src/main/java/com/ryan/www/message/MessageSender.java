package com.ryan.www.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Ryan on 2018/12/3.
 */
@EnableScheduling
@Component
public class MessageSender {
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//
//    @Scheduled(fixedRate = 2000) //间隔2s 通过StringRedisTemplate对象向redis消息队列chat频道发布消息
//    public void sendMessage(){
//        stringRedisTemplate.convertAndSend("chat",String.valueOf(Math.random()));
//    }

}
