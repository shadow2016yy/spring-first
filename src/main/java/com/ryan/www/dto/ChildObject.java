package com.ryan.www.dto;

/**
 * Created by Ryan on 2018/11/28.
 */
public class ChildObject extends SuperObject {
    static {
        System.out.println("子类初始化");
    }

    public static void main(String[] args) {
        System.out.println(ChildObject.age);
    }
}
