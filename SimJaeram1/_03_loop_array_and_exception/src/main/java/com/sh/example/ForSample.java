package com.sh.example;

public class ForSample {                            // ForSample 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        // 변수 선언
        int sum = 0;                                // int형 변수 sum 선언 동시에 0 대입하여 초기화, 총합

        for(int i = 1; i <= 10; i++) {              // int형 변수 i 선언 동시에 0 대입하여 초기화, i가 10보다 작거나 같을 동안 반복, i에 +1
            sum += i;                               // sum에 i 합함
            System.out.println(i);                  // System.out.println() 메소드 호출하여 현재 더하는 수 i 출력

            if(i <= 9)                              // i가 9보다 작거나 같은면
                System.out.println("+");            // 위에서 더하는 수 출력 후, 뒤에 +도 출력
            else {                                  // 그렇지 않으면, 즉 i가 10이면
                System.out.println("=");            // 위에서 더하는 수 i 즉 10 출력 후, 뒤에 =를 출력
                System.out.println("sum");          // 총합 sum 출력
            }
        }                                           // for문 끝

    }                                               // main() 메소드 정의 끝
}                                                   // ForSample 클래스 정의 끝
