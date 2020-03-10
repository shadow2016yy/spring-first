package com.ryan.www.thread;

import java.util.concurrent.locks.LockSupport;

public class TestPark {
    public void testPark(){
        //带有blocker参数的park方法，线程堆栈可以提供更多有关阻塞对象的信息
        LockSupport.park(this);
    }

    public static void main(String[] args) {
        TestPark testPark = new TestPark();
        testPark.testPark();
        //运行main方法后，jstack pid查看堆栈信息
    }
}
