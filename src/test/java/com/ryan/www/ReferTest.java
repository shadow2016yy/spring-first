package com.ryan.www;

import com.ryan.www.dto.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * created by  Ryan on  2020-09-04-00:51
 */
public class ReferTest {
    public static Student getStudent(){
        Student student = new Student();
        student.setAge(12);
        student.setInterest("撸代码");
        System.out.println("原来学生对象的hashcode："+student.hashCode());
        return student;
    }
    public static void main(String[] args) {
        Student student = getStudent();
        student.setAge(24);
        System.out.println("方法传递之后的学生对象hashcode:"+student.hashCode());
//        student.
        System.out.println(student.getAge());
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

    }
}
