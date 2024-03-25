package com.sh.example;

import java.util.Scanner;                           // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ArithmeticOperator {                   // ArithmeticOperator 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);   // Scanner 클래스 타입의 scanner 변수 선언 동시에 객체 생성

        System.out.print("정수를 입력하세요: ");       // System.out.println() 메소드 호출하여 문자열 "정수를 입력하세요: " 출력, 입력 안내 메세지
        int time = scanner.nextInt();               // scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값을 int형으로 변환하여 리턴받아 int형 변수 time에 대입
        int second = time % 60;                     // int형 변수 second 선언 동시에 변수 time을 60으로 나눈 나머지를 대입하여 초기화, 초
        int minute = (time / 60) % 60;              // int형 변수 minute 선언 동시에 변수 time을 60으로 나눈 몫 == 분을 60으로 나눈 나머지를 대입하여 초기화, 분
        int hour = (time / 60) / 60;                // int형 변수 hour 선언 동시에 변수 hour을 60으로 나눈 몫 == 분을 60으로 나눈 몫 == 시간을 대입하여 초기화, 시간

        System.out.print(time + "초는 ");            // System.out.println() 메소드 호출하여 변수 time에 저장된 값 출력, 사용자로부터 입력 받은 초
        System.out.print(hour + "시간, ");           // System.out.println() 메소드 호출하여 변수 time에 저장된 값 출력, 시간
        System.out.print(minute + "분, ");           // System.out.println() 메소드 호출하여 변수 time에 저장된 값 출력, 분
        System.out.print(second + "초입니다.");       // System.out.println() 메소드 호출하여 변수 time에 저장된 값 출력, 초

        scanner.close();                            // scanner 객체의 close() 메소드 호출하여 객체 닫기
    }                                               // main() 메소드 정의 끝
}                                                   // ArithmeticOperator 클래스 정의 끝
