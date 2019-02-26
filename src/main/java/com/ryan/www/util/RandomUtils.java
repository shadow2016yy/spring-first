package com.ryan.www.util;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Ryan on 2019/2/26.
 */
public class RandomUtils {
    private static ThreadLocalRandom random = ThreadLocalRandom.current();

    public static int nextInt(int count) {
        return random.nextInt(count);
    }

    public static void main(String[] args) {
        int i = nextInt(10);
        System.out.println(i);
    }
}
