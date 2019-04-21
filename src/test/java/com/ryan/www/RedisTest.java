package com.ryan.www;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Ryan on 2018/11/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest   {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate hashRedisTemplate;
    @Autowired
    @Test
    public void  testHash(){
        HashOperations opsForHash = hashRedisTemplate.opsForHash();
//        Object o = opsForHash.get("map", "name");
//        Map<String,String> map=new HashMap<>();
//        map.put("kobe","Laker");
//        map.put("james","Laker");
//        map.put("jordan","Bull");
//        opsForHash.putAll("nbaStar",map);
        Object o = opsForHash.get("kobe", "nbaStar");
        System.out.println(o);
    }

    @Test
    public void  testString(){
        ValueOperations<String, String> opsForValue = stringRedisTemplate.opsForValue();
        String name = opsForValue.get("name");
        System.out.println(name);
    }

    @Test
    public void  testIncrease(){
        ValueOperations opsForValue = redisTemplate.opsForValue();
        Long aLong = opsForValue.increment("ryan2018", 1);
        System.out.println("现在的值是:"+aLong);
    }

    @Test
    public void testMultiIncrease(){
        ValueOperations<String,Integer> opsForValue = redisTemplate.opsForValue();
        opsForValue.set("testInviteCode",12);
//        ExecutorService service = Executors.newFixedThreadPool(100);
//        for (int i=0;i<20;i++){
//            service.execute(()->{
//                Long inviteCode = opsForValue.increment("testInviteCode", 1);
//                System.out.println("本次取出来的邀请码是：");
//                System.out.println("<<<<<<<<<<<<<<<<<<<<"+inviteCode);
//            });
//        }
        String key="thismy";
         Integer thismy = opsForValue.get(key);
         if (Objects.isNull(thismy)){
             opsForValue.set(key,123);
         }
        System.out.println(thismy);


    }
}
