package com.sh.exercise;

import java.util.Scanner;

public class Ch3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int n;

        // 입력
        System.out.print("정수를 입력하시오>>");            // 입력 안내 메세지 출력
        n = sc.nextInt();                               // 사용자로부터 입력 받은 값 int형으로 변환한 값 리턴 받아 대입

        // * 출력
        for(int i = n; i > 0; i--) {                    // int형 변수 i 선언 동시에 n 대입하여 초기화, 총 n줄 출력
            for(int j = 0; j < i; j++) {                // int형 변수 j 선언 동시에 0 대입하여 초기화, 한 줄에 총 i번 출력
                System.out.print("*");
            }                                           // 한 줄 모두 출력 완료
            System.out.println();                       // 줄바꿈
        }                                               // 모든 * 출력 완료

        sc.close();
    }
}
