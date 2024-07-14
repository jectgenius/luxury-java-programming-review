package com.sh.exercise;

import java.util.Scanner;

public class Ch2_11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int month;
        String season;

        // 입력
        System.out.print("달을 입력하세요(1~12)>>");
        month = sc.nextInt();

        // 계절 판단
        if(month == 3 || month == 4 || month == 5) {
            season = "봄";
        }
        else if(month == 6 || month == 7 || month == 8) {
            season = "여름";
        }
        else if(month == 9 || month == 10 || month == 11) {
            season = "가을";
        }
        else if(month == 12 || month == 1 || month == 2) {
            season = "겨울";
        }
        else {
            season = "잘못입력";
        }

        // 출력
        System.out.println(season);

        sc.close();
    }
}
