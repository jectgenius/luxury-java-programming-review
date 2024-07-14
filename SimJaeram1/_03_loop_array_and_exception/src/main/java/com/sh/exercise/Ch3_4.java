package com.sh.exercise;

import java.util.Scanner;

public class Ch3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        char c;

        // 입력
        System.out.print("소문자 알파벳 하나를 입력하시오>>");    // 입력 안내 메세지 출력
        c = sc.next().charAt(0);                            // sc 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 값을 문자열로 리턴 받아 charAt() 메소드 호출하여 그 문자열의 0번째 인덱스에 해당 하는 문자 리턴 받아 대입
                                                            // Scanner는 문자를 입력 받는 기능이 없다. 그러므로 문자열을 입력 받아야 한다.
        // 출력
        for(int i = c; i >= 'a'; i--) {                     // 총 a ~ 변수 c에 저장된 문자 만큼의 줄 출력
            for(int j = 'a'; j <= i; j++) {                 // 문자 'a'부터 변수 i보다 작을 동안 반복
                System.out.print((char) j);
            }
            System.out.println();
        }
        sc.close();
    }
}
