package com.sh.exercise;

public class Average {
    public static void main(String[] args) {
        // 변수 선언
        int sum = 0;
        double average;

        // 총 합 연산
        for(int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }

        // 평균 연산
        average = (double) sum / args.length;

        // 평균 출력
        System.out.println((int) average);
    }
}
