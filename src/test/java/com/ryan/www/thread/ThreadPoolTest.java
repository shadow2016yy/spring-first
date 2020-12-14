package com.ryan.www.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * created by  Ryan on  2020-07-16-19:16
 */
public class ThreadPoolTest {
    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(100, 120, 1800, TimeUnit.SECONDS, new ArrayBlockingQueue(10));
        for (int i=0;i<120;i++){
            int j=i+1;
            executor.execute(()->write(j));
        }


        executor.shutdown();
    }

    private static void write(int arg){
        System.out.println(arg);
    }
}
