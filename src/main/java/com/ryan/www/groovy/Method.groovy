package com.ryan.www.groovy

/**
 * Created by Ryan on 2018/11/8.
 */
class Method {
    static def  call(){
        println("just do it")
        println("come on")
    }
    static def  sum(int a,int b){
        return a+b
    }
    static def newSum(int a ,int  b=5){
        return a+b
    }
    public static void main(String[] args) {
        call()
        println(sum(1,9))
        println(newSum(9))
    }
}
