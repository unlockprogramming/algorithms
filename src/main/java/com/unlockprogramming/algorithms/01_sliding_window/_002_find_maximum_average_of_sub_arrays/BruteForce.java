package com.unlockprogramming.algorithms.slidingwindow._002_find_maximum_average_of_sub_arrays;

/**
 * <a href="https://leetcode.com/problems/maximum-average-subarray-i/">Question</a>
 *
 * @author Bhuwan Prasad Upadhyay
 */
class BruteForce {

    public double findMaxAverage(int[] nums, int k) {

        // To support any numbers (positives, zero, negatives)
        double maxAverage = Double.NEGATIVE_INFINITY;

        /*
            MATH: to find number of possible contiguous sub arrays
            - number of sub arrays = total number of elements - subarray size + 1
         */
        for (int i = 0; i < nums.length - k + 1; i++) {

            double currentSum = 0;

            // Calculate sum of elements in current subarray
            for (int j = i; j < i + k; j++) {
                currentSum += nums[j];
            }

            // Calculate average of elements in current subarray
            double currentAverage = currentSum / k;

            // Replace max average if current average is maximum
            maxAverage = Math.max(maxAverage, currentAverage);

        }

        return maxAverage;
    }

}
