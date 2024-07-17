package com.sh.exercise;

import java.util.Scanner;

public class Ch2_1 {
    public static void main(String[] args) {

        // 0. 필요한 변수 선언
        Scanner scanner = new Scanner(System.in);                           // Scanner 클래스 레퍼런스 변수 scanner 선언 동시에 Scanner 클래스 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 객체 생성

        int won;                                                            // int형 변수 won 선언
        double dollar;                                                      // double형 변수 dollar 선언
        final double EXCHANGE_RATE = 1100;                                  // double형 상수 EXCHANGE_RATE 선언 동시에 1100 대입하여 초기화, 1달러 환율

        // 1. 원화 입력
        won = scanner.nextInt();                                            // 변수 won에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은

        // 2. 달러로 변환 연산
        dollar = won / EXCHANGE_RATE;

        // 3. 결과 출력
        System.out.println(won + "원은 $" + dollar + "입니다.");

        scanner.close();                                                                // scanner 객체 close() 메소드 호출하여 사용 종료
    }
}
