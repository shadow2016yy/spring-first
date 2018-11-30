package com.ryan.www.groovy
import groovy.json.JsonSlurper

/**
 * Created by Ryan on 2018/11/10.
 */
class JsonTest {
    public static void main(String[] args) {
        def slurper = new JsonSlurper()
        def text = slurper.parseText('{"name":"kobe","age":24}')
        println(text.name)
        println(text.age)
        def text1 = slurper.parseText('{"list":[1,2,3,4,5]}')
        text1.each { println( it)}
        def  list=[12,34,56]
        println list

    }

}
