package com.sh.exercise;

import java.util.Scanner;                                           // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch2_3 {                                                // Ch2_3 클래스 정의 시작
    public static void main(String[] args) {                        // main() 메소드 정의 끝
        // 변수 선언
        Scanner sc = new Scanner(System.in);                        // 사용자로부터 입력 받기 위해 Scanner 클래스 객체 생성
        // 사용자로부터 입력 받은 금액
        int money;
        // 지폐 개수
        int manWon5, manWon1, cheonWon1, baekWon5, baekWon1, sibWon5, sibWon1, illWon;

        System.out.print("금액을 입력하시오>>");                       // 입력 안내 메세지 출력
        money = sc.nextInt();                                       // sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 리턴 받아 money에 대입하여 초기화

        manWon5 = money / 50000;                                    // 5만원권 개수 연산
        manWon1 = money % 50000 / 10000;                            // 1만원권 개수 연산
        cheonWon1 = money % 10000 / 1000;                           // 1천원권 개수 연산
        baekWon5 = money % 1000 / 500;                              // 5백원 개수 연산
        baekWon1 = money % 500 / 100;                               // 1백원 개수 연산
        sibWon5 = money % 100 / 50;                                 // 5십원 개수 연산
        sibWon1 = money % 50 / 10;                                  // 1십원 개수 연산
        illWon = money % 10;                                        // 일원 개수 연산

        if(manWon5 != 0) {                                          // 만약 5만원권 개수가 0이면 개수 안내 메세지 출력 안함
            System.out.println("오만원권 " + manWon5 + "매");
        }
        if(manWon1 != 0) {
            System.out.println("만원권 " + manWon1 + "매");
        }
        if(cheonWon1 != 0) {
            System.out.println("천원권 " + cheonWon1 + "매");
        }
        if(baekWon5 != 0) {
            System.out.println("오천원권 " + baekWon5 + "매");
        }
        if(baekWon1 != 0) {
            System.out.println("백원 " + baekWon1 + "개");
        }
        if(sibWon5 != 0) {
            System.out.println("오십원 " + sibWon5 + "개");
        }
        if(sibWon1 != 0) {
            System.out.println("십원 " + sibWon1 + "개");
        }
        if(illWon != 0) {
            System.out.println("일원 " + illWon + "개");
        }

        sc.close();                                                 // sc 객체의 close() 메소드 호출하여 객체 닫기
    }                                                               // main() 메소드 정의 끝
}                                                                   // Ch2_3 클래스 정의 끝
