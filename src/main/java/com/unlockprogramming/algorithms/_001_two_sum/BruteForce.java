package com.unlockprogramming.algorithms._001_two_sum;

/**
 * <a href="https://leetcode.com/problems/two-sum/">Question</a>
 *
 * @author Bhuwan Prasad Upadhyay
 */
class BruteForce {

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }

        throw new IllegalArgumentException("Invalid solution. Input must have extactly one solution.");
    }

}
