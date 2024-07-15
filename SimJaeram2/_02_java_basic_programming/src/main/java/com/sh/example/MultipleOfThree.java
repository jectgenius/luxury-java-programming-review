package com.sh.example;                                     // 패키지 선언문, com.sh.example 패키지에 해당하는 클래스

import java.util.Scanner;                                   // Scanner 클래스 사용하기 위해 컴파일러에게 경로명을 알려줌

public class MultipleOfThree {                              // MultipleOfThree 클래스 정의 시작, if-else문
    public static void main(String[] args) {                // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);           // Scanner 클래스형 레퍼런스 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화

        System.out.print("수를 입력하시요: ");                 // System.out.println() 표준 출력 메소드 호출하여 문자열 "수를 입력하시요: " 출력, 수 입력 안내 메세지 출력
        int number = scanner.nextInt();                     // int형 변수 number 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화
        if(number % 3 == 0)                                 // 만약 변수 number를 3으로 나눈 나머지가 0이면
            System.out.println("3의 배수입니다.");            // System.out.println() 표준 출력 메소드 호출하여 문자열 "3의 배수입니다." 출력, 3의 배수 안내 메세지 출력
        else                                                // 그렇지 않으면, 즉 변수 number를 3으로 나눈 나머지가 0이 아니면
            System.out.println("3의 배수가 아닙니다.");        // System.out.println() 표준 출력 메소드 호출하여 문자열 "3의 배수가 아닙니다." 출력, 3의 배수가 아님 안내 메세지 출력

        scanner.close();                                    // scanner 객체의 close() 메소드 호출하여 사용 종료
    }                                                       // main() 메소드 정의 끝
}                                                           // MultipleOfThree 클래스 정의 끝
