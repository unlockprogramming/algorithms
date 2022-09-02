package com.unlockprogramming.algorithms._002_find_maximum_average_of_sub_arrays;

import com.unlockprogramming.algorithms.slidingwindow._002_find_maximum_average_of_sub_arrays.BruteForce;
import com.unlockprogramming.algorithms.slidingwindow._002_find_maximum_average_of_sub_arrays.Optimized;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionsTest {

    private static Stream<Arguments> values() {
        return Stream.of(
                Arguments.of(new int[]{1, 12, -5, -6, 50, 3}, 4, 12.75000),
                Arguments.of(new int[]{5}, 1, 5.00000),
                Arguments.of(new int[]{-1}, 1, -1.00000),
                Arguments.of(new int[]{0}, 1, 0.00000)
        );
    }

    @ParameterizedTest
    @MethodSource("values")
    void testBruteForce(int[] nums, int k, double expected) {
        double actual = new BruteForce().findMaxAverage(nums, k);
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @MethodSource("values")
    void testOptimized(int[] nums, int k, double expected) {
        double actual = new Optimized().findMaxAverage(nums, k);
        assertEquals(expected, actual);
    }

}
