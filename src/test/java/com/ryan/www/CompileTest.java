package com.ryan.www;

/**
 * Created by Ryan on 2018/12/4.
 */
public class CompileTest {
    public static void main(String[] args) {
        //局部变量未初始化  就使用  会导致编译失败
        int a=10;
        System.out.println(a);
    }
}
