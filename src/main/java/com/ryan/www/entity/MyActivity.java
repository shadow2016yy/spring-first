package com.ryan.www.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by Ryan on 2018/11/14.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MyActivity extends BasicEntity {
    private int customerId;
    private int actId;
    private String actName;
    private int actType;
    private String actUrl;
    private Date startTime;
    private Date endTime;
    private int actStatus;
    private int showStatus;
    private String coverImg;
    private String config;
    private String introduction;

}
