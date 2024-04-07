package com.sh.example;

import java.util.Scanner;                           // Scanner 클래스 사용하기위헤 컴파일러에게 경로명 알려줌

class CurrencyConverter {                           // default로 선언된 CurrencyConverter 클래스 정의 시작
    private static double rate;                     // private으로 선언된 double형 static 필드 rate 선언, 환율 즉, 1달러당 원화
    public static double toDollar(double won) {     // public으로 선언된 리턴 타입이 double형인 static 메소드 toDollar 정의, 원화를 달러화로 변환
        return won / rate;
    }
    public static double toKWR(double dollar) {     // public으로 선언된 리턴 타입이 double형인 static 메소드 toKWR 정의, 달러화를 원화로 변환
        return dollar * rate;
    }
    public static void setRate(double r) {          // public으로 선언된 리턴 타입이 void인 static 메소드 setRate() 정의, 환율을 설정
        rate = r;
    }
}                                                   // CurrencyConverter 클래스 정의 끝

public class StaticMember {                         // public으로 선언된 StaticMember 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);   // 사용자로부터 입력 받기 위해 Scanner 클래스 객체 선언 동시에 생성

        System.out.print("환율(1달러)>> ");          // System.out.println() 메소드 호출하여 환율 입력 안내 메세지 출력
        double rate = scanner.nextDouble();         // double형 변수 rate 선언 동시에 scanner 객체 호출하여 사용자로부터 입력 받은 값 double형으로 리턴 받아 대입하여 초기화
        CurrencyConverter.setRate(rate);            // CurrencyConverter 클래스의 static 메소드 setRate() 호출하여 환율 설정
        System.out.println("백만원은 $" + CurrencyConverter.toDollar(1_000_000) +
                "입니다.");                          // 백만원을 달러화로 변환한 값 출력
        System.out.println("$100은 " + CurrencyConverter.toKWR(100) + "원입니다.");
                                                    // 100달러를 원화로 변환한 값 출력
        scanner.close();                            // scanner 객체의 close() 메소드 호출하여 객체 닫기
    }                                               // main() 메소드 정의 끝
}                                                   // public으로 선언된 StaticMember 클래스 정의 끝
