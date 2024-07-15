package com.sh.example;                                             // 패키지 선언문, com.sh.example에 해당하는 클래스

public class AssignmentIncDecOperator {                             // AssignmentIncDecOperator 클래스 정의 시작, 대입연산자와 증감연산자
    public static void main(String[] args) {                        // main() 메소드 정의 시작
        int a = 3, b = 3, c = 3;                                    // int형 변수 a, b, c 선언 동시에 각각 3, 3, 3으로 대입하여 초기화

        // 복합 대입 연산자 사례
        a += 3;                                                     // a = a + 3, 3 + 3 == 6
        b *= 3;                                                     // b = b * 3, 3 * 3 == 9
        c %= 2;                                                     // c = c % 2, 3 % 2 == 1
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);     // System.out.println() 표준 출력 메소드 호출하여 문자열 "a=" + a + ", b=" + b + ", c=" + c 출력, 복합 대입 연산 결과 변수 a, b, c에 저장된 값 출력

        int d = 3;                                                  // int형 변수 d 선언 동시에 3 대입하여 초기화

        // 증감 연산자 사례
        a = d++;                                                    // a에 d 먼저 대입 후 d에 +1
        System.out.println("a=" + a + ", d=" + d);                  // System.out.println() 메소드 호출하여 문자열 "a=" + a + ", d=" + d 출력, a = 3, d = 4
        a = ++d;                                                    // d에 +1 먼저 후 a에 d 대입
        System.out.println("a=" + a + ", d=" + d);                  // System.out.println() 메소드 호출하여 문자열 "a=" + a + ", d=" + d 출력, d = 5, a = 5
        a = d--;                                                    // a에 d 먼저 대입 후 d에 -1
        System.out.println("a=" + a + ", d=" + d);                  // System.out.println() 메소드 호출하여 문자열 "a=" + a + ", d=" + d 출력, a = 5, d = 4
        a = --d;                                                    // d에 -1 먼저 후 a에 d 대입
        System.out.println("a=" + a + ", d=" + d);                  // System.out.println() 메소드 호출하여 문자열 "a=" + a + ", d=" + d 출력, d = 3, a = 3

    }                                                               // main() 메소드 정의 끝
}                                                                   // AssignmentIncDecOperator 클래스 정의 끝
