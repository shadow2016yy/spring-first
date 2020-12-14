package com.ryan.www;

import java.util.concurrent.CountDownLatch;

/**
 * created by  Ryan on  2020-07-02-23:34
 */
public class CountDownLatchTest {
    public static void main(String[] args) {
        usingCountDownLatch();
    }

    private static void usingCountDownLatch() {
        Thread[] threads = new Thread[100];
        CountDownLatch countDownLatch = new CountDownLatch(threads.length);
        System.out.println(countDownLatch.getCount());
        for (int i=0;i<threads.length;i++){
            threads[i]=new Thread(()->{
                int result=0;
                for (int j=0;j<10000;j++){
                    result+=j;
                }
                countDownLatch.countDown();
            });
        }

        for (int i=0;i<threads.length;i++){
            threads[i].start();
        }

        try{
            countDownLatch.await();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("end latch");
    }
}
