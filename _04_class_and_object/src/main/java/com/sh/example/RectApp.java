package com.sh.example;

import java.util.Scanner;                           // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

class Rectangle {                                   // Rectangle 클래스 정의 시작
    int width;                                      // int형 변수 width 선언, 직사각형의 너비
    int height;                                     // int형 변수 height 선언, 직사각형의 높이
    public int getArea() {                          // 리턴 타입이 int형인 getArea() 메소드 정의, 직사각형의 넓이 리턴
        return width * height;                      // width * height 연산 결과 리턴, 직사각형의 너비 * 높이
    }
}                                                   // Rectangle 클래스 정의 끝

public class RectApp {                              // RectApp 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        Rectangle rect = new Rectangle();           // Reactangle 클래스 객체 rect 선언 동시에 생성하여 대입, Rectangle 클래스로 만든 객체에 대한 레퍼런스 변수 rect 선언 동시에 Rectangle 객체 생성하여 대입
        Scanner scanner = new Scanner(System.in);   // 사용자로부터 입력 받기 위해 Scanner 클래스 객체 생성
        System.out.print(">> ");                    // System.out.print() 메소드 호출하여 입력 안내 메세지 출력
        rect.width = scanner.nextInt();             // rect 객체의 멤버 width에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입
        rect.height = scanner.nextInt();            // rect 객체의 멤버 height에 scanner 객체의 nextInt() 메소드 호출하여 사옹자로부터 입력 받은 값 int형으로 리턴 받아 대입
        System.out.println("사각형의 면적은 " + rect.getArea()); // System.out.println() 메소드 호출하여 rect 객체의 면적 안내 메세지 출력, 직사각형의 면적 출력
        scanner.close();                            // scanner 객체의 close() 메소드 호출하여 객체 닫기
    }                                               // main() 메소드 정의 끝
}                                                   // RectApp 클래스 정의 끝
