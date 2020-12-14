package com.ryan.www;

import com.ryan.www.service.DemoServive;
import sun.misc.Service;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * created by  Ryan on  2020-08-06-11:45
 */
public class SpiTest {
    public static void main(String[] args) {
        Iterator<DemoServive> providers = Service.providers(DemoServive.class);
        while (providers.hasNext()){
            DemoServive next = providers.next();
            next.execute();
        }
        System.out.println("我是华丽的分割线-----------------");
        ServiceLoader<DemoServive> servives = ServiceLoader.load(DemoServive.class);
        Iterator<DemoServive> iterator = servives.iterator();
        while (iterator.hasNext()){
            DemoServive next = iterator.next();
            next.execute();
        }

        int i=8;
        i=i++;
        System.out.println(i);
    }
}
