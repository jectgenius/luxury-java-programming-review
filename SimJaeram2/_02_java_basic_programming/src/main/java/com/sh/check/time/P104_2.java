package com.sh.check.time;

public class P104_2 {                           // P2_104 클래스 정의 시작
    public static void main(String[] args) {    // main() 메소드 정의 시작
        int i = 4;                              // int형 변수 i 선언 동시에 4 대입하여 초기화
        if(i % 2 == 0) {                        // 만약 i를 2로 나눈 나머지가 0이면
            if(i % 3 == 0)                      // 만약 i를 3으로 나눈 나머지가 0이면
                System.out.println("6의 배수");  // i가 2의 배수이고, 3의 배수이면, 즉, 6의 배수이면 문자열 "6의 배수" 출력
        }
        else {                                  // i를 2로 나눈 나머지가 0이 아니면, 즉 1이면,
            System.out.println("홀수");          // 문자열 "홀수" 출력
        }
    }                                           // main() 메소드 정의 끝
}                                               // P2_104 클래스 정의 끝
