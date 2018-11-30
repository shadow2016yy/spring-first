package com.ryan.www;

import com.ryan.www.aspect.BusinessLog;

import java.util.Objects;

/**
 * Created by Ryan on 2018/8/22.
 */
public class ForTest {
    @BusinessLog("for循环单元测试")
    public static void main(String[] args) {
        int count=3;
//        for (int i=0;i<count;i+=10000){
//            System.out.println("入参");
//            System.out.println(i);
//            if (i+10000>count){
//                System.out.println(count-i);
//            }
//        }
        System.out.println(Objects.isNull(""));


    }
}
