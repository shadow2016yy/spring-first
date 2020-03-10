package com.ryan.www.list;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArraylistTest {
    public static volatile CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        list.add("hello");
        list.add("shjd");
        list.add("weloclome");
        list.add("to");
        list.add("shanghai");
        Thread threadOne=new Thread(new Runnable() {
            @Override
            public void run() {
                list.set(1,"jd");
                list.remove(2);
                list.remove(3);
            }
        });
        //确保在线程启动前获取迭代器
        Iterator<String> iterator = list.iterator();
        threadOne.start();
        threadOne.join();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
      //运行结果说明了CopyOnWriteArrayList的弱一致性，迭代的是 初始的list的快照，其他线程对其修改不可见
    }
}
