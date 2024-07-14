package com.sh.example;

import java.util.Scanner;                           // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ContinueExample {                      // ContinueExample 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        Scanner sc = new Scanner(System.in);        // 사용자로부터 입력 받기 위해 Scanner 객체 생성

        // 변수 선언
        int sum = 0;                                // int형 변수 sum 선언 동시에 0 대입하여 초기화, 총합

        // 입력, 총합 계산
        System.out.println("정수를 5개 입력하세요.");  // System.out.println() 메소드 호출하여 정수 입력 안내 메세지 출력
        for(int i = 0; i < 5; i++) {                // 반복 제어 변수 int형 변수 i 선언 동시에 0 대입하여 초기화, i가 5보다 작을 동안 반복, i에 +1
            int n = sc.nextInt();                   // int형 변수 n 선언 동시에 sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 리턴 받아 대입, 사용자가 입력한 정수

            if(n <= 0)                              // 만약 변수 n에 저장된 값이 0보다 작거나 같으면, 즉 사용자가 입력한 정수가 양수가 아니면
                continue;                           // 다음 반복으로 넘어감, 즉, sum에 합하지 않음
            else                                    // 그렇지 않으면, 즉 사용자가 입력한 정수가 양수이면
                sum += n;                           // sum에 합함
        }

        // 출력
        System.out.println("양수의 합은 " + sum);    // System.out.println() 메소드 호출하여 사용자가 입력한 정수 중 양수들의 합 안내 메세지 출력

        sc.close();                                // sc 객체의 close() 메소드 호출하여 객체 닫기
    }                                               // main() 메소드 정의 끝
}                                                   // ContinueExample 클래스 정의 끝
