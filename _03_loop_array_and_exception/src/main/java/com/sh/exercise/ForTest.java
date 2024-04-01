package com.sh.exercise;

public class ForTest {
    public static void main(String[] args) {
        // 변수 선언
        int sum = 0;

        // 연산
        for(int i = 0; i < 100; i += 2) {
            sum += i;
        }

        // 출력
        System.out.println(sum);
    }
}
