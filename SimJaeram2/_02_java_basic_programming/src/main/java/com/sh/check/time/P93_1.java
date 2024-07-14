package com.sh.check.time;

public class P93_1 {                            // P93_1 클래스 정의 시작
    public static void main(String[] args) {    // main() 메소드 정의 시작
        int x = 2, y = 10, z = 0;               // int형 변수 x, y, z 선언 동시에 각각 2, 10, 0 대입하여 초기화
        z = x++*2+--y-5+x*(y%2);                // 연산자 우선순위 중 최우선은 () 괄호?
        System.out.println(z);                  // System.out.println() 표준 출력 메소드 호출하여 변수 z에 저장된 값 출력
    }                                           // main() 메소드 정의 끝
}                                               // P93_1 클래스 정의 끝
