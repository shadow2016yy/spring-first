package com.ryan.www;

import org.springframework.util.StopWatch;

/**
 * Created by Ryan on 2019/8/9.
 */
public class StopWatchTest {
    public static void main(String[] args) throws InterruptedException {
        StopWatch watch=new StopWatch();
        watch.start();
        Thread.sleep(10000L);
        watch.stop();
        System.out.println(watch.prettyPrint());
    }
}
