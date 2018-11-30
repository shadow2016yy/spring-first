package com.ryan.www.groovy

/**
 * Created by Ryan on 2018/11/10.
 */
class BabyTest extends GroovyTestCase {

    void  testDisplay(){

        def baby = new Baby()
        baby.setSex(1)
        baby.setName("Ryan")
        println(baby.display())
       println( assertToString(baby.display(),"Ryan1"))

    }
}
