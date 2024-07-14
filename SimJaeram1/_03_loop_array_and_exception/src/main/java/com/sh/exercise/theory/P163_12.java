package com.sh.exercise.theory;

public class P163_12 {                              // P163_12 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        // 2차원 비정방형 배열

        // 생성
        double[][] arr = new double[4][];
        arr[0] = new double[4];
        arr[1] = new double[2];
        arr[2] = new double[3];
        arr[3] = new double[1];

        // 대입
        // 방법 1
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

        // 방법 2
//        double[][] arr = {
//                {1.1, 1.2, 1.2, 1.4},
//                {2.1, 2.2},
//                {3.1, 3.2, 1.2},
//                {4.1}
//        };
    }                                                   // main() 메소드 정의 끝
}                                                       // P163_12 클래스 정의 끝
