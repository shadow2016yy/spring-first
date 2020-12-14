package com.ryan.www;

import org.joda.time.DateTime;

import java.util.*;

/**
 * created by  Ryan on  2020-08-11-10:22
 */
public class SignTest {

    public static int getLongDay(List<Integer> list) {
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();
        //先获取连续中断的位置，放在list2中
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                break;
            } else if (list.get(i + 1) - list.get(i) != 1) {
                list2.add(i);
            }
        }
        //通过判断获取连续的个数，在list3中取最大值即可。
        if (0 == list2.size()) {
            return list.size();
        } else {
            for (int i = 0; i < list2.size(); i++) {
                if (1 == list2.size()) {
                    list3.add(list2.get(0) + 1);
                    list3.add(list.size() - 1 - list2.get(i));
                } else {
                    if (i == 0) {
                        list3.add(list2.get(0) + 1);
                        list3.add(list2.get(i + 1) - list2.get(i));
                    } else if (i == list2.size() - 1) {
                        list3.add(list.size() - 1 - list2.get(i));
                    } else {
                        list3.add(list2.get(i + 1) - list2.get(i));
                    }
                }
            }
            return Collections.max(list3);
        }

    }

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5,7,9,10);
        int longDay = getLongDay(list);
        System.out.println("最大连续签到天数是:"+longDay);
        Date date=new Date();
        DateTime dateTime = new DateTime(date.getTime());
        String s = dateTime.toString("yyyyMMdd");
        System.out.println(s);
        int i = Integer.parseInt(s);
        System.out.println(i);


    }

}
