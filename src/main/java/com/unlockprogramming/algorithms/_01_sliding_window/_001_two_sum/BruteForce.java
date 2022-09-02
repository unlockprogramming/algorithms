package com.unlockprogramming.algorithms._01_sliding_window._001_two_sum;

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
