package com.ryan.www.unit;

import com.mysql.jdbc.StringUtils;
import com.ryan.www.dto.Wish;
import org.assertj.core.util.Lists;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Ryan on 2019/2/21.
 */
public class StringTest {
    public static void main(String[] args) {

        String myWish="我的2019年愿望是生日快乐，一夜暴富，迎娶媳妇";
        if ("".equals(myWish)){return;}
        List<Wish> wishes = getInitData();
        //如果为true 就应该结束匹配了  把匹配到的礼物给到用户
        //这里要预扣减库存 然后保存数据到数据库
//        wishes.forEach(c->match(myWish,c));
        boolean result=false;
        int count=0;
        for (Wish wish:wishes){
            count++;
            if (myWish.contains(wish.getKeywrd())&&wish.getAmomut()>0){
                wish.setAmomut(wish.getAmomut()-1);
                System.out.println("此时匹配到的关键词是："+wish.getKeywrd());
                result=true;
                break;
            }
        }
        if (!result){
            System.out.println("规则匹配不到 送默认券");
        }
        System.out.println("总共匹配了"+count);

    }

    private static  boolean match(String userWish,Wish wish){
        boolean result=false;
        if (userWish.contains(wish.getKeywrd())&&wish.getAmomut()>0){
            wish.setAmomut(wish.getAmomut()-1);
            System.out.println("此时匹配到的关键词是："+wish.getKeywrd());
            result=true;
        }
        return  result;
    }

    public static List<Wish>  getInitData(){
        List<Wish> list= Lists.newArrayList();
        Wish wish=Wish.builder().id(1).schedule(1).keywrd("暴富").product("产品1").amomut(0).build();
        list.add(wish);
        Wish wish2=Wish.builder().id(2).schedule(2).keywrd("高富帅").product("产品2").amomut(2).build();
        list.add(wish2);
        Wish wish3=Wish.builder().id(3).schedule(3).keywrd("娶媳妇").product("产品3").amomut(2).build();
        list.add(wish3);
        list.sort(Comparator.comparing(Wish::getSchedule));
        return list;
    }
}
