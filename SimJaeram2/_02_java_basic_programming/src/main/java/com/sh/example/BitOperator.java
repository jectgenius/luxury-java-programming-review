package com.sh.example;                                  // 패키지 선언문, com.sh.example 패키지에 해당 하는 클래스

public class BitOperator {                               // BitOperator 클래스 정의 시작
    public static void main(String[] args) {             // main() 메소드 정의 시작
        short a = (short)0x55ff;                         // short형 변수 a 선언 동시에 (short)0x55ff 대입하여 초기화, 16진수 4자리 숫자를 short형으로 강제 형변환한 뒤 대입
        short b = (short)0x00ff;                         // short형 변수 a 선언 동시에 (short)0x00ff 대입하여 초기화, 16진수 4자리 숫자를 short형으로 강제 형변환한 뒤 대입

        // 비트 논리 연산                                  // 비트 논리 연산자는 논리 연산자 1개만 작성 &, |, ^, ~ (and, or, xor, not)
        System.out.println("[비트 연산 결과]");            // System.out.println() 표준 출력 메소드 호출하여 문자열 "[비트 연산 결과]" 출력, 비트 논리 연산 결과 안내 메세지 출력
        System.out.printf("%04x\n", (short)(a & b));     // System.out.printf() 표준 출력 메소드 호출하여 (short)(a & b) 연산 결과를 16진수 4자리 수 형식으로 출력, 0x55ff & 0x00ff == 00ff
        System.out.printf("%04x\n", (short)(a | b));     // System.out.printf() 표준 출력 메소드 호출하여 (short)(a | b) 연산 결과를 16진수 4자리 수 형식으로 출력, 0x55ff | 0x00ff == 55ff
        System.out.printf("%04x\n", (short)(a ^ b));     // System.out.printf() 표준 출력 메소드 호출하여 (short)(a ^ b) 연산 결과를 16진수 4자리 수 형식으로 출력, 0x55ff ^ 0x00ff == 5500
        System.out.printf("%04x\n", (short)(~a));        // System.out.printf() 표준 출력 메소드 호출하여 (short)(~a) 연산 결과를 16진수 4자리 수 형식으로 출력, ~0x55ff == aa00

        byte c = 20;                                     // byte형 변수 c 선언 동시에 20 대입하여 초기화
        byte d = -8;                                     // byte형 변수 d 선언 동시에 -8 대입하여 초기화

        // 비트 시프트 연산
        System.out.println("[시프트 연산 결과]");            // System.out.println() 표준 출력 메소드 호출하여 문자열 "[시프트 연산 결과]" 출력, 비트 시프트 연산 결과 안내 메세지 출력
        System.out.println(c << 2);                       // 변수 c를 왼쪽으로 2비트 시프트 연산, 20에 2의 2제곱인 4를 곱함
        System.out.println(c >> 2);                       // 변수 c를 오른쪽으로 2비트 시프트 연산, 20에 2의 2제곱인 4를 나눔
        System.out.println(d << 2);                       // 변수 d를 왼쪽으로 2비트 시프트 연산, -32
        System.out.printf("%x\n", (d >>> 2));             // 변수 d를 오른쪽으로 2비트 시프트 연산, 최상위 비트를 무조건 0으로 채움, 3ffffffe
    }                                                     // main() 메소드 정의 끝
}                                                         // BitOperator 클래스 정의 끝
