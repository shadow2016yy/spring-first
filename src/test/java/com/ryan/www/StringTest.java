package com.ryan.www;

import com.ryan.www.dto.Person;

/**
 * Created by Ryan on 2018/10/10.
 */
public class StringTest {
    public static void main(String[] args) {
        Person person=new Person();
        Class<? extends Person> personClass = person.getClass();
        //类名是包含了包的完整路径
        String name = personClass.getName();
        System.out.println("类名:"+name);
        System.out.println(name.substring(name.lastIndexOf(".")+1));
    }
}
