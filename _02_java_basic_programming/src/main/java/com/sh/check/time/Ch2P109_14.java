package com.sh.check.time;

public class Ch2P109_14 {                   // Ch2P109_14 클래스 정의 시작
    public static void main(String[] args) {// main() 메소드 정의 시작
        String in = "";                     // String 객체 in 선언 동시에 "" 대입하여 초기화

        switch(in) {                        // 문자열 in의 값이
            case "가위":                     // "가위"인 경우
                System.out.println(1);      // 1 출력
                break;                      // switch문을 빠져나감
            case "바위":                     // "바위"인 경우
                System.out.println(2);      // 2 출력
                break;                      // switch문을 빠져나감
            case "보":                      // "보"인 경우
                System.out.println(3);      // 3 출력
                break;                      // switch문을 빠져나감
            default:                        // 어느 case문에도 해당 되지 않는 경우
                System.out.println(0);      // 0 출력
        }                                   // switch문 끝
    }                                       // main() 메소드 정의 끝
}                                           // Ch2P109_14 클래스 정의 끝
