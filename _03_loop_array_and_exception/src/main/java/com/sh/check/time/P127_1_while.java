package com.sh.check.time;

public class P127_1_while {                     // P127_1_while 클래스 정의 시작
    public static void main(String[] args) {    // main() 메소드 정의 시작
        // while문으로 출력
        int i, j;                               // 반복문 제어변수 int형 변수 i, j 선언

        i = 0;                                  // 변수 i에 0 대입하여 초기화
        while(i < 5) {                          // i가 5보다 작을 동안 반복
            j = 0;                              // 변수 j에 0 대입하여 초기화
            while (i+j < 5) {                   // i+j가 5보다 작을 동안 반복
                System.out.print("*");          // System.out.print() 메소드 호출하여 문자열 "*" 출력
                j++;                            // j에 +1, 안쪽 반복문 끝
            }                                   // 한 줄 출력 완료
            System.out.println();               // System.out.println() 메소드 호출하여 줄바꿈
            i++;                                // i에 +1
        }                                       // * 모두 출력 완료, 바깥쪽 반복문 끝

    }                                           // main() 메소드 정의 끝
}                                               // P127_1_while 클래스 정의 끝
