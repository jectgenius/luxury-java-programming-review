package com.sh.example;

import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int[] intArray = new int[5];                                    // 크기가 5인 int형 배열 intArray 선언 동시에 객체 생성, 사용자로부터 입력 받은 정수 저장하는 배열
        int sum = 0;                                                    // int형 변수 sum 선언 동시에 0 대입, 총합

        // 배열에 정수 입력
        System.out.print(intArray.length + "개의 정수를 입력하세요>> ");   // System.out.print() 메소드 호출하여 정수 입력 안내 메세지 출력
        for(int i = 0; i < intArray.length; i++) {                     // 반복 제어 변수 int형 변수 i 선언 동시에 0 대입하여 초기화, i가 배열 intArray의 크기 length보다 작을 동안 반복, i에 +1
            intArray[i] = sc.nextInt();                                // 배열 intArray의 인덱스 i번째 요소에 sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화, 즉 사용자로부터 입력 받은 정수를 배열에 저장
            sum += intArray[i];                                        // 변수 sum에 배열 intArray의 인덱스 i번째 요소에 저장된 값 대입, 즉 사용자로부터 입력 받은 정수 sum에 합함
        }

        // 평균 출력
        System.out.println("평균은 " + (double) sum / intArray.length); // System.out.println() 메소드 호출하여 평균 안내 메세지 출력

        sc.close();
    }
}
