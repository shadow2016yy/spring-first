package com.ryan.www.groovy

/**
 * Created by Ryan on 2018/11/10.
 */
class MyTrait {
    trait  Mark{
        void show(){
            println("show")
        }
    }
     static class  Person implements Mark{
        int  id;
        String name;
    }

    public static void main(String[] args) {
        Person person= new Person()
        person.id=1
        person.show()
    }
}
