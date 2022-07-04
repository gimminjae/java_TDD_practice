package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void addTest() {
        int result = Calculator.add("10 + 20");

        assertEquals(30, result);
    }
    @Test
    public void addTest_2() {
        int result = Calculator.add("20 + 20");

        assertEquals(40, result);
    }
    @Test
    public void addTest_3() {
        int result = Calculator.add("10 + 10");

        assertEquals(20, result);
    }
}
