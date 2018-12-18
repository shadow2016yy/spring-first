package com.ryan.www;

import com.ryan.www.dto.Item;
import org.assertj.core.util.Lists;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Ryan on 2018/12/12.
 */
public class FunctionTest {
    public static void main(String[] args) {
        List list= Lists.newArrayList();
        list.add(Item.builder().id(1).name("kobe").build());
        list.add(Item.builder().id(3).name("jorda ").build());
        list.add(Item.builder().id(4).name("wade").build());
        list.add(Item.builder().id(2).name("james").build());
        Map<Object,Object> map = ( Map) list.stream().collect(Collectors.toMap(Item::getId, Function.identity()));
        for (Object object:map.keySet()){
            System.out.println("key是："+object+"对应value是："+map.get(object));

        }

    }
}
