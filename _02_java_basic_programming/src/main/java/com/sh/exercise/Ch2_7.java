package com.sh.exercise;

import java.util.Scanner;

public class Ch2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int x, y;                                       // 사용자로부터 입력 받은 점의 좌표
        int x1 = 100, y1 = 100, x2 = 200, y2 = 200;     // 왼쪽 상단 점의 좌표, 오른쪽 하단 점의 좌표
        boolean isIn;

        // 점의 좌표 입력
        System.out.print("점 (x,y)의 좌표를 입력하시오>>");
        x = sc.nextInt();
        y = sc.nextInt();

        // 점이 직사각형 안에 있는지 판별
        if((x1 < x && x < x2) && (y1 < y && y < y2))
            isIn = true;
        else
            isIn = false;

        // 출력
        System.out.println("(" + x + "," + y + ")는 사각형 " + (isIn? "안에" : "밖에") + " 있습니다.");

        sc.close();
    }
}
