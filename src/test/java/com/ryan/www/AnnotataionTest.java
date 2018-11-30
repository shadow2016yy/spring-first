package com.ryan.www;

import com.ryan.www.aspect.BusinessLog;
import com.ryan.www.dto.Person;

import java.lang.reflect.Field;

/**
 * Created by Ryan on 2018/11/14.
 */
public class AnnotataionTest {
    public static void main(String[] args) {
        Person person = new Person();
        Field[] fields = Person.class.getDeclaredFields();
        for (Field field:fields){
            if (field.isAnnotationPresent(BusinessLog.class)){
                BusinessLog log = field.getAnnotation(BusinessLog.class);
                System.out.println(log);
                System.out.println(log.value());
            }
        }
    }
}
