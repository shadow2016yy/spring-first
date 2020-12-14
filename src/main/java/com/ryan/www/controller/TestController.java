package com.ryan.www.controller;

import com.ryan.www.annotation.WebLog;
import com.ryan.www.dto.User;
import com.ryan.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
        redisTemplate.convertAndSend("chat","这个是发送的源消息");
        return  "Hello Spring boot!"+name;
    }

    @WebLog(description = "这个是一个测试类")
    @RequestMapping(value = "/test2",method = RequestMethod.GET)
    public String hell02(@RequestParam(name = "name") String name){
        return  "Hello Spring boot!呀呀呀"+name;
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

    @RequestMapping(value = "/testBaby",method = RequestMethod.GET)
    public String testBaby(){
        sendMessage();
        return"testBaby";
    }


    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@RequestBody@Validated User user){
        sendMessage();
        return"save success";
    }
    private  void sendMessage(){
        redisTemplate.convertAndSend("chat","这个是要发送的消息"+Math.random());
        redisTemplate.convertAndSend("wechat","这个是要发送的微信消息"+Math.random());


    }

}
