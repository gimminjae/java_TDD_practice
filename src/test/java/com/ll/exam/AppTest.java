package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void add() {
        int result = Calculator.run("10 + 20");

        assertEquals(30, result);
    }
    @Test
    public void add_2() {
        int result = Calculator.run("20 + 20");

        assertEquals(40, result);
    }
    @Test
    public void add_3() {
        int result = Calculator.run("10 + 10");

        assertEquals(20, result);
    }
    @Test
    public void 빼기() {
        int result = Calculator.run("10 - 10");

        assertEquals(0, result);
    }
    @Test
    public void 곱하기() {
        int result = Calculator.run("10 * 10");

        assertEquals(100, result);
    }
}
