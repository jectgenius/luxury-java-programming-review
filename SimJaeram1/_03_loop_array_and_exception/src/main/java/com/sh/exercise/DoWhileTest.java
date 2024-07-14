package com.sh.exercise;

public class DoWhileTest {
    public static void main(String[] args) {
        // 변수 선언
        int sum = 0, i = 0;                     // while이나 doWhile문의 반복제어변수는 그 전에 선언되어 있어야 한다.

        // 연산
        do{
            sum += i;
            i += 2;
        }while(i < 100);

        // 출력
        System.out.println(sum);
    }
}
