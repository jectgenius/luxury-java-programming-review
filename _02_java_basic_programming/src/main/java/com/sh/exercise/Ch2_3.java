package com.sh.exercise;

import java.util.Scanner;

public class Ch2_3 {
    public static void main(String[] args) {
        // 변수 선언
        Scanner sc = new Scanner(System.in);                        // 사용자로부터 입력 받기 위해 Scanner 클래스 객체 생성
        int money;
        int manWon5, manWon1, cheonWon1, baekWon5, baekWon1, sibWon5, sibWon1, illWon;

        System.out.print("금액을 입력하시오>>");
        money = sc.nextInt();

        manWon5 = money / 50000;
        manWon1 = money % 50000 / 10000;
        cheonWon1 = money % 10000 / 1000;
        baekWon5 = money % 1000 / 500;
        baekWon1 = money % 500 / 100;
        sibWon5 = money % 100 / 50;
        sibWon1 = money % 50 / 10;
        illWon = money % 10;

        sc.close();                                                 // sc 객체의 close() 메소드 호출하여 객체 닫기
    }                                                               // main() 메소드 정의 끝
}
