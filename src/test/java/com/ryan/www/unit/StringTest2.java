package com.ryan.www.unit;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * Created by Ryan on 2019/4/18.
 */
public class StringTest2 {
    public static void main(String[] args) {
        String source="['kobe','james','duant']";
        List<String> list = JSON.parseArray(source, String.class);
        System.out.println(list);
    }
}
