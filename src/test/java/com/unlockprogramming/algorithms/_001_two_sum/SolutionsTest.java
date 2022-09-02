package com.unlockprogramming.algorithms._001_two_sum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionsTest {

    private static Stream<Arguments> values() {
        return Stream.of(
                //
                Arguments.of(new int[]{2, 7, 6, 1, 3, 4, 9, 5}, 16, new int[]{1, 6}),
                Arguments.of(new int[]{2, 7, -6, 1, 23, -14, 39, -5}, -3, new int[]{0, 7}),
                Arguments.of(new int[]{2, 7, -6, 1, 23, -4, 39, -5}, -10, new int[]{2, 5}),
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1})
                //
        );
    }

    @ParameterizedTest
    @MethodSource("values")
    void testBruteForce(int[] nums, int target, int[] expected) {
        int[] actual = new BruteForce().twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }


    @ParameterizedTest
    @MethodSource("values")
    void testOptimized(int[] nums, int target, int[] expected) {
        int[] actual = new Optimized().twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

}
