package com.sh.exercise;

import java.util.Scanner;

public class Ch2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int num1, num2, num3;                                                       // 사용자로부터 입력 받은 정수 3개, 평균 값 찾아낼 정수
        int medium;                                                                 // 찾아낸 평균 값

        // 정수 3개 입력
        System.out.print("정수 3개 입력 >>");                                        // 입력 안내 메세지
        num1 = sc.nextInt();                                                       // 변수 num1에 sc 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 리턴 받아 대입하여 초기화
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        // 평균 값 찾아내기
        // 1. num1이 평균 값
        if((num2 >= num1 && num1 >= num3) || (num3 >= num1 && num1 >= num2))
            medium = num1;
        // 2. num2가 평균 값
        else if((num1 >= num2 && num2 >= num3) || (num3 >= num2 && num2 >= num1))
            medium = num2;
        // 3. num3가 평균 값
        else
            medium = num3;

        // 평균 값 출력
        System.out.println("중간 값은 " + medium);

        sc.close();
    }
}
