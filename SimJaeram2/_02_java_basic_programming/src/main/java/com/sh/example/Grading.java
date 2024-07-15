package com.sh.example;                                     // 패키지 선언문, com.sh.example에 해당하는 클래스

import java.util.Scanner;                                   // import문, Scanner 클래스 사용하기 위해 컴파일러에게 경로명 알려줌

public class Grading {                                      // Grading 클래스 정의 시작
    public static void main(String[] args) {                // main() 메소드 정의 시작
        char grade;                                         // char형 변수 grade 선언, 학점
        Scanner scanner = new Scanner(System.in);           // Scanner 클래스 레퍼런스 변수 scanner 선언 동시에 Scanner 클래스 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 객체 생성

        System.out.print("점수를 입력하세요(0~100): ");        // System.out.print() 표준 출력 메소드 호출하여 문자열 "점수를 입력하세요(0~100): " 출력, 점수 입력 안내 메세지 출력
        int score = scanner.nextInt();                      // int형 변수 score 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화, 점수
        if(score >= 90)                                     // 만약 변수 score에 저장된 값이 90보다 크거나 같으면, 즉 score >= 90
            grade = 'A';                                    // 변수 grade에 문자 'A' 대입하여 저장
        else if(score >= 80)                                // 그렇지 않고, 만약 변수 score에 저장된 값이 80보다 크거나 같으면, 즉 80 <= score < 90
            grade = 'B';                                    // 변수 grade에 문자 'B' 대입하여 저장
        else if(score >= 70)                                // 그렇지 않고, 만약 변수 score에 저장된 값이 70보다 크거나 같으면, 즉 70 <= score < 80
            grade = 'C';                                    // 변수 grade에 문자 'C' 대입하여 저장
        else if(score >= 60)                                // 그렇지 않고, 만약 변수 score에 저장된 값이 60보다 크거나 같으면, 즉 60 <= score < 70
            grade = 'D';                                    // 변수 grade에 문자 'D' 대입하여 저장
        else                                                // 그렇지 않으면, 즉 score < 60
            grade = 'F';                                    // 변수 grade에 문자 'F' 대입하여 저장
        System.out.println("학점은 " + grade + "입니다.");    //  System.out.println() 표준 출력 메소드 호출하여 문자열 "학점은 " + grade + "입니다." 출력, 학점 안내 메세지 출력

        scanner.close();                                    // scanner 객체 close() 메소드 호출하여 사용종료
    }                                                       // main() 메소드 정의 끝
}                                                           // Grading 클래스 정의 끝
