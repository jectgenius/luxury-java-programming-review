package com.sh.example;

public class TypeConversion {                           // TypeConversion 클래스 정의 시작, 형변환
                                                        // 연산은 같은 자료형끼리 하는 것이다.
    public static void main(String[] args) {            // main() 메소드 정의 시작
        byte b = 127;                                   // byte형 변수 b 선언 동시에 127 대입하여 초기화
        int i = 100;                                    // int형 변수 i 선언 동시에 100 대입하여 초기화
        System.out.println(b+i);                        // System.out.println() 표준 출력 메소드 호출하여 b+i 연산 결과 출력, 127+100 == 227, 형변환 X, int형
        System.out.println(10/4);                       // System.out.println() 표준 출력 메소드 호출하여 10/4 연산 결과 출력, 10/4 == 2, 형변환 X, int형
        System.out.println(10.0/4);                     // System.out.println() 표준 출력 메소드 호출하여 10.0/4 연산 결과 출력, 10.0/4 == 2.25, 자동 형변환 1회, double형
        System.out.println((char)0x12340041);           // System.out.println() 표준 출력 메소드 호출하여 (char)0x12340041 연산 결과 출력, (char)0x12340041 == (char)0x0041, 강제 형변환 1회, char형
        System.out.println((byte)(b+i));                // System.out.println() 표준 출력 메소드 호출하여 (byte)(b+i) 연산 결과 출력, (byte)(b+i) == (byte)227 == -29, 강제 형변환 1회, byte형
        System.out.println((int)2.9 + 1.8);             // System.out.println() 표준 출력 메소드 호출하여 (int)2.9 + 1.8 연산 결과 출력, (int)2.9 + 1.8 == 2 + 1.8 == 2.0 + 1.8 == 3.8, 강제 형변환 1회 자동 형변환 1회, double형
        System.out.println((int)(2.9 + 1.8));           // System.out.println() 표준 출력 메소드 호출하여 (int)(2.9 + 1.8) 연산 결과 출력, (int)(2.9 + 1.8) == (int)4.7 == 4 강제 형변환 1회, int형
        System.out.println((int)2.9 + (int)1.8);        // System.out.println() 표준 출력 메소드 호출하여 (int)2.9 + (int)1.8 연산 결과 출력, (int)2.9 + (int)1.8 == 2 + 1 == 3, 강제 형변환 2회, int형
    }                                                   // main() 메소드 정의 끝
}                                                       // TypeConversion 클래스 정의 끝
