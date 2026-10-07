package com.example.adder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdderTest {

    @Test
    void shouldAddTwoPositiveNumbers() {
        assertEquals(5, Adder.add(2, 3));
    }

    @Test
    void shouldAddNegativeNumbers() {
        assertEquals(-8, Adder.add(-3, -5));
    }

    @Test
    void shouldAddPositiveAndNegativeNumbers() {
        assertEquals(2, Adder.add(5, -3));
    }

    @Test
    void shouldAddZero() {
        assertEquals(7, Adder.add(7, 0));
    }

    @Test
    void shouldHandleIntegerBoundaryValues() {
        assertEquals(Integer.MAX_VALUE, Adder.add(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, Adder.add(Integer.MIN_VALUE, 0));
    }
}