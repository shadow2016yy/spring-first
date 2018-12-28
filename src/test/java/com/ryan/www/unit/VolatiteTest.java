package com.ryan.www.unit;

import java.util.concurrent.locks.Lock;

/**
 * Created by Ryan on 2018/12/18.
 */
public class VolatiteTest {
    public static volatile  int race=0;

    public static void increase(){
        race++;
    }
    public static final int THREAD_COUNT=20;

    public static void main(String[] args) {
        Thread[] threads=new Thread[THREAD_COUNT];
        for (int i=0;i<THREAD_COUNT;i++){
            threads[i]=new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0;i<10000;i++){
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        System.out.println(race);

//        while (Thread.activeCount()>1){
//            Thread.yield();
//            System.out.println(race);
//        }
    }
}
