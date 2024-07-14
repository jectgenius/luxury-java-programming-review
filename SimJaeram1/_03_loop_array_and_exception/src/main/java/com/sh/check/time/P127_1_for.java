package com.sh.check.time;

public class P127_1_for {                       // P127_1_for 클래스 정의 시작
    public static void main(String[] args) {    // main() 메소드 정의 시작
        // for문으로 출력
        for(int i = 0; i < 5; i++) {            // int형 변수 i 선언 동시에 0 대입하여 초기화, i가 5보다 작을 동안 반복, i에 +1
            for(int j = 0; i+j < 5; j++) {      // int형 변수 j 선언 동시에 0 대입하여 초기화, i+j가 5보다 작을 동안 반복, j에 +1
                System.out.print("*");          // System.out.print() 메소드 호출하여 문자열 "*" 출력
            }                                   // 한 줄 출력 완료, 안쪽 반복문 끝
            System.out.println();               // 줄바꿈
        }                                       // * 모두 출력 완료, 바깥쪽 반복문 끝
    }                                           // main() 메소드 정의 끝
}                                               // P127_1_for 클래스 정의 끝
