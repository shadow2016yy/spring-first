package com.ryan.www.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * Created by Ryan on 2018/11/28.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private Integer sex;
    @NotEmpty(message = "名字不能为空")
    private String name;
    @Min(value=1)
    private int amout;
}
