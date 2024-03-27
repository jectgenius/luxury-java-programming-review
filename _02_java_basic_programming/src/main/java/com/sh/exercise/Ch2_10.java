package com.sh.exercise;

import java.util.Scanner;

public class Ch2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        double ox1, oy1, r1, ox2, oy2, r2;
        double d;
        boolean isConflict;

        // 입력
        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        ox1 = sc.nextDouble();
        oy1 = sc.nextDouble();
        r1 = sc.nextDouble();
        System.out.print("두번째 원의 중심과 반지름 입력>>");
        ox2 = sc.nextDouble();
        oy2 = sc.nextDouble();
        r2 = sc.nextDouble();

        // 두 원 겹치는지 판단
        // 두 원의 중심 사이의 거리가 두 원의 반지름의 합의 길이보다 크거나 같으면 두 원은 겹치지 않는다.
        d = Math.sqrt((ox1 - ox2) * (ox1 - ox2) + (oy1 - oy2) * (oy1 - oy2));
        if(d >= r1 + r2) {
            isConflict = false;
        }
        else {
            isConflict = true;
        }

        // 결과 출력
        System.out.println("두 원은 서로 " + (isConflict ? "겹친다. " : "겹치지 않는다."));

        sc.close();
    }
}
