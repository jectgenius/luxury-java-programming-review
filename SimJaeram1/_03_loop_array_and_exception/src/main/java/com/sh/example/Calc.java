package com.sh.example;

// 사용자가 명령행에 입력한 실수들을 전달 받아 합을 구하는 프로그램
public class Calc {
    public static void main(String[] args) {
        double sum = 0.0;                           // double형 변수 sum 선언 동시에 0.0 대입하여 초기화, 총합

        for(int i = 0; i < args.length; i++) {      // 반복제어변수 int형 변수 i 선언 동시에 0 대입하여 초기화, i가 배열 args의 크기 length 보다 작을 동안 반복, i에 +1
            sum += Double.parseDouble(args[i]);     // 배열 args의 인덱스 i번째 요소에 저장된 문자열을 Double 클래스의 parseDouble() 메소드 호출하여 double형으로 변환한 리턴받은 값을 sum에 합함
        }

        System.out.println("sum = " + sum);         // System.out.println() 메소드 호출하여 총합 안내 메세지 출력
    }
}
