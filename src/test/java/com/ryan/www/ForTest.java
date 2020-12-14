package com.ryan.www;

import com.ryan.www.aspect.BusinessLog;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Ryan on 2018/8/22.
 */
public class ForTest {
    @BusinessLog("for循环单元测试")
    public static void main(String[] args) {
        int count = 5;
        int newValue = count >> 1;
        System.out.println(newValue);
//        for (int i=0;i<count;i+=10000){
//            System.out.println("入参");
//            System.out.println(i);
//            if (i+10000>count){
//                System.out.println(count-i);
//            }
//        }
        System.out.println(Objects.isNull(""));


        String s = new String("hello");
        String s1 = "hello";
        System.out.println(s == s1);
        System.out.println(s.equals(s1));
        System.out.println(s == null);
        System.out.println(s.equals(""));

        int a = 9;
        int b = 4;
        int t1 = 1;
        int t2 = (t1 << 1) + 1;
        int t3 = 3 >> 1;
        System.out.println("向左位移操作之后的数字是：" + t2);
        System.out.println("向右位移操作之后的数字是：" + t3);


//        System.out.println("取模的结果："+a%b);
//        System.out.println("位与运算的结果:"+(9&4));
//        List list=new LinkedList<Integer>();
//        ((LinkedList) list).addFirst(1);
//        list.add(2);
//        System.out.println(list.size());
//        list.forEach(c-> System.out.println(c));

//        for (int i=0;i<1000;i++){
//            int value = ThreadLocalRandom.current().nextInt(1, 1000);
//            System.out.println("第"+i+1+"次生成的随机数是："+value);
//
//        }
        for (int i=0;i<10000000;i++) {
            byte[] bytes = new byte[1024 * 1024];
            System.out.println("========");
        }


    }
}
