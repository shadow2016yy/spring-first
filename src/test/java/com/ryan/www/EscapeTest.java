package com.ryan.www;


/**
 * @author Ryan
 * created on  2020-12-03-12:50
 */
public class EscapeTest {
    public static void main(String[] args) {
        Integer origin =1;
        add(origin);
        System.out.println(origin);
    }
    public static void  add(Integer a){
        add2(a);
    }
    public static void  add2(Integer a){
        a=a+2;

    }
}
