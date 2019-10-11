package com.ryan.www.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ryan on 2019/8/12.
 */
@RestController
@RequestMapping("/hytrix")
public class HytrixController {
    @RequestMapping("/hi")
//    @HystrixCommand(fallbackMethod = "hiFail")
    public String hi(String name){
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        throw new RuntimeException("test");
        return "hi "+name;
    }


    public String hiFail(String name){
        return "hiFail "+name;
    }

}
