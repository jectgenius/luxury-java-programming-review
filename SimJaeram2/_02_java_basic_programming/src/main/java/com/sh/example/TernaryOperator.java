package com.sh.example;

public class TernaryOperator {                                      // TernaryOperator 클래스 정의 시작, 조건 연산자
    public static void main(String[] args) {                        // main() 메소드 정의 시작
        int a = 3, b = 5;                                           // int형 변수 a, b 선언 동시에 3, 5 대입하여 초기화

        System.out.println("두 수의 차는 " + ((a>b)?(a-b):(b-a)));    // System.out.println() 표준 출력 메소드 호출하여 문자열 "두 수의 차는 " + ((a>b)?(a-b):(b-a)) 출력, a가 b보다 크다 조건식의 연산 결과가 true이면 a-b, false이면 b-a
                                                                    // 3이 5보다 크다 == false 이므로 b-a == 5-3 == 2 리턴
    }                                                               // main() 메소드 정의 끝
}                                                                  // TernaryOperator 클래스 정의 끝
