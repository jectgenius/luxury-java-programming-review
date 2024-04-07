package com.sh.example;

class Circle {                                  // Circle 클래스 정의 시작
    int radius;                                 // int형 멤버 변수 radius 선언
    public Circle(int radius) {                 // 매개변수가 int형 1개인 생성자
        this.radius = radius;                   // 멤버 변수 radius에 매개변수 riadus 대입하여 초기화
    }
    public double getArea() {                   // 리턴 타입이 double형인 getArea() 메소드 정의
        return 3.14*radius*radius;              // 연산 결과 리턴, 반지름이 radius인 원의 면적
    }
}                                               // Circle 클래스 정의 끝

public class CircleArray {                      // public으로 선언된 CircleArray 정의 시작
    public static void main(String[] args) {    // main() 메소드 정의 시작
        Circle[] c;                             // Circle 객체 배열에 대한 레퍼런스 변수 c 선언
        c = new Circle[5];                      // c에 크기가 5인 Circle 객체 배열 생성하여 대입

        for(int i = 0; i < c.length; i++) {     // 반복제어변수 int형 변수 i 선언 동시에 0 대입하여 초기화, i가 배열 c의 크기 length 보다 작을 동안 반복, i에 +1
            c[i] = new Circle(i);               // Circle 객체 배열 c의 인덱스 i번째 요소에 Circle 객채 생성하여 대입, 매개변수가 int형 1개인 생성자 호출하여 객체 생성
            System.out.println((int) (c[i].getArea()) + " ");   // System.out.println() 메소드 호출하여 객체 배열 c의 인덱스 i번째 요소에 getArea() 메소드 호출하여
                                                        // 리턴 받은 면적 int형으로 강제 타입 변환한 뒤, 출력
        }                                       // for문 끝
    }                                           // main() 메소드 정의 끝
}                                               // public으로 선언된 CircleArray 정의 시작
