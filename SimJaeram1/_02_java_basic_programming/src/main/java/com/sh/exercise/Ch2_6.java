package com.sh.exercise;

import java.util.Scanner;

public class Ch2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int number, one, ten;
        int count = 0;

        // 입력
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        number = sc.nextInt();

        ten = number / 10;                              // 입력 받은 정수의 십의 자리 수
        one = number % 10;                              // 입력 받은 정수의 일의 자리 수

        // 3, 6, 9 개수 세기
        if(ten == 3 || ten == 6 || ten == 9) {
            count++;
        }
        if(one == 3 || one == 6 || one == 9) {
            count++;
        }

        // 박수 출력
        if(count == 0) {
            System.out.println("박수를 치지 않습니다.");
        } else if(count == 1) {
            System.out.println("박수짝");
        } else if(count == 2) {
            System.out.println("박수짝짝");
        }

        sc.close();
    }
}
