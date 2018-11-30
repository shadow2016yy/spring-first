package com.ryan.www;

import com.ryan.www.dto.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ryan on 2018/11/30.
 */
public class DeadCycleTest {
    public static void main(String[] args) {
        List list=new ArrayList();
        while (true){
            list.add(new Person());
        }
    }
}
