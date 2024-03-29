package com.sh.example;

import java.util.Scanner;

public class DevideByZeroHandling {                                             // DevideByZero 클래스 정의 시작
    public static void main(String[] args) {                                    // main() 메소드 정의 시작
        Scanner sc = new Scanner(System.in);                                    // 사용자로부터 입력 받기 위해 Scanner 클래스 정의 시작

        while(true) {                                                           // while문의 조건식이 true이므로 무한반복
            System.out.print("나뉨수를 입력하시오:");                              // int형 변수 dividend
            int dividend = sc.nextInt();
            System.out.print("나눗수를 입력하시오:");
            int divisor = sc.nextInt();
            try {
                System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 "
                + dividend/divisor + "입니다.");
                break;
            }
            catch(ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
            }
        }

        sc.close();
    }
}
