package com.sh.exercise;

import java.util.Scanner;

public class Ch3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int[] numbers = new int[10];                    // 크기가 10인 int형 배열 numbers 선언 동시에 생성

        // 입력
        System.out.print("양의 정수 10개를 입력하시오>>");   // 양의 정수 10개 입력 메세지 출력
        for(int i = 0; i < numbers.length; i++) {       // 반복제어변수 int형 변수 i 선언 동시에 0 대입하여 초기화, 배열 numbers의 크기만큼 반복, i에 +1
            numbers[i] = sc.nextInt();                  // 배열 numbers의 인덱스 i번째 요소에 sc 객체의 nextInt() 메소드 호출하여
        }

        // 3의 배수만 출력
        System.out.print("3의 배수는 ");
        for(int i = 0; i < numbers.length; i++) {       // 배열 numbers의 모든 요소 순차적으로 접근하여
            if(numbers[i] % 3 == 0)                     // 3으로 나눈 나머지가 0인
                System.out.print(numbers[i] + " ");     // 즉, 3의 배수인 요소만 출력
            else                                        // 3으로 나눈 나머지가 0이 아니면
                continue;                               // 즉, 3의 배수가 아니면 다음 요소에 접근
        }

        sc.close();
    }
}
