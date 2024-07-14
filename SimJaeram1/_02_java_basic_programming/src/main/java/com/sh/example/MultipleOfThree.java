package com.sh.example;

import java.util.Scanner;

public class MultipleOfThree {                          // MultipleOfThree 클래스 정의 시작
    public static void main(String[] args) {            // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);       // 사용자로부터 입력 받기 위해 Scanner 클래스 객체 생성

        System.out.print("수를 입력하시오: ");             // System.out.print() 메소드 호출하여 입력 안내 메세지 출력
        int number = scanner.nextInt();                 // int형 변수 number 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로 부터 입력 받은 값 리턴 받아 대입하여 초기화
        if (number % 3 == 0)                            // 만약 변수 number에 저장된 값을 3으로 나눈 나머지가 0이면, 즉 사용자가 입력한 수가 3의 배수이면
            System.out.println("3의 배수입니다.");        // System.out.println() 메소드 호출하여 3의 배수 안내 메세지 출력
        else                                            // 그렇지 않으면, 즉 사용자가 입력한 수가 3의 배수가 아니면
            System.out.println("3의 배수가 아닙니다.");    // System.out.println() 메소드 호출하여 안내 메세지 출력

        scanner.close();                                // scanner 객체의 close() 메소드 호출하여 객체 닫기
    }                                                   // main() 메소드 정의 끝
}                                                       // MultipleOfThree 클래스 정의 끝
