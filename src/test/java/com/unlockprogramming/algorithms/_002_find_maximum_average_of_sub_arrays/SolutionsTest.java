package com.unlockprogramming.algorithms._002_find_maximum_average_of_sub_arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionsTest {

    private static Stream<Arguments> values() {
        return Stream.of(
                //
                Arguments.of(new int[]{1, 12, -5, -6, 50, 3}, 4, 12.75000)
                //
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
