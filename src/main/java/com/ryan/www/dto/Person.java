package com.ryan.www.dto;

import com.ryan.www.aspect.BusinessLog;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Ryan on 2018/8/23.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @BusinessLog("这个展示的是名字")
    private  String name;
    private  int gender;
    private  int age;
}
