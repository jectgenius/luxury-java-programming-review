package com.sh.exercise;

public class Ch3_7 {
    public static void main(String[] args) {
        // 변수 선언
        int[] numbers = new int[10];
        int sum = 0;
        double average;

        // 랜덤 정수 배열에 저장 동시에 출력, 합 연산
        System.out.print("랜덤한 정수들 : ");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10 + 1);
            System.out.print(numbers[i] + " ");

            sum += numbers[i];
        }
        System.out.println();

        // 평균 연산
        average = (double) sum / numbers.length;

        // 출력
        System.out.println("평균은 " + average);
    }
}
