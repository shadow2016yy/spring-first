package com.ryan.www;

import java.util.Map;
import java.util.Set;

/**
 * Created by Ryan on 2018/11/18.
 */
public class ThreadTest {
    public static void main(String[] args) {
        Set<Map.Entry<Thread, StackTraceElement[]>> entries = Thread.getAllStackTraces().entrySet();
        for (Map.Entry<Thread, StackTraceElement[]> element:entries){
            Thread thread = element.getKey();
            StackTraceElement[] value = element.getValue();
            if (thread.equals(Thread.currentThread())){
                continue;
            }
            System.out.println("当前线程是:"+thread.getName());
            for (StackTraceElement stackTraceElement:value){
                System.out.println(stackTraceElement);
            }
        }
    }
}
