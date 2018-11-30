package com.ryan.www.controller;

import com.ryan.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Ryan on 2018/6/12.
 */
@RestController
@RequestMapping("/ryan")
@ControllerAdvice
public class TestController {
    @Autowired
    private UserService userService;
    @Autowired
    private StringRedisTemplate redisTemplate;
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String hell0(){
        ValueOperations opsForValue = redisTemplate.opsForValue();
        Object name = opsForValue.get("name");
        System.out.println("测试redis缓存");
        return  "Hello Spring boot!"+name;
    }

    @RequestMapping(value = "/test2",method = RequestMethod.GET)
    public String hell02(){
        return  "Hello Spring boot!呀呀呀";
    }

    @RequestMapping(value = "/test3",method = RequestMethod.GET)
    public String hell03()throws Exception{
        throw new Exception("不知道怎么了！！！");
    }


    @RequestMapping(value = "/loadAll",method = RequestMethod.GET)
    public Object loadAll(){
        List<?> objects = userService.loadAll();
        return  objects;
    }

}
