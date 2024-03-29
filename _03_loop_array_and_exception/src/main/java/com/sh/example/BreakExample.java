package com.sh.example;

import java.util.Scanner;                               // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class BreakExample {                             // BreakExample 클래스 정의 시작
    public static void main(String[] args) {            // main() 메소드 정의 시작
        Scanner sc = new Scanner(System.in);            // 사용자로부터 입력 받기 위해 Scanner 객체 생성

        System.out.println("exit을 입력하면 종료됩니다.");  // System.out.println() 메소드 호출하여 안내 메세지 출력

        // 입력
        while(true) {                                   // 무한반복
            System.out.print(">>");                     // System.out.print() 메소드 호출하여 문자열 ">>" 출력, 프롬프트
            String text = sc.nextLine();                // String형 변수 text 선언 동시에 sc 객체의 nextLint() 메소드 호출하여 사용자로부터 입력 받은 값 리턴 받아 대입
            if(text.equals("exit"))                     // 만약 변수 text에 저장된 문자열이 "exit"과 같으면
                break;                                  // while문을 빠져나감
        }                                               // while문 끝

        System.out.println("종료합니다...");              // System.out.println() 메소드 호출하여 종료 안내 메세지 출력

        sc.close();                                     // sc 객체의 close() 메소드 호출하여 객체 닫기
    }                                                   // main() 메소드 정의 끝
}                                                       // BreakExample 클래스 정의 끝
