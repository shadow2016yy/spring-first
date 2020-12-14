package com.ryan.www.service;

import org.springframework.stereotype.Component;

/**
 * created by  Ryan on  2020-08-06-11:43
 */
@Component
public class DemoServiceImpl2 implements DemoServive {
    @Override
    public void execute() {
        System.out.println("这个是DemoServiceImpl2实现");
    }
}
