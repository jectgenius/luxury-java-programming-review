package com.sh.exercise.theory;

public class P162_8 {                           // P162_8 클래스 정의 시작
    public static void main(String[] args) {    // main() 메소드 정의 시작
        boolean[] bool = new boolean[4];        // 크기가 4인 boolean형 배열 bool 선언 동시에 생성
        bool[0] = true;                         // 배열 bool의 0번째 요소에 true 대입
        bool[1] = false;                        // 배열 bool의 1번째 요소에 false 대입
        bool[2] = false;                        // 배열 bool의 2번째 요소에 false 대입
        bool[3] = true;                         // 배열 bool의 3번째 요소에 true 대입

        boolean[] bool = {true, false, false, true}; // 크기가 4인 boolean형 배열 bool 선언 동시에 초기화 블럭으로 초기화

        double[][] d = new double[5][4];        // 크기가 5행 4열인 double형 배열 d 선언 동시에 생성
//        double d [][]= new double[5][4];

        int[][] val = {                         // 2차원 배열 val 선언 동시에 초기화 블럭으로 초기화하여 배열 생성
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

//        int[][] val = new int[][]{
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12}
//        };
    }                                            // main() 메소드 정의 끝
}                                                // P162_8 클래스 정의 끝
