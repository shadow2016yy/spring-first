package com.ryan.www;

/**
 * created by  Ryan on  2020-09-18-01:05
 */
public class StringInternTest {
    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern()==str1);
        String str2 = new StringBuilder("ko").append("be").toString();
        System.out.println(str2.intern()==str2);

    }
}
