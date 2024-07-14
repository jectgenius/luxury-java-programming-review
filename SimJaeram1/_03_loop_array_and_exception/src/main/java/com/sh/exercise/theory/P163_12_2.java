package com.sh.exercise.theory;

public class P163_12_2 {
    public static void main(String[] args) {
        // 2차원 비정방형 배열
        // 생성
        double[][] arr = new double[4][];
        arr[0] = new double[4];
        arr[1] = new double[2];
        arr[2] = new double[3];
        arr[3] = new double[1];

        // 대입
        // 1. 각 배열 요소에 직접 값 대입
        arr[0][0] = 1.1;
        arr[0][1] = 1.2;
        arr[0][2] = 1.2;
        arr[0][3] = 1.4;

        arr[1][0] = 2.1;
        arr[1][1] = 2.2;

        arr[2][0] = 3.1;
        arr[2][1] = 3.2;
        arr[2][2] = 1.2;

        arr[3][0] = 4.1;

        // 2. 반복문을 이용하여 값 대입
        double value = 0.0;
        for(int i = 0; i < arr.length; i++) {
            value = i + 1;
            for(int j = 0; j < arr[i].length; j++) {
                value += 0.1;
                arr[i][j] = value;
                System.out.printf("%.1f\t", arr[i][j]);
            }
            System.out.println();
        }
    }
}
