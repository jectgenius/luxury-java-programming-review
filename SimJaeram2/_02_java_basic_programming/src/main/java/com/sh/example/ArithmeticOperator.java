package com.sh.example;                                 // 패키지 선언문, com.sh.example에 해당하는 클래스

import java.util.Scanner;                               // Scanner 클래스 사용하기 위해 컴파일러에게 경로명 알려줌

public class ArithmeticOperator {                       // ArithmeticOperator 클래스 정의 시작
    public static void main(String[] args) {            // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);       // Scanner 클래스 레퍼런스 변수 scanner 선언 동시에 Scanner 클래스 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 객체 생성

        System.out.print("정수를 입력하세요: ");           // System.out.print() 표준 출력 메소드 호출하여 문자열 "정수를 입력하세요: " 출력, 정수 입력 안내 메세지 출력
        int time = scanner.nextInt();                   // int형 변수 time 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴받아 대입하여 초기화, 초 입력
        int second = time % 60;                         // int형 변수 second 선언 동시에 time % 60 연산 결과 리턴 받아 대입하여 초기화, 초
        int minute = (time / 60) % 60;                  // int형 변수 minute 선언 동시에 (time / 60) % 60 연산 결과 리턴 받아 대입하여 초기화, 분을 60으로 나눈 나머지, 분
        int hour = (time / 60) / 60;                    // int형 변수 hour 선언 동시에 (time / 60) / 60 연산 결과 리턴 받아 대입하여 초기화, 분을 60으로 나눈 몫, 시간

        System.out.print(time + "초는 ");                // System.out.print() 표준 출력 메소드 호출하여 문자열 time + "초는 " 출력, 초 안내 메세지 출력
        System.out.print(hour + "시간, ");               // System.out.print() 표준 출력 메소드 호출하여 문자열 hour + "시간, " 출력, 시간 안내 메세지 출력
        System.out.print(minute + "분, ");               // System.out.print() 표준 출력 메소드 호출하여 문자열 minute + "분, " 출력, 분 안내 메세지 출력
        System.out.println(second + "초입니다.");         // System.out.print() 표준 출력 메소드 호출하여 문자열 second + "초입니다." 출력, 초 안내 메세지 출력

        scanner.close();                                // scanner 객체 close() 메소드 호출하여 사용종료
    }                                                   // main() 메소드 정의 끝
}                                                       // ArithmeticOperator 클래스 정의 끝
