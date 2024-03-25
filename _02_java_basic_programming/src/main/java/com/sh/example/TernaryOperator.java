package com.sh.example;

public class TernaryOperator {                                  // TernaryOperator 클래스 정의 시작
    public static void main(String[] args) {                    // main() 메소드 정의 시작
        int a = 3, b = 5;                                       // int형 변수 a 선언 동시에 3 대입하여 초기화, b 선언 동시에 5 대입하여 초기화

        System.out.println("두 수의 차는 " + ((a>b)?(a-b):(b-a)));// System.out.println() 메소드 호출하여 두 수의 차 출력
                                                                // a가 b보다 크면, a-b 리턴, 그렇지 않으면 즉 작거나 작으면 b-a 리턴되어 출력
    }                                                           // main() 메소드 정의 끝
}                                                               // TernaryOperator 클래스 정의 끝
