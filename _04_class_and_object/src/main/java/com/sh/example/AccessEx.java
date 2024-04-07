package com.sh.example;

class Sample {                              // 디폴트로 선언된 Sample 클래스 정의 시작
    public int a;                           // public으로 선언된 int형 필드 a 선언, 즉, 모든 클래스에서 접근 가능
    private int b;                          // private을 선언된 int형 필드 b 선언, 즉, 동일한 클래스에서만 접근 가능
    int c;                                  // 디폴트로 선언된 int형 필드 c 선언, 즉, 동일한 패키지에 있는 클래스에서 접근 가능
}                                           // Sample 클래스 정의 끝

public class AccessEx {                     // public으로 선언된 AccessEx 클래스 정의 시작
    public static void main(String[] args) {// main() 메소드 정의 시작
        Sample sample = new Sample();       // Sample 클래스 객체 sample 선언 동시에 매개변수가 없는 기본 생성자 호출하여 객체 생성
        sample.a = 10;                      // sample 객체의 멤버 a에 10 대입
//        sample.b = 10;                    // sample 객체의 멤버 b에 10 대입, Sample 객체의 멤버 필드 b는 private으로 선언되어 접근 불가, 컴파일 오류 발생
        sample.c = 10;                      // sample 객체의 멤버 c에 10 대입
    }                                       // main() 메소드 정의 끝
}                                           // public으로 선언된 AccessEx 클래스 정의 끝
