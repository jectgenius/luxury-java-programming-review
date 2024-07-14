package com.sh.example;

import java.util.Scanner;

public class DevideByZeroHandling {                                             // DevideByZero 클래스 정의 시작
    public static void main(String[] args) {                                    // main() 메소드 정의 시작
        Scanner sc = new Scanner(System.in);                                    // 사용자로부터 입력 받기 위해 Scanner 클래스 정의 시작

        while(true) {                                                           // while문의 조건식이 true이므로 무한반복
            System.out.print("나뉨수를 입력하시오:");                               // System.out.print() 메소드 호출하여 분자 입력 안내 메세지 출력
            int dividend = sc.nextInt();                                        // int형 변수 dividend 선언 동시에 sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화
            System.out.print("나눗수를 입력하시오:");                               // System.out.print() 메소드 호출하여 분모 입력 안내 메세지 출력
            int divisor = sc.nextInt();                                         // int형 변수 divisor 선언 동시에 sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화
            try {                                                               // 예외가 발생할 가능성이 있는 문장을 try 블럭에 작성
                System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 "  // System.out.println() 메소드 호출하여 나누기 연산 결과 출력
                + dividend/divisor + "입니다.");                                 // 0으로 나누는 경우, ArithmeticException 발생
                break;                                                          // 반복문 while을 빠져나감
            }
            catch(ArithmeticException e) {                                      // ArithmeticException 예외 처리 코드
                System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");       // System.out.println() 메소드 호출하여 안내 메세지 출력
            }                                                                   // 예외 처리 코드 있으므로 프로그램이 종료되지 않는다.
        }

        sc.close();
    }
}
