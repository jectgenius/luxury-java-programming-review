package com.sh.exercise;

public class WhileTest {
    public static void main(String[] args) {
        // 변수
        int sum = 0, i = 0;                     // int형 변수 sum, i 선언 동시에 0 대입, i에 0 대입하여 초기화

        // 연산                                  // 총합, 반복제어변수
        while(i < 100) {                        // 변수 i가 100보다 작을동안 반복
            sum = sum + i;                      // sum에 i 합함
            i += 2;                             // 변수 i에 +2
        }

        // 출력
        System.out.println(sum);                // System.out.println() 메소드 호출하여 변수 sum에 저장된 값 출력
    }
}
