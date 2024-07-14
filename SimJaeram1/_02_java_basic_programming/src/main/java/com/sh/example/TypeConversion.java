package com.sh.example;

public class TypeConversion {                       // TypeConversion 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        byte b = 127;                               // byte형 변수 b 선언 동시에 127 대입하여 초기화
        int i = 100;                                // int형 변수 i 선언 동시에 100 대입하여 초기화
                                                    // 연산은 원칙적으로 같은 타입끼리 하는 것
        System.out.println(b+i);                    // byte형인 b가 int형으로 자동타입변환, 227 출력
        System.out.println(10/4);                   // 정수들끼리 나누기 연산은 몫 연산, 2
        System.out.println(10.0/4);                 // int형인 4가 double형인 4.0으로 자동타입변환, 2.5
        System.out.println((char)0x12340041);       // char형으로 강제타입변환, 2바이트이므로 0x0041, 65
        System.out.println((byte)(b+i));            // byte형인 b가 int형으로 자동타입변환, int형인 227이 byte형으로 자동타입변환,
                                                    // byte형은 -128 ~ 127 까지 표현 가능하므로 오버플로우 발생
        System.out.println((int)2.9 + 1.8);         // double형인 2.9가 int형으로 강제타입변환, 2 + 1.8 연산 시 int형인 2가 double형인 2.0으로 자동타입변환,
                                                    // 2.0 + 1.8 == 3.8
        System.out.println((int)(2.9 + 1.8));       // double형인 4.7이 int형으로 강제타입변환, 4
        System.out.println((int)2.9 + (int)1.8);    // double형인 2.9와 1.8이 int형으로 강제타입변환, 2 + 1 == 3
    }                                               // main() 메소드 정의 끝
}                                                   // TypeConversion 클래스 정의 끝
