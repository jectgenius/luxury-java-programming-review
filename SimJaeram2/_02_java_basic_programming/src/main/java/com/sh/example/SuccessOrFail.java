package com.sh.example;                                     // 패키지 선언문, com.sh.example 패키지에 해당하는 클래스

import java.util.Scanner;                                   // Scanner 클래스 사용하기 위해 컴파일러에게 경로명 알려줌

public class SuccessOrFail {                                // SuccessOrFail 클래스 정의 시작, 단순 if문
    public static void main(String[] args) {                // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);           // Scanner 클래스형 레퍼런스 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 클래스 객체 생성

        System.out.print("정수를 입력하시오: ");               // System.out.print() 표준 출력 메소드 호출하여 문자열 "정수를 입력하시오: " 출력, 정수 입력 안내 메세지 출력
        int score = scanner.nextInt();                      // int형 변수 score 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 리턴 받아 대입하여 초기화, 점수
        if(score >= 80)                                     // 만약 변수 score에 저장된 값이 80보다 크거나 같으면
            System.out.println("축하합니다! 합격입니다.");      // System.out.print() 표준 출력 메소드 호출하여 문자열 "축하합니다! 합격입니다." 출력, 합격 안내 메세지 출력

        scanner.close();                                    // scanner 객체의 close() 메소드 호출하여 사용 종료
    }                                                       // main() 메소드 정의 끝
}                                                           // SuccessOrFail 클래스 정의 끝
