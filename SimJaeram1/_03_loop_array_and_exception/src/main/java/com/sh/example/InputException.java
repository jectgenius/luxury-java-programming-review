package com.sh.example;

import java.util.InputMismatchException;                            // 대부분의 예외처리 클래스는 java.lang 패키지에 있는데, InputMismatch 클래스는 java.util 패키지에 있어 import문 선언 필요
import java.util.Scanner;

public class InputException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int sum = 0, n = 0;                                          // int형 변수 sum, n 선언 동시에 각각 0 대입하여 초기화

        // 입력
        System.out.println("정수 3개를 입력하세요");                     // System.out.println() 메소드 호출하여 정수 입력 안내 메세지 출력
        for(int i = 0; i < 3; i++) {                                 // 반복제어변수 int형 변수 i 선언 동시에 0 대입하여 초기화, i가 3보다 작을동안 반복, i에 +1
            System.out.print(i + ">>");                              // System.out.print() 메소드 호출하여 변수 i + 프롬프트 출력

            try{                                                     // 예외가 발생할 가능성이 있는 문장을 try 블럭에 작성
                n = sc.nextInt();                                    // 변수 n에 sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값을 정수형으로 변환하여 리턴 받아 대입
            }                                                        // 사용자가 정수가 아닌 문자를 입력하면 InputMismatchException 예외 발생, ex R 또는 4.0
            catch(InputMismatchException e) {                        // InputMismatchException 예외 처리 코드
                System.out.println("정수가 아닙니다. 다시 입력하세요!");  // System.out.println() 메소드 호출하여 문자열 "정수가 아닙니다. 다시 입력하세요!" 안내 메세지 출력
                sc.nextLine();                                       // sc 객체의 nextLint() 메소드 호출하여 현재 입력 스트림에 남아 있는 토큰을 지운다.
                i--;                                                 // 변수 i에 -1, 반복제어변수 i가 증가하지 않도록 미리 감소
                continue;                                            // 다음 반복으로 넘어감, for문은 증감식으로 분기
            }

            sum += n;                                                // 변수 sum에 n을 합함, 즉 사용자가 입력한 문자가 int형 정수이면 총합에 합함
        }

        // 출력
        System.out.println("합은 " + sum);                            // System.out.println() 메소드 호출하여 변수 sum에 저장된 총합 출력

        sc.close();
    }
}
