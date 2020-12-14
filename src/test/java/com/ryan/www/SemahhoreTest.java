package com.ryan.www;

import java.util.concurrent.Semaphore;

/**
 * created by  Ryan on  2020-07-04-15:53
 */
public class SemahhoreTest {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1, true);
//        Semaphore semaphore = new Semaphore(2, true);
        new Thread(()->{
            try {
                semaphore.acquire();
                System.out.println("T1 is running");
                Thread.sleep(3000);
                System.out.println("T1 is running");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
        }).start();

        new Thread(()->{
            try {
                semaphore.acquire();
                System.out.println("T2 is running");
                Thread.sleep(3000);
                System.out.println("T2 is running");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
        }).start();
    }
}
