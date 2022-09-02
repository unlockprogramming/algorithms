package com.unlockprogramming.algorithms._02_two_pointers._001_backspace_string_compare;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BruteForceTest {

    private static Stream<Arguments> values() {
        return Stream.of(
                //
                Arguments.of("ab#c", "ad#c", true),
                Arguments.of("ab##", "c#d#", true),
                Arguments.of("a#c", "b", false),
                Arguments.of("a##c", "#a#c", true),
                Arguments.of("y#fo##f", "y#f#o##f", true)
                //
        );
    }


    @ParameterizedTest
    @MethodSource("values")
    void testBruteForce(String s, String t, boolean expected) {
        boolean actual = new BruteForce().backspaceCompare(s, t);
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @MethodSource("values")
    void testOptimized(String s, String t, boolean expected) {
        boolean actual = new BruteForce().backspaceCompare(s, t);
        assertEquals(expected, actual);
    }


}