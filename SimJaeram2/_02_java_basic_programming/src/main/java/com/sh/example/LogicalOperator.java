package com.sh.example;

public class LogicalOperator {                          // LogicalOperator 클래스 정의 시작, 논리 연산자
    public static void main(String[] args) {            // main() 메소드 정의 시작
        // 비교 연산
        System.out.println('a' > 'b');                  // System.out.println() 표준 출력 메소드 호출하여 비교 연산 결과 출력, 문자 'a'가 문자 'b'보다 더 크다 == 사전 순서 상 더 뒤에 나온다, false
        System.out.println(3 >= 2);                     // System.out.println() 표준 출력 메소드 호출하여 비교 연산 결과 출력, 3이 2보다 크거나 같다, true
        System.out.println(-1 < 0);                     // System.out.println() 표준 출력 메소드 호출하여 비교 연산 결과 출력, -1이 0보다 작다, true
        System.out.println(3.45 <= 2);                  // System.out.println() 표준 출력 메소드 호출하여 비교 연산 결과 출력, 3.45가 2보다 작거나 같다, false
        System.out.println(3 == 2);                     // System.out.println() 표준 출력 메소드 호출하여 비교 연산 결과 출력, 3이 2와 같다, false
        System.out.println(3 != 2);                     // System.out.println() 표준 출력 메소드 호출하여 비교 연산 결과 출력, 3이 2와 같지 않다, true
        System.out.println(!(3 != 2));                  // System.out.println() 표준 출력 메소드 호출하여 비교 연산 결과 출력, 3이 2와 같지 않다의 not 연산, true의 not 연산이므로 false

        // 비교 연산과 논리 연산 복합
        System.out.println((3 > 2) && (3 > 4));         // System.out.println() 표준 출력 메소드 호출하여 연산 결과 출력, 3이 2보다 크고 and 3이 4보다 크다, true and false == false
        System.out.println((3 != 2) || (-1 > 0));       // System.out.println() 표준 출력 메소드 호출하여 연산 결과 출력, 3이 2와 다르거나 -1이 0보다 크다, true or false == true
        System.out.println((3 != 2) ^ (-1 > 0));        // System.out.println() 표준 출력 메소드 호출하여 연산 결과 출력, 3이 2와 다르다 XOR -1이 0보다 크다, true xor false == true
    }                                                   // main() 메소드 정의 끝
}                                                       // LogicalOperator 클래스 정의 끝
