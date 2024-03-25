package com.sh.example;

public class CircleArea {                               // CircleArea 클래스 정의 시작
    public static void main(String[] args) {            // main() 메소드 정의 시작
        final double PI = 3.14;                         // double형 상수 PI 선언 동시에 3.14 대입하여 초기화, 원주율

        double radius = 10.0;                           // double형 변수 radius 선언 동시에 10.0 대입하여 초기화, 원의 반지름

        double circleArea = radius * radius * PI;       // double형 변수 circleArea 선언 동시에 연산 결과 대입하여 초기화, 원의 면적

        System.out.println("원의 면적 = " + circleArea);  // System.out.println() 메소드 호출하여 circleArea에 저장된 값 출력, 314.0
    }                                                   // main() 메소드 정의 끝
}                                                       // CircleArea 클래스 정의 끝
