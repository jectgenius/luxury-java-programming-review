package com.sh.exercise;

import java.util.Scanner;

public class Ch2_12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        double operand1, operand2;
        double result = 0.0;
        String operator;

        // 입력
        System.out.print("연산>>");
        operand1 = sc.nextDouble();
        operator = sc.next();
        operand2 = sc.nextDouble();

        // 연산, 피연산자 종류에 따라 분기
        if(operator.equals("+")) {
            result = operand1 + operand2;
        }
        else if(operator.equals("-")) {
            result = operand1 - operand2;
        }
        else if(operator.equals("*")) {
            result = operand1 * operand2;
        }
        else if(operator.equals("/")) {
            if(operand2 == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return;
            }

            result = operand1 / operand2;
        }

        // 출력
        System.out.println((int) operand1 + operator + (int) operand2 + "의 결과는 " + (int) result);

        sc.close();
    }
}
