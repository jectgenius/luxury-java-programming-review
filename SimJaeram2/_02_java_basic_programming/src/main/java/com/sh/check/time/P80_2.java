package com.sh.check.time;

import java.util.Scanner;                                                           // Scanner 클래스 사용하기 위해 컴파일러에게 경로명 알려줌

public class P80_2 {                                                                // P80_2 클래스 정의 시작
    public static void main(String[] args) {                                        // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);                                   // 사용자로부터 입력을 받기 위해 Scanner 클래스 객체 생성
        int number1, number2, sum = 0;                                              // int형 변수 number1, number2, sum 선언 및 sum에 0 대입하여 초기화, 프로그램에 필요한 변수 선언

        System.out.println("합을 구할 2개의 정수를 입력하세요.");                         // System.out.println() 표준 출력 메소드 호출하여 문자열 "합을 구할 2개의 정수를 입력하세요." 출력, 2개의 정수 입력 안내 메세지 출력
        number1 = scanner.nextInt();                                                 // 변수 number1에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 int형 정수를 리턴 받아 대입, 사용자로부터 정수 입력 받아 저장
        number2 = scanner.nextInt();                                                 // 변수 number2에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 int형 정수를 리턴 받아 대입, 사용자로부터 정수 입력 받아 저장
        sum = number1 + number2;                                                     // 변수 sum에 변수 number1과 number2에 저장된 값 덧셈 연산한 결과 대입, 사용자로부터 입력 받은 2개의 정수 덧셈 연산 결과 대입

        System.out.println(number1 + "과 " + number2 + "의 합은 " + sum + "입니다.");  // System.out.println() 표준 출력 메소드 호출하여 문자열 "number1과 number2의 합은 sum입니다." 출력, 연산 결과 안내 메세지 출력
    }                                                                               // main() 메소드 정의 끝
}                                                                                   // P80_2 클래스 정의 끝
