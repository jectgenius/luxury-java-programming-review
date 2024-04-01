package com.sh.exercise;

public class Ch3_9 {
    public static void main(String[] args) {
        // 배열 선언 동시에 생성
        int[][] numbers = new int[4][4];                            // 크기가 4행 4열인 int형 배열 numbers 선언 동시에 생성

        // 배열에 랜덤 정수 저장 동시에 출력
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j <numbers[i].length; j++) {
                numbers[i][j] = (int) (Math.random() * 10 + 1);

                System.out.print(numbers[i][j] + "\t");
            }                                                       // 한 행의 모든 요소 저장 및 출력 완료
            System.out.println();                                   // 줄바꿈
        }

    }
}
