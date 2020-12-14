package com.ryan.www;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Ryan on 2018/8/23.
 */
public class RandomTest {
    private static ThreadLocalRandom random = ThreadLocalRandom.current();

    public static void main(String[] args) {
        System.out.println(random.nextInt(10));
        System.out.println("原始的随机数");
        for (int i=0;i<10;i++){
            Random random = new Random();
            System.out.println("通用的"+random.nextInt(7));
            System.out.println("随机的"+ThreadLocalRandom.current().nextInt(7));

        }
    }
}
