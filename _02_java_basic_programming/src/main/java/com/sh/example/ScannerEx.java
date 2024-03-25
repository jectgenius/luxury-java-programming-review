package com.sh.example;

import java.util.Scanner;                                   // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ScannerEx {                                    // ScannerEx 클래스 정의 시작
    public static void main(String[] args) {                // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요."); // 입력 안내 메세지 출력

        String name = scanner.next();                       // scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 값을 문자열로 리턴하여 String형 변수 name에 대입
        System.out.print("이름은 " + name + ", ");           // System.out.print() 메소드 호출하여 이름 출력

        String city = scanner.next();                       // scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 값을 문자열로 리턴하여 String형 변수 city에 대입
        System.out.print("도시는 " + city + ", ");           // System.out.print() 메소드 호출하여 도시 출력

        int age = scanner.nextInt();                        // scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값을 int형 정수로 리턴하여 int형 변수 age에 대입
        System.out.print("나이는 " + age + "살, ");           // System.out.print() 메소드 호출하여 나이 출력

        double weight = scanner.nextDouble();               // scanner 객체의 nextDouble() 매소드 호출하여 사용자로부터 입력 받은 값을 double형 실수로 리턴하여 double형 변수 weight에 대입
        System.out.print("체중은 " + weight + "kg, ");       // System.out.print() 메소드 호출하여 체중 출력

        boolean isSingle = scanner.nextBoolean();           // scanner 객체의 nextBoolean() 메소드 호출하여 사용자로부터 입력 받은 값을 boolean형 논리값으로 리턴하여 boolean형 변수 isSIngle에 대입
        System.out.println("독신 여부는 " + isSingle + "입니다.");// System.out.print() 메소드 호출하여 독신 여부 출력

        scanner.close();                                    // scanner 객체의 close() 메소드 호출하여 초기화
    }                                                       // main() 메소드 정의 끝
}                                                           // ScannerEx 클래스 정의 끝
