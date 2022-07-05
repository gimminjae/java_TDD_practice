package com.ll.exam;

//# TDD 정수연산기 조건
//- TDD로 진행
//- 정수연산만 가능
//- 음수 가능
//- 괄호 가능
//- 사칙연산가능
//- 재귀만 사용가능
//- 복잡한 식 연산 가능
public class Calculator {
    public static int calc(String s) {
        if(s.indexOf('+') != -1) return calcPlus(s);
        else if(s.indexOf('-') != -1) return calcMinus(s);
        else if(s.indexOf('*') != -1) return calcMultiply(s);
        else if(s.indexOf('/') != -1) return calcDivide(s);
        return 0;
    }

    private static int calcDivide(String s) {
        String[] sBits = s.split(" \\/ ");
        int n1 = Integer.valueOf(sBits[0]);
        int n2 = Integer.valueOf(sBits[1]);
        return n1 / n2;
    }

    private static int calcMultiply(String s) {
        String[] sBits = s.split(" \\* ");
        int n1 = Integer.valueOf(sBits[0]);
        int n2 = Integer.valueOf(sBits[1]);
        return n1 * n2;
    }

    private static int calcMinus(String s) {
        String[] sBits = s.split(" \\- ");
        int n1 = Integer.valueOf(sBits[0]);
        int n2 = Integer.valueOf(sBits[1]);
        return n1 - n2;
    }
    private static int calcPlus(String s) {
        String[] sBits = s.split(" \\+ ");
        int n1 = Integer.valueOf(sBits[0]);
        int n2 = Integer.valueOf(sBits[1]);
        return n1 + n2;
    }
}
