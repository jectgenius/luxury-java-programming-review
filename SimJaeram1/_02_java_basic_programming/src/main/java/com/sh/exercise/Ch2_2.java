package com.sh.exercise;

import java.util.Scanner;                                           // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch2_2 {                                                // Ch2_2 클래스 정의 시작
    public static void main(String[] args) {                        // main() 메소드 정의 시작
        // 변수 선언
        Scanner sc = new Scanner(System.in);                        // 사용자로부터 입력 받기 위해 Scanner 클래스 객체 생성
        int number, ten, one;                                       // int형 변수 number, ten, one 선언, 즉 사용자로부터 입력 받은 두 자리수 정수, 십의 자리 수, 일의 자리 수
        boolean isSame;                                             // boolean형 변수 isSame 선언, 즉 십의 자리 수와 일의 자리 수 동일 여부

        // 두 자리수 정수 입력
        System.out.print("2자리수 정수 입력(10~99)>>");                // System.out.print() 메소드 호출하여 2자리 수 정수 입력 안내 메세지 출력
        number = sc.nextInt();                                      // 변수 number에 sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 리턴 받아 대입하여 초기화

        // 연산
        ten = number / 10;                                          // 변수 ten에 number를 10으로 나눈 몫 연산 결과 대입, 즉 사용자가 입력한 수의 십의 자리 수
        one = number % 10;                                          // 변수 one에 number를 10으로 나눈 나머지 연산 결과 대입, 즉 사용자가 입력한 수의 일의 자리 수
        isSame = ten == one;                                        // 변수 isSame에 ten 과 one 동등 비교 연산 결과 대입, 즉 사용자가 입력한 수의 십의 자리 수와 일의 자리 수 동일 여부

        // 결과 출력
        if(isSame) {                                                // 만약 isSame이 true이면, 즉 십의 자리 수와 일의 자리 수가 같으면
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다."); // System.out.println() 메소드 호출하여 동일함 안내 메세지 출력
        }
        else {                                                      // 그렇지 않으면, 즉 십의 자리 수와 일의 자리 수가 다르면
            System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");  // System.out.println() 메소드 호출하여 다름 안내 메세지 출력
        }

        sc.close();                                                 // sc 객체의 close() 메소드 호출하여 객체 닫기
    }                                                               // main() 메소드 정의 끝
}                                                                   // Ch2_2 클래스 정의 끝
