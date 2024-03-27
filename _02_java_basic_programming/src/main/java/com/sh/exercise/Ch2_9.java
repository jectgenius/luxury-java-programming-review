package com.sh.exercise;

import java.util.Scanner;

public class Ch2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        double ox, oy, r;
        double x, y;
        double d;
        boolean isIn;

        // 입력
        System.out.print("원의 중심과 반지름 입력>>");
        ox = sc.nextDouble();
        oy = sc.nextDouble();
        r = sc.nextDouble();

        System.out.print("점 입력>>");
        x = sc.nextDouble();
        y = sc.nextDouble();

        // 원의 중심과 입력 받은 한 점 사이의 거리
        d = Math.sqrt((ox - x) * (ox - x) + (oy - y) * (oy - y));

        // 원 내부에 점 있는지 판단
        isIn = (d <= r);

        // 출력
        System.out.println("점 (" + x + ", " + y + ")는 " + (isIn ? "안에" : "밖에") + " 있다.");
        sc.close();
    }
}
