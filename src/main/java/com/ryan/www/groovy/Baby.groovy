package com.ryan.www.groovy

/**
 * Created by Ryan on 2018/11/10.
 */
class Baby {
    int  age
    String name
    int sex
    def display(){
        return name+sex
    }


    static void main(String[] args) {
        def baby = new Baby()
        println(baby.metaClass)
        println(baby.getClass())
        baby.setAge(12)
        baby.setName("kobe")
        baby.setSex(2)

        println(baby.display())

    }
}
