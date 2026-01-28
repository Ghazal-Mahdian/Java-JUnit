package com.example.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

   private MathUtils mathUtils;

    // Runs before each test case
    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    // Runs after each test case
    @AfterEach
    void tearDown() {
        mathUtils = null;
    }

    // ---------- ADD TESTS ----------

    @Test
    void testAddPositiveNumbers() {
        assertEquals(10, mathUtils.add(4, 6));
    }

    @Test
    void testAddWithNegativeNumbers() {
        assertEquals(-2, mathUtils.add(-5, 3));
    }

    // ---------- SUBTRACT TESTS ----------

    @Test
    void testSubtractPositiveNumbers() {
        assertEquals(3, mathUtils.subtract(5, 2));
    }

    @Test
    void testSubtractNegativeResult() {
        assertEquals(-4, mathUtils.subtract(2, 6));
    }

    // ---------- MULTIPLY TESTS ----------

    @Test
    void testMultiplyPositiveNumbers() {
        assertEquals(12, mathUtils.multiply(3, 4));
    }

    @Test
    void testMultiplyByZero() {
        assertEquals(0, mathUtils.multiply(5, 0));
    }

    // ---------- DIVIDE TESTS ----------

    @Test
    void testDivideValidNumbers() {
        assertEquals(2.5, mathUtils.divide(5, 2));
    }

    @Test
    void testDivideNegativeNumbers() {
        assertEquals(-2.0, mathUtils.divide(-4, 2));
    }

    @Test
    void testDivideByZero() {
        assertEquals(-1.0, mathUtils.divide(10, 0));
    }
}
