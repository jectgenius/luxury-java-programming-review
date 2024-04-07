package com.sh.check.time;

public class CircleApp {                                        // CircleApp 클래스 정의 시작
    public static void main(String[] args) {                    // main() 메소드 정의 시작
        Circle pizza = new Circle(10, "자바피자");          // Circle 클래스 객체 pizza 선언 동시에 생성, 매개변수가 2개인 생성자 호출되어 초기화

        double area = pizza.getArea();                          // double형 변수 area 선언 동시에 pizza 객체의 getArea() 메소드 호출하여 리턴 받은 면적 대입하여 초기화
        System.out.println(pizza.name + "의 면적은 " + area);   // System.out.println() 메소드 호출하여 pizza 객체의 이름, 면적 안내 메세지 출력

        Circle donut = new Circle();                            // Circle 클래스 객체 donut 선언 동시에 생성, 매개변수가 없는 기본 생성자 호출되어 초기화
        donut.name = "도넛피자";                                // donut 객체의 멤버 변수 name에 "도넛피자" 대입하여 초기화, 멤버 변수 name은 "" -> "도넛피자"로 변경
        area = donut.getArea();                                 // 변수 area에 donut 객체의 getArea() 메소드 호출하여 리턴 받은 면적 대입
        System.out.println(donut.name + "의 면적은 " + area);   // System.out.println() 메소드 호출하여 donut 객체의 이름, 면적 안내 메세지 출력
    }                                                           // main() 메소드 정의 끝
}                                                               // CircleApp 클래스 정의 끝
