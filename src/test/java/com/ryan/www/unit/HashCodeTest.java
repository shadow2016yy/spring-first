package com.ryan.www.unit;

import com.ryan.www.dto.Item;

import java.util.Objects;

/**
 * Created by Ryan on 2019/5/31.
 */
public class HashCodeTest {
    public static void main(String[] args) {

        Item item=Item.builder()
                .id(1)
                .name("三国演义")
                .beginTime("20190101")
                .endTime("20191231")
                .build();
        int hashCode = item.hashCode();
        System.out.println(hashCode);
        int code = Objects.hashCode(item);
        System.out.println(code);
        int value=10;
        System.out.println(--value);

    }
}
