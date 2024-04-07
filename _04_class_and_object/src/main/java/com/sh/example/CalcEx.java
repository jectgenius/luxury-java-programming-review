package com.sh.example;

class Calc {                                                    // default로 선언된 Calc 클래스 정의 시작, static 메소드만 있는 클래스
    public static int abs(int a) { return a>0? a:-a; }          // public으로 선언된 static 메소드 abs() 정의, 절댓값
    public static int max(int a, int b) { return (a>b)?a:b; }   // public으로 선언된 static 메소드 max() 정의, 최댓값
    public static int min(int a, int b) { return (a>b)?b:a; }   // public을 선언된 static 메소드 min() 정의, 최솟값
}                                                               // public으로 선언된 Calc 클래스 정의 끝

public class CalcEx {                                           // public으로 선언된 CalcEx 클래스 정의 시작
    public static void main(String[] args) {                    // main() 메소드 정의 시작
        System.out.println(Calc.abs(-5));                    // System.out.println() 메소드 호출하여 Calc의 static 메소드 abs() 호출하여 절댓값 리턴받아 출력
        System.out.println(Calc.max(10, 0));              // 최댓값
        System.out.println(Calc.min(-3, -8));             // 최솟값
    }                                                           // main() 메소드 정의 시작
}                                                               // public으로 선언된 CalcEx 클래스 정의 끝
