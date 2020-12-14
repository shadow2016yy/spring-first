package com.ryan.www.service;

import org.springframework.stereotype.Component;

/**
 * created by  Ryan on  2020-08-06-11:42
 */
@Component
public class DemoServiceImpl1 implements DemoServive {
    @Override
    public void execute() {
        System.out.println("这个是DemoServiceImpl1实现");
    }
}
