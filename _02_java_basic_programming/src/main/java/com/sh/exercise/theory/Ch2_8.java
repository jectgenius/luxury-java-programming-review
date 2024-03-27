package com.sh.exercise.theory;

import java.util.Scanner;

public class Ch2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int x1, y1, x2, y2;                                                             // 사용자로부터 입력 받은 사각형의 두 점의 좌표
        int rectangleX1 = 100, rectangleY1 = 100, rectangleX2 = 200, rectangleY2 = 200; // 충돌 판단할 직사각형의 두 점의 좌표
        boolean isConflicted;

        // 입력
        System.out.print("점 (x1, y1), (x2, y2)를 입력하시오>> ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        // 충돌 판단
        if((x1 < rectangleX1 && x2 < rectangleX1) || (x1 > rectangleX1 && x2 > rectangleX2) || (y1 < rectangleY1 && y2 < rectangleY1) || (y1 > rectangleY1 && y2 > rectangleY2))
            isConflicted = false;
        else
            isConflicted = true;

        // 결과 출력
        System.out.println(isConflicted ? "충돌합니다." : "충돌 하지 않습니다.");

        sc.close();
    }
}
