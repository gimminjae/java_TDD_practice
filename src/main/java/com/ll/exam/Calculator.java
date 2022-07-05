package com.ll.exam;

public class Calculator {
    public static int run(String s) {
        if(s.indexOf('+') != -1) return runPlus(s);
        else if(s.indexOf('-') != -1) return runMinus(s);
        else if(s.indexOf('*') != -1) return runMultiply(s);
        else return runDivide(s);
    }

    private static int runDivide(String s) {
        String[] sBits = s.split(" \\/ ");
        int n1 = Integer.valueOf(sBits[0]);
        int n2 = Integer.valueOf(sBits[1]);
        return n1 / n2;
    }

    private static int runMultiply(String s) {
        String[] sBits = s.split(" \\* ");
        int n1 = Integer.valueOf(sBits[0]);
        int n2 = Integer.valueOf(sBits[1]);
        return n1 * n2;
    }

    private static int runMinus(String s) {
        String[] sBits = s.split(" \\- ");
        int n1 = Integer.valueOf(sBits[0]);
        int n2 = Integer.valueOf(sBits[1]);
        return n1 - n2;
    }
    private static int runPlus(String s) {
        String[] sBits = s.split(" \\+ ");
        int n1 = Integer.valueOf(sBits[0]);
        int n2 = Integer.valueOf(sBits[1]);
        return n1 + n2;
    }
}
