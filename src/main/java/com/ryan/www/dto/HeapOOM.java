package com.ryan.www.dto;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by Ryan on 2018/11/11.
 */
public class HeapOOM {
    static class OOMObject{}

    public static void main(String[] args) {
        List list= Lists.newArrayList();
        while (true){
            list.add(new OOMObject());
        }
    }
}
