package com.sh.example;

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int[] intArray = new int[5];                        // int형 배열 변수 intArray 선언 동시에 크기가 5인 int형 배열 생성하여 대입, 사용자가 입력한 수 저장하는 배열
        int max = 0;                                        // int형 변수 max 선언 동시에 0 대입하여 초기화, 가장 큰 수

        // 입력 및 가장 큰 수 찾기
        System.out.println("양수 5개를 입력하세요.");
        for(int i = 0; i < 5; i++) {                        // 반복 제어 변수 int형 변수 i 선언 동시에 0 대입하여 초기화, i가 5보다 작을 동안 반복, i에 +1
            intArray[i] = sc.nextInt();                     // 배열 intArray의 인덱스 i번째 요소에 sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 대입, 즉 사용자가 입력한 수 저장
            if(intArray[i] > max)                           // 만약 배열 intArray의 인덱스 i번째 요소에 저장된 값이 변수 max에 저장된 값보다 크다면, 즉 현재 사용자가 입력한 수가 현재 최댓값 보다 크다면
                max = intArray[i];                          // 변수 max에 배열 intArray의 인덱스 i번째 요소에 값 대입, 즉 최댓값 업데이트
        }

        // 출력
        System.out.print("가장 큰 수는 " + max + "입니다.");    // System.out.print() 메소드 호출하여 가장 큰 수 안내 메세지 출력

        sc.close();
    }
}
