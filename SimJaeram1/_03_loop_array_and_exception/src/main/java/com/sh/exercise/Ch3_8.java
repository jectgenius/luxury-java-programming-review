package com.sh.exercise;

import java.util.Scanner;

public class Ch3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int[] numbers;
        int count;
        int randNum;

        // 저장할 정수 개수 입력
        System.out.print("정수 몇개?");
        count = sc.nextInt();

        // 배열 생성
        numbers = new int[count];

        // 배열에 랜덤 정수 저장
        for(int i = 0; i < numbers.length; i++) {
            randNum = (int) (Math.random() * 100 + 1);  // 1 ~ 100까지 난수 발생

            numbers[i] = randNum;                       // 랜덤 정수 저장

            for(int j = 0; j < i; j++) {                // 지금까지 저장된 배열 요소 중에서
                if(numbers[j] == randNum) {             // 중복되는 수가 있다면
                    i--;                                // 배열 요소 인덱스 증가 방지 위해 -1
                }
            }                                           // 지금까지 저장된 배열 요소 중에서 중복되는 수가 없다면

        }

        // 배열 출력
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");

            // 요소 10개 출력 후 줄바꿈
            if((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}
