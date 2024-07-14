package com.sh.example;

public class DoWhileSample {                    // DoWhileSample 클래스 정의 시작
    public static void main(String[] args) {    // main() 메소드 정의 시작
        char c = 'a';                           // char형 변수 c 선언 동시에 문자 'a' 대입하여 초기화

        // 알파벳 소문자 출력
        do {                                    // do whilea문은 다른 반복문과 달리 무조건 1번은 반복을 실행한다.
            System.out.print(c);                // System.out.print() 메소드 호출하여 변수 c에 저장된 문자 값 출력
            c = (char) (c + 1);                 // char형 변수 c에 +1 정수 연산, 이 정수를 char형으로 강제타입변환하여 char형 변수 c에 대힙
        } while(c <= 'z');                      // char형 변수 c에 저장된 값이 문자 'z'가 보다 작거나 같으면, 즉 사전순으로 'z' 이전이면

    }                                           // main() 메소드 정의 끝
}                                               // DoWhileSample 클래스 정의 끝
