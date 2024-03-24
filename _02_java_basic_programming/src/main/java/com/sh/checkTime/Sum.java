package com.sh.checkTime;

import java.util.Scanner;                           // Scanner 클래스 사용하기위해 컴파일러에게 경로명을 알려줌

public class Sum {                                  // Sum 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);   // 사용자로부터 입력 받기 위해, Scanner 클래스로 scanner 객체 생성
        int num1 = scanner.nextInt();               // int형 변수 num1 선언과 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 대입하여 초기화
        int num2 = scanner.nextInt();               // int형 변수 num2 선언과 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 대입하여 초기화
        int sum = num1 + num2;                      // int형 변수 sum 선언과 동시에 num1 + num2 연션 결과 대입하여 초기화
        System.out.println("두 정수의 합은 " + sum);  // System.out.println() 메소드 호출하여 두 정수의 합 출력
    }                                               // main() 메소드 정의 끝
}                                                   // Sum 클래스 정의 끝