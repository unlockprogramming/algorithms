package com.unlockprogramming.algorithms._002_find_maximum_average_of_sub_arrays;

/**
 * <a href="https://leetcode.com/problems/maximum-average-subarray-i/">Question</a>
 *
 * @author Bhuwan Prasad Upadhyay
 */
class Optimized {

    public double findMaxAverage(int[] nums, int k) {

        // To support any real numbers (positives, zero, negatives)
        double maxAverage = Double.NEGATIVE_INFINITY;
        double sum = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {

            //increase sum by adding the element which is included in sliding window
            sum += nums[end];

            //move sliding window forward, only if we have hit the required sliding window size of k
            if (end >= k - 1) {

                // Calculate average of elements in current sliding window
                double currentAverage = sum / k;

                // Replace max average if current average is maximum
                if (maxAverage < currentAverage) {
                    maxAverage = currentAverage;
                }

                //decrease sum by subtracting the element which is going out from sliding window
                sum -= nums[start];

                // move the sliding window forward
                start++;

            }

        }

        return maxAverage;
    }

}
