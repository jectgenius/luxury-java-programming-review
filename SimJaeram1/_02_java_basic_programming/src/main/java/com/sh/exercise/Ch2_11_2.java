package com.sh.exercise;

import java.util.Scanner;

public class Ch2_11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int month;
        String season;

        // 입력
        System.out.print("달을 입력하세요(1~12)>>");
        month = sc.nextInt();

        // 계절 판단
        switch(month) {
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            default:
                season = "잘못입력";
        }

        // 출력
        System.out.println(season);

        sc.close();
    }
}
