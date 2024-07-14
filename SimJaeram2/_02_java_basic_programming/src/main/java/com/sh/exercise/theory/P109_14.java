package com.sh.exercise.theory;

public class P109_14 {                          // P109_14 클래스 정의 시작
    public static void main(String[] args) {    // main() 메소드 정의 시작
        String in = "";                         // String 클래스형 레퍼런스 변수 in 선언 동시에 빈문자열 ""로 객체 생성하여 대입하여 초기화

        switch(in) {                            // switch문 시작, in에 저장된 문자열이
            case "가위":                         // "가위"이면
                System.out.println(1);          // System.out.println() 표준 출력 메소드 호출하여 정수 1 출력
                break;                          // switch문 빠져나감
            case "바위":                         // "바위"이면
                System.out.println(2);          // System.out.println() 표준 출력 메소드 호출하여 정수 2 출력
                break;                          // switch문 빠져나감
            case "보":                           // "보"이면
                System.out.println(3);          // System.out.println() 표준 출력 메소드 호출하여 정수 3 출력
                break;                          // switch문 빠져나감
            default:                            // 어떤 case문에도 해당되지 않으면
                System.out.println(0);          // System.out.println() 표준 출력 메소드 호출하여 정수 0 출력
        }                                       // switch문 정의 끝
    }                                           // main() 메소드 정의 끝
}                                               // P109_14 클래스 정의 끝
