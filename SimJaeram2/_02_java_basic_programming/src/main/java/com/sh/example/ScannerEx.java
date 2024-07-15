package com.sh.example;

import java.util.Scanner;

public class ScannerEx {                                                                // ScannerEx 클래스 정의 시작
    public static void main(String[] args) {                                            // main() 메소드 정의 시작
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");   // System.out.println() 표준 출력 메소드 호출하여 문자열 "이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요" 출력, 입력 안내 메세지 출력
        Scanner scanner = new Scanner(System.in);                                       // Scanner 클래스 레퍼런스 변수 scanner 선언 동시에 Scanner 클래스 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 클래스 객체 생성

        String name = scanner.next();                                                   // String 클래스 레퍼런스 변수 name 선언 동시에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 문자열 리턴받아 대입하여 초기화, 이름
        System.out.print("이름은 " + name + ", ");                                       // System.out.print() 표준 출력 메소드 호출하여 문자열 "이름은 " + name + ", " 출력, 이름 안내 메세지 출력

        String city = scanner.next();                                                   // String 클래스 레퍼런스 변수 city 선언 동시에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 문자열 리턴받아 대입하여 초기화, 도시
        System.out.print("도시는 " + city + ", ");                                       // System.out.print() 표준 출력 메소드 호출하여 문자열 "도시는 " + city + ", " 출력, 도시 안내 메세지 출력

        int age = scanner.nextInt();                                                    // int형 변수 age 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화, 나이
        System.out.print("나이는 " + age + "살, ");                                      // System.out.print() 표준 출력 메소드 호출하여 문자열 "나이는 " + age + "살, " 출력, 나이 안내 메세지 출력

        double weight = scanner.nextDouble();                                           // double형 변수 weight 선언 동시에 scanner 객체의 nextDouble() 메소드 호출하여 사용자로부터 입력 받은 살수 리턴 받아 대입하여 초기화, 체중
        System.out.print("체중은 " + weight + "kg, ");                                   // System.out.print() 표준 출력 메소드 호출하여 문자열 "체중은 " + weight + "kg, " 출력, 체중 안내 메세지 출력

        boolean isSingle = scanner.nextBoolean();                                       // boolean형 변수 isSingle 선언 동시에 scanner 객체의 nextBoolean() 메소드 호출하여 사용자로부터 입력 받은 논리값 리턴 받아 대입하여 초기화, 독신 여부
        System.out.println("독신 여부는 " + isSingle + "입니다.");                         // System.out.println() 표준 출력 메소드 호출하여 문자열 "독신 여부는 " + isSingle + "입니다." 출력, 독신 여부 안내 메세지 출력

        scanner.close();                                                                // scanner 객체 close() 메소드 호출하여 사용 종료
    }                                                                                   // main() 메소드 정의 끝
}                                                                                       // ScannerEx 클래스 정의 끝
