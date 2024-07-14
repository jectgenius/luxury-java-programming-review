package com.sh.example;

import java.util.Scanner;                           // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class CoffeePrice {                          // CoffeePrice 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);   // 사용자로부터 입력 받기 위해 Scanner 객체 생성

        System.out.print("무슨 커피 드릴까요? ");      // System.out.print() 메소드 호출하여 입력 안내 메세지 출력
        String order = scanner.next();              // String형 변수 order 선언 동시에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 값 리턴 받아 대입하여 초기화, 메뉴
        int price = 0;                              // int형 변수 price 선언 동시에 0 대입하여 초기화, 가격

        switch(order) {                             // order에 저장된 문자열이, 즉 사용자가 입력한 메뉴가
            case "에스프레소":                        // "에스프레소"인 경우
            case "카푸치노":                         // "카푸치노"인 경우
            case "카페라떼":                         // "카페라뗴"인 경우
                price = 3500;                       // 변수 price에 3500 대입
                break;                              // switch문을 빠져나감
            case "아메리카노":                        // "아메리카노"인 경우
                price = 2000;                       // 변수 price에 2000 대입
                break;                              // switch문을 빠져나감
            default:                                // 모든 case문에 해당되지 않는 경우
                System.out.println("메뉴에 없습니다!");// System.out.println() 메소드 호출하여 문자열 "메뉴에 없습니다!" 출력
        }                                           // switch문 끝

        if(price != 0) System.out.print(order + "는 " + price + "원입니다."); // 만약 변수 price에 저장된 값이 0이 아니면, 즉 사용자가 입력한 메뉴가 있다면,
                                                                            // System.out.println() 메소드 호출하여 사용자가 입력한 메뉴의 가격 안내 메세지 출력
        scanner.close();                            // scanner 객체의 close() 메소드 호출하여 객체 닫기
    }                                               // main() 메소드 정의 끝
}                                                   // CoffeePrice 클래스 정의 끝
