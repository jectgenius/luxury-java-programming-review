package com.sh.exercise;

import java.util.Scanner;

public class Ch3_6 {
    public static void main(String[] args) {
        // 변수 선언
        Scanner sc = new Scanner(System.in);
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        int count, money;                                           // 동전의 개수, 사용자로부터 입력 받은 금액

        // 입력
        System.out.print("금액을 입력하시오>>");
        money = sc.nextInt();

        // 연산
        for(int i = 0; i < unit.length; i++) {
            count = money / unit[i];                                // unit[i]원 짜리 동전의 개수 구하는 연산

            if(count != 0) {                                        // 동전의 개수가 0이 아니면 개수 출력
                System.out.println(unit[i] + "원 짜리 : " + count + "개");
            }

            money = money % unit[i];                                // 나머지 돈
        }

        sc.close();
    }
}
