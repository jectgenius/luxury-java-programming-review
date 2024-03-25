package com.sh.check.time;

public class P127_1_doWhile {                   // P127_1_doWhile 클래스 정의 시작
    public static void main(String[] args) {    // main() 메소드 정의 시작
        int i, j;                               // 반복문 제어변수 int형 변수 i, j 선언

        i = 0;                                  // i에 0 대입하여 초기화
        do {                                    // 바깥쪽 do while문 시작
            j = 0;                              // j에 0 대입하여 초기화
            do {                                // 안쪽 do while문 시작
                System.out.print("*");          // System.out.print() 메소드 호출하여 문자열 "*" 출력
                j++;                            // j에 +1
            } while(i+j < 5);                   // i+j가 5보다 작을동안 반복
            System.out.println();               // 한줄 출력 완료, System.out.println() 메소드 호출하여 줄바꿈
            i++;                                // i에 +1
        } while(i < 5);                         // i가 5보다 작을동안 반복
                                                // * 모두 출력 완료
    }                                           // main() 메소드 정의 끝
}                                               // P127_1_doWhile 클래스 정의 끝
