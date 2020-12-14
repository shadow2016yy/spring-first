package com.ryan.www.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * created by  Ryan on  2020-07-21-23:34
 */
public class CacheThreadPoolTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        System.out.println(executorService);
        for (int i = 0; i < 5; i++) {
            executorService.execute(() -> {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            });

        }
        System.out.println(executorService);
        Thread.sleep(80);
        System.out.println(executorService);

    }
}
