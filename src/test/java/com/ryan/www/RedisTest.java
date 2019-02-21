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

import java.util.HashMap;
import java.util.Map;

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
}
