package com.sh.example;

/*                                                  // 여러줄 주석 작성
소스 파일 : Hello.java
 */

public class Hello {                                // Hello 클래스 정의 시작

    public static int sum(int n, int m) {           // sum() 메소드 정의 시작
        return n + m;                               // 변수 n + m 연산 결과 리턴
    }                                               // sum() 메소드 정의 끝

    public static void main(String[] args) {        // main() 메소드 정의 시작
        int i = 20;                                 // int형 변수 i 선언 동시에 20 대입하여 초기화
        int s;                                      // int형 변수 s 선언
        char a;                                     // char형 변수 a 선언

        s = sum(i, 10);                          // 변수 s에 sum() 메소드 호출하여 i + 10 연산 결과 리턴 받아 대입하여 저장, 즉 20 + 10 == 30
        a = '?';                                    // 변수 a에 문자 '?' 대입하여 저장
        System.out.println(a);                      // System.out.println() 표준 출력 메소드 호출하여 변수 a에 저장된 값 출력
        System.out.println("Hello");                // System.out.println() 표준 출력 메소드 호출하여 문자열 "Hello" 출력
        System.out.println(s);                      // System.out.println() 표준 출력 메소드 호출하여 변수 s에 저장된 값 출력
    }                                               // main() 메소드 정의 끝
}                                                   // Hello 클래스 정의 끝
