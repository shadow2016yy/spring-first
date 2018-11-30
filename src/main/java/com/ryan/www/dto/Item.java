package com.ryan.www.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by Ryan on 2018/9/23.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Item implements Serializable {
    private  String beginTime;
    private String endTime;
}
