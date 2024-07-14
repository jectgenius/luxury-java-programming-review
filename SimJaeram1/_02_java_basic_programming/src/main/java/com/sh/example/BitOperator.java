package com.sh.example;

public class BitOperator {                          // BitOperator 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        // a == 0101010111111111
        // b == 0000000011111111
        short a = (short)0x55ff;                    // short형 변수 a 선언 동시에 16진수 정수 55ff를 short형으로 강제 변환한 뒤 대입하여 초기화
        short b = (short)0x00ff;                    // short형 변수 b 선언 동시에 16진수 정수 00ff를 short형으로 강제 변환한 뒤 대입하여 초기화

        // 비트 논리 연산
        System.out.println("[비트 연산 결과]");       // System.out.println() 메소드 호출하여 문자열 "[비트 연산 결과]" 출력

        // System.out.printf() 메소드 호출하여, 16진수를 4자리로, 빈곳에는 0 삽입하여 출력
        System.out.printf("%04x\n", (short)(a&b));  // 0000000011111111 == 00ff
        System.out.printf("%04x\n", (short)(a|b));  // 0101010111111111 == 55ff
        System.out.printf("%04x\n", (short)(a^b));  // 0101010100000000 == 5500
        System.out.printf("%04x\n", (short)(~a));   // 1010101000000000 == aa00

        byte c = 20;                                // 0x14 == 00010100
        byte d = -8;                                // 0xf8 == 11111000

        // 비트 시프트 연산
        System.out.println("[시프트 연산 결과]");      // System.out.println() 메소드 호출하여 문자열 "[시프트 연산 결과]" 출력
        System.out.println(c << 2);                 // 01010000 == 64 + 16 == 80
        System.out.println(c >> 2);                 // 00000101 == 4 + 1 == 5
        System.out.println(d >> 2);                 // >> 시프트 연산자는 최상위 비트를 1로 채움
                                                    // 시프트 연산 결과는 11111110 == -2
        System.out.printf("%x\n", (d >>> 2));       // d는 시프트 연산 전에 int 타입으로 바뀌어 32비트의 fffffff8이 된다. == 11111111111111111111111111111000
                                                    // 시프트 연산 결과는 00111111111111111111111111111110 == 3ffffffe
    }                                               // main() 메소드 정의 끝
}                                                   // BitOperator 클래스 정의 끝
