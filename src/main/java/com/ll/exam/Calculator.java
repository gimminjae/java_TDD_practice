package com.ll.exam;

public class Calculator {
    public static int run(String s) {
        String[] sBits = s.split(" \\+ ");
        int n1 = Integer.valueOf(sBits[0]);
        int n2 = Integer.valueOf(sBits[1]);
        return n1 + n2;
    }
}
