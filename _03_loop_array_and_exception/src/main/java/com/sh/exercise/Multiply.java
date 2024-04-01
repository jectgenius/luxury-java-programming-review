package com.sh.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("곱하고자 하는 두 수 입력>>");
            try {                                                   // 사용자가 정수가 아닌 수를 입력한 경우, catch 블럭으로 분기
                // 입력
                int n = scanner.nextInt();
                int m = scanner.nextInt();

                // 출력
                System.out.println(n + "x" + m + "=" + n*m);
                break;
            }
            catch (InputMismatchException e) {                      // 입력 오류 시 발생하는 예외, 정수 입력을 기다리는 코드가 실행되고 있는데 정수가 아닌 문자열을 입력한 경우 발생
                System.out.println("실수는 입력하면 안됩니다.");        // 안내 메세지 호출
                scanner.nextLine();                                 // 입력 버퍼에 있는 사용자가 잘 못 입력한 수를 모두 제거하기 위해 nextLine() 메소드 호출
            }
        }

        scanner.close();
    }
}
