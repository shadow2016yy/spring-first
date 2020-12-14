package com.ryan.www.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * created by  Ryan on  2020-07-21-23:26
 */
public class SignalThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i=0;i<5;i++){
            executorService.execute(()->{
                int j=10;
                System.out.println(j+" "+Thread.currentThread().getName());
            });

        }
    }
}
