package com.sh.example;

public class LogicalOperator {                      // LogicalOperator 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        // 비교 연산                                  // 연산 결과는 논리값 true, false
        System.out.println('a' > 'b');              // 문자 'a'가 문자 'b'보다 아스키코드 값이 더 크다 == 사전 순으로 더 뒤에 위치해있다, false
        System.out.println(3 >= 2);                 // 3이 2보다 크거나 같다, true
        System.out.println(-1 < 0);                 // -1은 0보다 작다, true
        System.out.println(3.45 <= 2);              // 3.45는 2보다 작거나 같다, false
        System.out.println(3 == 2);                 // 3과 2는 같다, false
        System.out.println(3 != 2);                 // 3과 2는 같지 않다, true
        System.out.println(!(3 != 2));              // 3과 2는 같지 않다의 not 연산, true의 not 연산, false

        // 비교 연산과 논리 연산 복합
        System.out.println((3 > 2) && (3 > 4));     // 3은 2보다 크다 and 3은 4보다 크다, true and false, false
        System.out.println((3 != 2) || (-1 > 0));   // 3은 2와 같지 않다 or -1은 0보다 크다, true or false, true
        System.out.println((3 != 2) ^ (-1 > 0));    // 3은 2와 같지 않다 xor -1은 0보다 크다, true xor false, true
    }                                               // main() 메소드 정의 끝
}                                                   // LogicalOperator 클래스 정의 끝
