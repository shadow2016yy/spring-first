package com.ryan.www.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * created by  Ryan on  2020-07-12-11:02
 */
public class AQSTest {
    private static volatile  int i=0;
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        i++;
        reentrantLock.unlock();
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
