package com.sh.example;

public class NestedLoop {                                   // NestedLoop 클래스 정의 시작
    public static void main(String[] args) {                // main() 메소드 정의 시작

        for(int i = 1; i < 10; i++) {                       // 반복문 제어 변수로 int형 변수 i 선언 동시에 1 대입하여 초기화, i는 10보다 작을 동안 반복, i에 +1
            for(int j = 1; j < 10; j++) {                   // 반복문 제어 변수로 int형 변수 j 선언 동시에 1 대입하여 초기화, j는 10보다 작을 동안 반복, j에 +1
                System.out.print(i + "*" + j + "=" + i*j);  // System.out.print() 메소드 호출하여 i * j 출력, 구구단 1개
                System.out.print('\t');                     // System.out.print() 메소드 호출하여 '\t' 출력, 탭
            }                                               // 구구단 1단 모두 출력 완료
            System.out.println();                           // System.out.println() 메소드 호출하여 줄바꿈
        }                                                   // 구구단 9단까지 모두 출력 완료

    }                                                       // main() 메소드 정의 끝
}                                                           // NestedLoop 클래스 정의 끝
