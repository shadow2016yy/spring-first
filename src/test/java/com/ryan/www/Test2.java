package com.ryan.www;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ryan
 * created on  2020-12-13-18:19
 */
public class Test2 {



    private static List<String> sort(String input) {
        List<String> sortList = new ArrayList();
        if (input == null || "".equals(input)) {
            System.out.println("提示：您输入了空字符,请输入有效值！");
            return new ArrayList();
        }
        char leftChar = input.charAt(0);
        if (input.length() > 1) {
            String rightString = input.substring(1, input.length());
            List<String> rightStringSortedList = sort(rightString);
//            rightStringSortedList.forEach((e) -> {
//                for (int i = 0; i < e.length() + 1; i++) {
//                    sortList.add(new StringBuffer(e).insert(i, leftChar).toString());
//                }
//            });
            for (String str:rightStringSortedList){
                for (int i = 0; i < str.length() + 1; i++) {
                    sortList.add(new StringBuffer(str).insert(i, leftChar).toString());
                }
            }
        } else {
            sortList.add(String.valueOf(leftChar));
        }
        return sortList;
    }


    public static void main(String[] args) {
        String s="abcde";
        List<String> sort = sort(s);
//        sort.stream().forEach(c-> System.out.println(c));
        HashSet<String> strings = new HashSet<>(sort);
        strings.stream().sorted();
        strings.forEach(c-> System.out.println(c));
        System.out.println("总共的组合是："+strings.size());
    }
}

