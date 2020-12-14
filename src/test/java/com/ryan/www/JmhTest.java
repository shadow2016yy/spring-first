package com.ryan.www;

import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * created by  Ryan on  2020-07-24-17:57
 */
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class JmhTest {

    public static void main(String[] args) {
        List<Integer> integers = testMethod();
        System.out.println(integers);
    }
    @Benchmark
    @Threads(10)
    public static List<Integer> testMethod() {
        int cardCount = 54;
        List<Integer> cardList = new ArrayList<Integer>();
        for (int i=0; i<cardCount; i++){
            cardList.add(i);
        }
        // 洗牌算法
        Random random = new Random();
        for (int i=0; i<cardCount; i++) {
            int rand = random.nextInt(cardCount);
            Collections.swap(cardList, i, rand);
        }
        return cardList;
    }

}