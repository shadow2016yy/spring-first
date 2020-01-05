package com.ryan.www.thread;

public class DaemonTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (; ; ) {

                }
            }
        });
        //将线程设置为守护线程以后 当main线程结束之后 jvm就会正常退出
        thread.setDaemon(true);
        thread.start();
        System.out.println("main thread is over");
    }
}
