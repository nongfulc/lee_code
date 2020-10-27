package com.lee;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

public class TowSum {


    @Test
    public void test() {
        int[] nums = {3, 3, 6};
        int[] result = afei(nums, 6);
        System.out.println(Arrays.toString(result));
    }

    public int[] alu(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (another == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public int[] afei(int[] nums, int target){
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        int[] chars=new int[2];
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(map.get(diff)!=null){
                chars[0]=map.get(diff);
                chars[1]=i;
                return chars;
            }
            map.put(nums[i],i);
        }
        return chars;
    }


}
