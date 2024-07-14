package com.sh.example;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dividend;                                                           // int형 변수 dividend 선언, 분자
        int divisor;                                                            // int형 변수 divisor 선언, 분모

        System.out.print("나뉨수를 입력하시오: ");                                 // System.out.println() 메소드 호출하여 나뉨수 입력 안내 메세지 출력, 분자
        dividend = sc.nextInt();                                               // sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수를 변수 dividend에 대입
        System.out.print("나눗수를 입력하시오: ");                                 // System.out.println() 메소드 호출하여 나눗수
        divisor = sc.nextInt();                                                 // sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수를 변수 divisor에 대입

        System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " +        // java.lang.ArithmeticException: / by zero, 0으로 나누면 ArithmeticException 발생
                dividend/divisor + "입니다.");

        sc.close();
    }
}
