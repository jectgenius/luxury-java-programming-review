package com.sh.check.time.ch03;

public class P137_3 {                                               // P137_3 클래스 정의 시작
    public static void main(String[] args) {                        // main() 메소드 정의 시작
        int[] tenArray = new int[10];                               // 크기가 10인 int형 배열 tenArray 선언 및 생성
        int sum  = 0;                                               // int형 변수 sum 선언 동시에 0 대입하여 초기화, 총합

        for(int i = 0; i < 10; i++) {                               // int형 변수 i 선언 동시에 1 대입하여 초기화, i가 10보다 작을 동안 반복, i에 +1
            tenArray[i] = i + 1;                                    // 배열 tenArray의 i번째 요소에 i+1 대입하여 초기화
            sum += tenArray[i];                                     // 변수 sum에 배열 tenArray의 i번째 요소 더 함
        }                                                           // for문 끝

        System.out.println("배열 tenArray의 모든 원소의 합은 " + sum);  // System.out.println() 메소드 호출하여 배열 tenArray의 모든 원소의 합인 sum 출력
    }                                                               // main() 메소드 정의 끝
}                                                                   // P137_3 클래스 정의 끝
