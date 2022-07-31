package com.unlockprogramming.algorithms._002_find_maximum_average_of_sub_arrays;

/**
 * <a href="https://leetcode.com/problems/maximum-average-subarray-i/">Question</a>
 *
 * @author Bhuwan Prasad Upadhyay
 */
class BruteForce {

    public double findMaxAverage(int[] nums, int k) {

        double maxAverage = 0;

        for (int i = 0; i < nums.length - k + 1; i++) {

            double currentSum = 0;

            for (int j = 0; j < i; j++) {
                currentSum += nums[j];
            }

            double currentAverage = currentSum / k;
            if (maxAverage < currentAverage) {
                maxAverage = currentAverage;
            }
        }

        return maxAverage;
    }

}
