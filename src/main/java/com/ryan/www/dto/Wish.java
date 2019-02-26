package com.ryan.www.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Ryan on 2019/2/21.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Wish {
    private int id;
    private int schedule;
    private String keywrd;
    private String product;
    private int amomut;
}
