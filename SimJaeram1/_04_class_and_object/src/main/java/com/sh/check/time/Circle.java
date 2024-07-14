package com.sh.check.time;

public class Circle {                                           // Circle 클래스 정의 시작
    int radius;                                                 // int형 멤버변수 radius 선언, 반지름
    String name;                                                // String형 멤버변수 name 선언, 이름

    public Circle() {                                           // 기본 생성자 정의, 매개변수가 없는 생성자
        radius = 1; name = "";
    }
    public Circle(int r, String n) {
        radius = r; name = n;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }       // 리턴타입이 double인 getArea() 메소드 정의, 원의 면적 리턴

    public static void main(String[] args) {                    // main() 메소드 정의 시작
        Circle pizza;                                           // Circle 클래스 타입 레퍼런스 pizza 선언
        pizza = new Circle();                                   // pizza에 Circle 객체 생성하여 대입
        pizza.radius = 10;                                      // pizza 객체에 멤버 radius에 10 대입, pizza 반지름 10
        pizza.name = "자바피자";                                  // pizza 객체에 멤버 name에 "자바피자" 대입, pizza 이름 자바피자
        double area = pizza.getArea();                          // double형 변수 area 선언 동시에 pizza 객체의 메소드 getArea() 호출하여 면적 리턴받아 대입하여 초기화, pizza의 면적
        System.out.println(pizza.name + "의 면적은 " + area);     // System.out.println() 메소드 호출하여 pizza 객체의 이름, 면적 출력

        Circle donut = new Circle();                            // Circle 객체 donut 선언 동시에 객체 생성하여 대입
        donut.radius = 2;                                       // donut의 멤버 radius에 2 대입, donut 반지름 2
        donut.name = "자바도넛";                                  // donut의 멤버 namedp "자바도넛" 대입, donut 이름 자바도넛
        area = donut.getArea();                                 // 변수 area에 donut 객체의 메소드 getArea() 호출하여 면적 리턴 받아 대입
        System.out.println(donut.name + "의 면적은 " + area);     // System.out.println() 메소드 호출하여 donut 객체의 이름, 면적 출력
    }                                                           // main() 메소드 정의 끝
}                                                               // Circle 클래스 정의 끝
