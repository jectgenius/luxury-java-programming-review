package com.sh.example;

import java.util.Scanner;                               // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class GradingSwitch {                            // GradingSwitch 클래스 정의 시작
    public static void main(String[] args) {            // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);       // 사용자로부터 입력 받기 위해 Scanner 클래스 객체 생성
        char grade;                                     // char형 변수 grade 선언, 학점

        System.out.print("점수를 입력하세요(0~100): ");    // System.out.print() 메소드 호출하여 점수 입력 안내 메세지 출력
        int score = scanner.nextInt();                  // int형 변수 score 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 리턴 받아 대입하여 초기화

        switch(score/10) {                              // score/10 연산 결과, 즉 사용자가 입력한 점수의 십의 자리가
            case 9:                                     // 9인 경우, 즉 90점대인 경우
                grade = 'A';                            // 변수 grade에 'A' 대입
                break;                                  // switch문을 빠져나감
            case 8:                                     // 8인 경우, 즉 80점대인 경우
                grade = 'B';                            // 변수 grade에 'B' 대입
                break;                                  // switch문을 빠져나감
            case 7:                                     // 7인 경우, 즉 70점대인 경우
                grade = 'C';                            // 변수 grade에 'C' 대입
                break;                                  // switch문을 빠져나감
            case 6:                                     // 6인 경우, 즉 60점대인 경우
                grade = 'D';                            // 변수 grade에 'D' 대입
                break;                                  // switch문을 빠져나감
            default:                                    // 모든 case문에 해당 되지 않는 경우
                grade = 'F';                            // 변수 grade에 'F' 대입
        }                                               // switch문 끝

        System.out.println("학점은 " + grade + "입니다.");// System.out.println() 메소드 호출하여 학점 안내 메세지 출력

        scanner.close();                                // scanner 객체의 close() 메소드 호출하여 객체 닫기
    }                                                   // main() 메소드 정의 끝
}                                                       // GradingSwitch 클래스 정의 끝
