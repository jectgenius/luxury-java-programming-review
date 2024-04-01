package com.sh.exercise;

public class Ch3_10 {
    public static void main(String[] args) {
        // 배열
        int[][] numbers = new int[4][4];            // 랜덤한 정수 저장 배열
        boolean[][] index = new boolean[4][4];      // 저장 위치 배열

        // 랜덤한 위치에 1 ~ 10 범위 랜덤 정수 저장
        for(int i = 0; i < 10; i++) {
            int row = (int) (Math.random() * 4);
            int col = (int) (Math.random() * 4);

            if(index[row][col] != true) {
                numbers[row][col] = (int) (Math.random() * 10 + 1);
                index[row][col] = true;
            }
            else {
                i--;
                continue;
            }
        }

        // 나머지 위치에 0 저장
        for(int i = 0; i < index.length; i++) {
            for(int j = 0; j < index[i].length; j++) {
                if(index[i][j] == true) {
                    continue;
                }
                else {
                    numbers[i][j] = 0;
                }
            }
        }

        // 배열 출력
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
