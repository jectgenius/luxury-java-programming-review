package com.sh.exercise;

public class Ch3_2 {
    public static void main(String[] args) {
        int[][] n = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};        // int형 2차원 비정방형 배열 n 선언 동시에 초기화 블럭으로 초기화하여 배열 생성

        for(int i = 0; i < n.length; i++) {                             // 반복제어변수 int형 변수 i 선언 동시에 0 대입하여 초기화, i가 배열 n의 행의 크기인 length 보다 작을동안 반복, i에 +1
            for(int j = 0; j < n[i].length; j++) {                      // 반복제어변수 int형 변수 j 선언 동시에 0 대입하여 초기화, j가 배열 n의 인덱스 i번째 행의 열의 크기인 length보다 작을동안 반복, j에 +1
                System.out.print(n[i][j] + "\t");                       // System.out.print() 메소드 호출하여 배열 n의 인덱스 i번째 행의 j번째 열의 요소 출력
            }                                                           // 한 행의 모든 요소 출력 완료
            System.out.println();                                       // 줄바꿈
        }                                                               // 배열 n의 모든 요소 출력 완료

    }
}
