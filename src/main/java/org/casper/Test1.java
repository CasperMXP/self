package org.casper;

import java.util.Arrays;

/**
 * <pre>
 * 给定一个整数组nums和一个目标值target,请你在该数组中找到和为目标值的的2个整数，
 * 并返回它们的数组下标。可以假设每种输入只有一个答案返回
 * 示例:
 * nums = [2,7,11,25]  target=9
 * nums[0]+nums[1] = target 所以返回[0,1]
 * </pre>
 */
public class Test1 {

    public static void main(String[] args) {
        int[] nums = { 2, 4, 5, 7, 8 };
        int target = 12;
        System.err.println(Arrays.toString(cal_01(nums, target)));
    }

    /**
     * 暴力破解法
     */
    public static int[] cal_01(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

}
