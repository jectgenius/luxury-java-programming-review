package com.sh.example;                                     // 패키지 선언문, com.sh.example에 해당하는 클래스

import java.util.Scanner;                                   // import문, Scanner 클래스 사용하기 위해 컴파일러에게 경로명 알려줌

public class NestedIf {                                     // NestedIf 클래스 정의 시작
    public static void main(String[] args) {                // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);           // Scanner 클래스 레퍼런스 변수 scanner 선언 동시에 Scanner 클래스 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 객체 생성

        System.out.print("점수를 입력하세요(0~100): ");        // System.out.print() 표준 출력 메소드 호출하여 문자열 "점수를 입력하세요(0~100): " 출력, 점수 입력 안내 메세지 출력
        int score = scanner.nextInt();                      // int형 변수 score 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화, 점수
        System.out.print("학년을 입력하세요(1~4): ");          // System.out.print() 표준 출력 메소드 호출하여 문자열 "학년을 입력하세요(1~4): " 출력, 학년 입력 안내 메세지 출력
        int year = scanner.nextInt();                       // int형 변수 year 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화, 학년

        if(score >= 60) {                                   // 만약 변수 score에 저장된 값이 60보다 크거나 같으면, 즉 점수가 60점 이상이면
            if(year != 4)                                   // 만약 변수 year에 저장된 값이 4가 아니면, 즉 학년이 4학년이 아니면
                System.out.println("합격!");                 // System.out.print() 표준 출력 메소드 호출하여 문자열 "합격!" 출력, 즉 점수가 60점 이상이고 학년이 4학년이 아니면 합격 안내 메세지 출력
            else if(score >= 70)                            // 그렇지 않고 만약 변수 score에 저장된 값이 70보다 크거나 같으면, 즉 점수가 70점 이상이면
                System.out.println("합격!");                 // System.out.print() 표준 출력 메소드 호출하여 문자열 "합격!" 출력, 즉 점수가 70점 이상이고 학년이 4학년이면 합격 안내 메세지 출력
            else                                            // 그렇지 않으면
                System.out.println("불합격!");               // System.out.print() 표준 출력 메소드 호출하여 문자열 "불합격!" 출력, 즉 학년은 4학년인데 점수가 70점 이상이 아니면 불합격 안내 메세지 출력
        }
        else                                                // 그렇지 않으면, 즉 점수가 60점 이상이 아니면
            System.out.println("불합격!");                   // System.out.print() 표준 출력 메소드 호출하여 문자열 "불합격!" 출력 불합격 안내 메세지 출력

        scanner.close();                                    // scanner 객체 close() 메소드 호출하여 사용종료
    }                                                       // main() 메소드 정의 끝
}                                                           // NestedIf 클래스 정의 끝
