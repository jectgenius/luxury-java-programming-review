package com.sh.example;

public class AssignmentIncDecOperator {                         // AssignmentIncDecOperator 클래스 정의 시작
    public static void main(String[] args) {                    // main() 메소드 정의 시작
        int a = 3, b = 3, c = 3;                                // int형 변수 a, b, c 선언 및 3 대입하여 초기화
                                                                // 콤마로 구분하여 한 줄에 여러개 변수 선언 및 초기화 가능
        // 복합 대입 연산자                                        // 복합 대입 연산자로 함축적으로 표현 가능
        a += 3;                                                 // a = a + 3, 6
        b *= 3;                                                 // b = b * 3, 9
        c %= 2;                                                 // c = c % 2, 1
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);

        int d = 3;
        // 증감 연산자                                            // 1 증가 또는 감소 시키는 연산자, 전위 후위 연산자에 따라 연산 순서가 달라진다.
        a = d++;                                                // a == 3, d == 4
        System.out.println("a=" + a + ", d=" + d);
        a = ++d;                                                // d == 5, a == 5
        System.out.println("a=" + a + ", d=" + d);
        a = d--;                                                // a == 5, d == 4
        System.out.println("a=" + a + ", d=" + d);
        a = --d;                                                // d == 3, a == 3
        System.out.println("a=" + a + ", d=" + d);
    }                                                           // main() 메소드 정의 끝
}                                                               // AssignmentIncDecOperator 클래스 정의 끝
