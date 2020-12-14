package com.ryan.www;

/**
 * created by  Ryan on  2020-09-17-18:07
 */
public class CpuTest {
    static boolean flag = true;

    public static void main(String[] args) {

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                while (flag) {
                    System.out.println("线程1执行");
//                    try {
//                        Thread.sleep(0);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println("线程1退出循环");
                }
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                System.out.println("线程2执行");
                flag = false;
            }
        };
        thread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }


}
