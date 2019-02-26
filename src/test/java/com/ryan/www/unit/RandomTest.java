package com.ryan.www.unit;

import com.ryan.www.util.RandomDataUtil;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Ryan on 2019/2/26.
 */
public class RandomTest {
    public static void main(String[] args) {
        List<String> wishes= Arrays.asList("第一个愿望","第二个愿望","第三个愿望","第四个愿望","第五个愿望","第六个愿望","第七个愿望","第八个愿望","第九个愿望","第十个愿望");
        List<String> list = RandomDataUtil.generateRandomDataNoRepeat(wishes, 6);
        list.forEach(c-> System.out.println(c));
    }
}
