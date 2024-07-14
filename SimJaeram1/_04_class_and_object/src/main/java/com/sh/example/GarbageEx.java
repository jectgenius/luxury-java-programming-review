package com.sh.example;

public class GarbageEx {                        // GarbageEx 클래스 정의 시작
    public static void main(String[] args) {    // main() 메소드 정의 시작
        String a = new String("Good");  // String 객체 a 선언 동시에 "Good" 생성하여 대입
        String b = new String("Bad");   // String 객체 b 선언 동시에 "Bad" 생성하여 대입
        String c = new String("Normal");// String 객체 c 선언 동시에 "Normal" 생성하여 대입
        String d, e;                            // String 객체 d, e 선언, 레퍼런스 변수만 선언된 상태

        a = null;                               // "Good" 객체를 가리키는 레퍼런스가 없음, 가비지 발생
        d = c;                                  // "Normal" 객체를 가리키는 레퍼런스는 d, c 2개
        c = null;                               // "Normal" 객체를 가리키는 레퍼런스는 d 1개, 1개라도 있으므로 가비지는 발생하지 않음
    }                                           // main() 메소드 정의 끝
}                                               // GarbageEx 클래스 정의 끝
