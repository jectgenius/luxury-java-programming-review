package com.sh.exercise;

import java.util.Scanner;

public class Ch2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        double ox, oy, radius;                          // 원의 중심의 x, y 좌표, 반지름의 길이
        double x, y;                                    // 사용자로부터 입력 받은 한 점의 x, y 좌표
        double distance;                                // 원의 중심과 한 점 사이의 거리
        boolean isIn;                                   // 한 점이 원의 내부에 있는지 여부

        // 입력
        System.out.print("원의 중심과 반지름 입력>>");
        ox = sc.nextDouble();
        oy = sc.nextDouble();
        radius = sc.nextDouble();

        System.out.print("점 입력>>");
        x = sc.nextDouble();
        y = sc.nextDouble();

        // 원의 중심과 입력 받은 한 점 사이의 거리
        distance = Math.sqrt((ox - x) * (ox - x) + (oy - y) * (oy - y));

        // 원 내부에 점 있는지 판단
        // 한 점이 원의 내부에 있으려면, 원의 중심과 한 점 사이의 거리 distance가 원의 반지름 radius보다 작거나 같아야 한다.
        if(distance <= radius) {
            isIn  = true;
        }
        else {
            isIn  = false;
        }

        // 출력
        System.out.println("점 (" + x + ", " + y + ")는 " + (isIn ? "안에" : "밖에") + " 있다.");
        sc.close();
    }
}
