package com.lee;

import org.junit.Test;

import java.util.Arrays;

public class TowSum {


    @Test
    public void alu() {
        int[] nums = {3, 3, 6};
        int[] result = twoSumL(nums, 6);
        System.out.println(Arrays.toString(result));
    }

    public int[] twoSumL(int[] nums, int target) {
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
}
