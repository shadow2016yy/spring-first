package com.ryan.www;

import java.util.HashMap;

/**
 * @author Ryan
 * created on  2020-12-10-18:16
 */
public class SumTest {
    public static  int[] twoSum(int[]nums,int target){
        HashMap<Integer ,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }
                map.put(target-nums[i],i);

        }
        return null;
    }

    public static void main(String[] args) {
        int[]sums={1,3,5,7,8,10};
        int target=6;
        int[] ints = twoSum(sums, target);
        System.out.println(ints);
    }
}
