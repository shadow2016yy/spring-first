package com.ryan.www;

import com.ryan.www.dto.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Ryan on 2018/8/23.
 */
public class ReflectTest {
    public static void main(String[] args) throws IllegalAccessException {

        Person person=Person.builder().age(12).gender(0).name("苏菲玛索").build();
        Field[] fields = person.getClass().getDeclaredFields();
        for (Field field:fields){
            field.setAccessible(true);
            System.out.println(field.getName()+">>>"+field.get(person));
        }
        Method[] methods = person.getClass().getDeclaredMethods();
        for (Method method:methods){
            method.setAccessible(true);
            System.out.println(method.getName()+"<<<<<<<<<<<<<"+method.getTypeParameters());
        }

    }
}
