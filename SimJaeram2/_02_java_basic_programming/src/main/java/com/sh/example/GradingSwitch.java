package com.sh.example;                                 // 패키지 선언문, com.sh.example에 해당하는 클래스

import java.util.Scanner;                               // import문, Scanner 클래스 사용하기 위해 컴파일러에게 경로명 알려줌

public class GradingSwitch {                            // GradingSwitch 클래스 정의 시작
    public static void main(String[] args) {            // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);       // Scanner 클래스 레퍼런스 변수 scanner 선언 동시에 Scanner 클래스 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 객체 생성

        char grade;                                     // char형 변수 grade 선언, 학점
        System.out.print("점수를 입력하세요(0~100): ");    // System.out.print() 표준 출력 메소드 호출하여 문자열 "점수를 입력하세요(0~100): " 출력, 점수 입력 안내 메세지 출력
        int score = scanner.nextInt();                  // int형 변수 score 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화, 점수

        switch(score/10) {                              // 변수 score에 저장된 값을 10으로 나눈 몫이
            case 10:                                    // 10인 경우
            case 9:                                     // 9인 경우
                grade = 'A';                            // 변수 grade에 문자 'A' 대입하여 초기화
                break;                                  // switch문을 빠져나감
            case 8:                                     // 8인 경우
                grade = 'B';                            // 변수 grade에 문자 'B' 대입하여 초기화
                break;                                  // switch문을 빠져나감
            case 7:                                     // 7인 경우
                grade = 'C';                            // 변수 grade에 문자 'C' 대입하여 초기화
                break;                                  // switch문을 빠져나감
            case 6:                                     // 6인 경우
                grade = 'D';                            // 변수 grade에 문자 'D' 대입하여 초기화
                break;                                  // switch문을 빠져나감
            default:                                    // 모든 case에 해당되지 않는 경우
                grade = 'F';                            // 변수 grade에 문자 'F' 대입하여 초기화
        }                                               // switch문 끝

        System.out.println("학점은 " + grade + "입니다"); // System.out.println() 표준 출력 메소드 호출하여 문자열 "학점은 " + grade + "입니다" 출력, 학점 안내 메세지 출력

        scanner.close();                                // scanner 객체 close() 메소드 호출하여 사용종료
    }                                                   // main() 메소드 정의 끝
}                                                       // GradingSwitch 클래스 정의 끝
