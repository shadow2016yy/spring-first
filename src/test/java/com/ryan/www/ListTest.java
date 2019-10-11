package com.ryan.www;

import org.assertj.core.util.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Ryan on 2018/12/14.
 */
public class ListTest {
    public static void main(String[] args) {
//        List list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        for (int i=0;i<list.size();i++){
//            List innnerList= Lists.newArrayList();
//            innnerList.add(list.get(i));
//            System.out.println(innnerList);
//        }
//        List<String> stringList=Lists.newArrayList();
//        stringList.add(null);
//        System.out.println(stringList.size());

        List<String> list=Lists.newArrayList();
        list.add("上海市");
        list.add("上海市");
        list.add("123456");

        List<Integer> integerList=Lists.newArrayList();
        list.forEach(c->{
            try{
                Number num = Float.parseFloat(c);
                integerList.add(num.intValue());
            }catch (Exception e){
                integerList.add(0);
            }

        });
        System.out.println(integerList);
        List<Integer> finalList=integerList.stream().filter(c->c>0).collect(Collectors.toList());
        System.out.println(finalList);

    }
}
