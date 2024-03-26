package com.sh.exercise;

import java.util.Scanner;                                           // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch2_1 {                                                // Ch2_1 클래스 정의 시작
    public static void main(String[] args) {                        // main() 메소드 정의 시작
        // 변수 선언
        Scanner scanner = new Scanner(System.in);                   // 사용자로부터 입력 받기 위해 Scanner 클래스 객체 생성
        int won;                                                    // int형 변수 won 선언, 원화 저장
        double dollar;                                              // double형 변수 dollar 선언, 달러 저장

        // 원화 입력
        System.out.print("원화를 입력하세요(단위 원)>>");               // System.out.print() 메소드 호출하여 입력 안내 메세지 출력
        won = scanner.nextInt();                                    // 변수 won에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 리턴 받아 대입하여 초기화,
                                                                    // 즉 달러로 변환할 원화 저장
        // 달러로 변환
        dollar = (double) won / 1100;                               // 변수 dollar에 입력 받은 원화를 달러로 변환하여 대입하여 초기화

        // 결과 출력
        System.out.println(won + "원은 $" + dollar + "입니다.");     // System.out.println() 메소드 호출하여 원화, 달러 안내 메세지 출력

        scanner.close();                                           // scanner 객체의 close() 메소드 호출하여 객체 닫기
    }                                                              // main() 메소드 정의 끝
}                                                                  // Ch2_1 클래스 정의 끝
