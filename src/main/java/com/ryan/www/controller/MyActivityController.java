package com.ryan.www.controller;

import com.ryan.www.aspect.BusinessLog;
import com.ryan.www.entity.MyActivity;
import com.ryan.www.service.MyActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Ryan on 2018/11/14.
 */
@RestController
@RequestMapping("/myActivity")
public class MyActivityController {
    @Autowired
    private MyActivityService myActivityService;

    @RequestMapping(value = "/loadAll",method = RequestMethod.GET)
    @BusinessLog("查询所有活动")
    public Object loadAll(){
        List<MyActivity> myActivityDtos = myActivityService.loadByCustomerId(3);
        return  myActivityDtos;
    }
}
