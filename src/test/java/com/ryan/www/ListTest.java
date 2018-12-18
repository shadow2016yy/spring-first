package com.ryan.www;

import org.assertj.core.util.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Ryan on 2018/12/14.
 */
public class ListTest {
    public static void main(String[] args) {
        List list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for (int i=0;i<list.size();i++){
            List innnerList= Lists.newArrayList();
            innnerList.add(list.get(i));
            System.out.println(innnerList);
        }
        List<String> stringList=Lists.newArrayList();
        stringList.add(null);
        System.out.println(stringList.size());

    }
}
