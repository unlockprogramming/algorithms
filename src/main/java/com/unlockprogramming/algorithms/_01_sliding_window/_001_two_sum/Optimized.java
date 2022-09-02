package com.unlockprogramming.algorithms._01_sliding_window._001_two_sum;

import java.util.HashMap;
import java.util.Map;

class Optimized {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> cache = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentDifference = target - nums[i];
            if (cache.containsKey(currentDifference)) {
                return new int[]{cache.get(currentDifference), i};
            } else {
                cache.put(nums[i], i);
            }
        }

        throw new IllegalArgumentException("Invalid solution. Input must have extactly one solution.");
    }

}
