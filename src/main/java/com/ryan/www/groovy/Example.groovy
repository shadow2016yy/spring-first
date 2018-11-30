package com.ryan.www.groovy

/**
 * Created by Ryan on 2018/11/8.
 */
class Example {
    static void main(String[] args) {
        def x = 5;
        println(x.getClass())
        println("Hello World!")
        //相当于定义了一个数组 其实类型是：class groovy.lang.IntRange
        def  range=5..10
        println(range)
        println(range.getClass())
        println(range.get(0))
        List list=Arrays.asList(1,5,7,9)
        for (k in list){
            println(k)
        }
        println("foreach循环试试")
        list.each {
            k->println(k)
        }

    }
}
