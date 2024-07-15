package com.sh.example;                                                     // 패키지 선언문, com.sh.example에 해당하는 클래스

import java.util.Scanner;                                                   // import문, Scanner 클래스 사용하기 위해 컴파일러에게 경로명 알려줌

public class CoffeePrice {                                                  // CoffeePrice 클래스 정의 시작
    public static void main(String[] args) {                                // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);                           // Scanner 클래스 레퍼런스 변수 scanner 선언 동시에 Scanner 클래스 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 객체 생성

        System.out.print("무슨 커피 드릴까요? ");                              // System.out.print() 표준 출력 메소드 호출하여 문자열 "무슨 커피 드릴까요? " 출력, 커피 입력 안내 메세지 출력
        String order = scanner.next();                                      // String 클래스 레퍼런스 변수 order 선언 동시에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 문자열 리턴 받아 대입하여 초기화, 커피
        int price = 0;                                                      // int형 price 선언 동시에 0 대입하여 초기화, 커피 가격

        switch (order) {                                                    // 변수 order에 저장된 문자열이
            case "에스프레소":                                                // "에스프레소"인 경우
            case "카푸치노":                                                 // "카푸치노"인 경우
            case "카페라떼":                                                 // "카페라떼"인 경우
                price = 3500; break;                                        // 변수 price에 3500 대입하여 저장, switch문을 빠져나감
            case "아메리카노":                                                // "아메리카노"인 경우
                price = 2000; break;                                        // 변수 price에 2000 대입하여 저장, switch문을 빠져나감
            default:                                                        // 모든 case에 해당되지 않는 경우
                System.out.println("메뉴에 없습니다!");                        // System.out.println() 표준 출력 메소드 호출하여 문자열 "메뉴에 없습니다!" 출력, 없는 메뉴 안내 메세지 출력
        }                                                                   // switch문 끝

        if(price != 0)                                                      // 만약 변수 price에 저장된 값이 0이 아니면, 즉 사용자가 메뉴에 있는 커피를 입력한 경우
            System.out.print(order + "는 " + price + "원입니다");             // System.out.println() 표준 출력 메소드 호출하여 문자열 order + "는 " + price + "원입니다" 출력, 메뉴 가격 안내 메세지 출력

        scanner.close();                                                    // scanner 객체 close() 메소드 호출하여 사용종료
    }                                                                       // main() 메소드 정의 끝
}                                                                           // CoffeePrice 클래스 정의 끝
