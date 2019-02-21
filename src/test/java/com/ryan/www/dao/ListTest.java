package com.ryan.www.dao;

import com.ryan.www.dto.Person;
import org.assertj.core.util.Lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Created by Ryan on 2019/1/26.
 */
public class ListTest {
    public static void main(String[] args) {
        List<Person> list= Lists.newArrayList();
        Person person1=Person.builder().age(10).gender(1).name("kobe").build();
        list.add(person1);
        Person person2=Person.builder().age(15).gender(2).name("james").build();
        list.add(person2);
        Person person3=Person.builder().age(10).gender(2).name("kobe").build();
        list.add(person3);
        list.clear();
        ArrayList<Person> collect = list.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Person::getName))), ArrayList::new));
//        List<Person> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
