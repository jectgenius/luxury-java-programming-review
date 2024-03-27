package com.sh.exercise;

import java.util.Scanner;

public class Ch2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a, b, c;                                                                // 삼각형 세 변의 길이
        boolean isTriangle = false;                                                 // 삼각형이 될 수 있는지 여부

        // 세 변의 길이 입력
        System.out.print("정수 3개를 입력하시오>>");                                   // 삼각형 세 변의 길이 입력 안내 메세지
        a = sc.nextInt();                                                           // 변수 a에 sc.nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화
        b = sc.nextInt();
        c = sc.nextInt();

        // 삼각형 여부 판단
        if(a + b > c || a + c > b || b + c > a)                                     // 만약 세 변 중에서 두 변의 길이의 합이 다른 한 변의 합보다 크다면, 조합이므로 3 가지의 경우의 수 뿐
            isTriangle = true;

        // 삼각형 여부 출력
        System.out.println(isTriangle ? "삼각형이 됩니다." : "삼각형이 되지 않습니다.");

        sc.close();
    }
}
