package com.sh.exercise.theory;

public class P163_11 {                                          // P163_11 클래스 정의 시작
    public static void main(String[] args) {                    // main() 메소드 정의 끝
        int n[][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};// 2차원 int형 배열 n 선언 동시에 초기화 블럭으로 초기화하여 배열 생성
        for(int j = 0; j < n.length; j++)                       // int형 변수 j 선언 동시에 0 대입하여 초기화, j가 배열 n의 행의 크기보다 작을 동안 반복, j에 +1
            System.out.println(n[j].length + " ");              // System.out.print() 메소드 호출하여 배열 n의 j번째 행의 열의 크기 출력
    }                                                           // main() 메소드 정의 끝
}                                                               // P163_11 클래스 정의 끝
