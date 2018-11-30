package com.ryan.www;

import com.ryan.www.dto.Item;
import org.assertj.core.util.Lists;

import java.util.List;

/**
 * Created by Ryan on 2018/9/23.
 */
public class TimeUtils {

    public  static  List  splitTime(String beginTime,String endTime){
        List<Item> list= Lists.newArrayList();
        char[] endChars = endTime.toCharArray();
        int endTimeNew = (endChars[0] - '0') * 10 + endChars[1] - '0';
        char[] beginChars = beginTime.toCharArray();
        for (int i = 1; i < 24; i++) {
            int newTime = (beginChars[0] - '0') * 10 + beginChars[1] - '0' + i;
            if (newTime <= endTimeNew) {
               Item item = Item.builder()
                        .beginTime(getStrTime(newTime - 1))
                        .endTime(getStrTime(newTime))
                        .build();
                list.add(item);
            }else {
                break;
            }
        }
        return list;
    }

    private static String getStrTime(int time) {
        String newTime = time + "";
        if (newTime.length() < 2) {
            newTime = "0" + newTime + ":00";
        } else {
            newTime = newTime + ":00";
        }
        return newTime;
    }

    }


