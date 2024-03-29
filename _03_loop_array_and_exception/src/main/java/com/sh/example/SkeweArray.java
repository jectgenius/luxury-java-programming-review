package com.sh.example;

public class SkeweArray {
    public static void main(String[] args) {
        // 배열
        int[][] intArray = new int[4][];                    // 2차원 int형 배열 intArray 선언 동시에 크기가 4인 행 배열 객체 생성
        intArray[0] = new int[3];                           // 배열 intArray에 인데스 0번째 행에 크기가 3인 int형 열 배열 객체 생성하여 대입
        intArray[1] = new int[2];                           // 배열 intArray에 인데스 1번째 행에 크기가 2인 int형 열 배열 객체 생성하여 대입
        intArray[2] = new int[3];                           // 배열 intArray에 인데스 2번째 행에 크기가 3인 int형 열 배열 객체 생성하여 대입
        intArray[3] = new int[2];                           // 배열 intArray에 인데스 3번째 행에 크기가 2인 int형 열 배열 객체 생성하여 대입

        // 배열 요소 입력
        for(int i = 0; i < intArray.length; i++) {          // 반복제어변수 int형 변수 i 선언 동시에 0 대입하여 초기화, i가 배열 intArray의 length 행의 크기 보다 작을 동안 반복, i에 +1
            for(int j = 0; j < intArray[i].length; j++) {   // 반복제어변수 int형 변수 j 선언 동시에 0 대입하여 초기화, j가 배열 intArray의 인데스 i번째 행의 열의 크기보다 작을 동안 반복, j에 +1
                intArray[i][j] = (i + 1) * 10 + j;          // 배열 intArray의 인데스 i번째 행 j번쨰 열 요소에 (i + 1) * 10 + j 대입
                System.out.print(intArray[i][j] + " ");     // System.out.print() 메소드 호출하여 배열 intArray의 인데스 i번째 행 j번쨰 열 요소 출력
            }
            System.out.println();                           // 배열 intArray의 한 행 요소 모두 출력 후 줄바꿈
        }                                                   // 배열 intArray의 모든 요소 출력 완료

    }
}
