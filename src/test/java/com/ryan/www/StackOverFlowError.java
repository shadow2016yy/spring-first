package com.ryan.www;

/**
 * @author Ryan
 * created on  2020-11-27-15:02
 */
public class StackOverFlowError {
    public static void main(String[] args) {
        go();
    }

    public static void  go(){
        go();
    }
}
