package com.sh.check.time;

public class P127_3 {                                           // P127_3 클래스 정의 시작
    public static void main(String[] args) {                    // main() 메소드 정의 시작
        int sum = 0;                                            // int형 변수 sum 선언 동시에 0 대입하여 초기화, 총합

        for(int i = 1; i <= 100; i++) {                         // int형 변수 i 선언 동시에 1 대입하여 초기화, i가 100보다 작거나 같을 동안 반복, i에 +1
            if(i % 3 == 0) {                                    // 만약 i를 3으로 나눈 나머지가 0이면, 즉 i가 3의 배수이면
                sum += i;                                       // sum = sum + i;, 즉 sum에 i 더하기
            }                                                   // if문 끝
        }                                                       // for문 끝

        System.out.println("1부터 100까지 3의 배수의 합은 " + sum); // System.out.println() 메소드 호출하여 1부터 100까지 3의 배수의 합 sum 출력
    }                                                           // main() 메소드 정의 끝
}                                                               // P127_3 클래스 정의 끝
