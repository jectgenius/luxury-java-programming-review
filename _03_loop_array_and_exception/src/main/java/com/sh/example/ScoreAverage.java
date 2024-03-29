package com.sh.example;

public class ScoreAverage {
    public static void main(String[] args) {

        // 변수 선언
        double[][] score = {                                            // 2차원 double형 배열 score 선언 동시에 초기화 블럭으로 값 초기화하여 배열 생성
                {3.3, 3.4},                                             // 1학년 1학기, 2학기
                {3.5, 3.6},                                             // 2학년 1학기, 2학기
                {3.7, 4.0},                                             // 3학년 1학기, 2학기
                {4.1, 4.2}};                                            // 4학년 1학기, 2학기

        double sum = 0;                                                 // double형 변수 sum 선언 동시에 0 대입하여 초기화, 자동타입변환 int 0 -> double 0.0

        // 학점 입력
        for(int year = 0; year < score.length; year++) {                // 반복 제어 변수 int형 변수 year 선언 동시에 0 대입하여 초기화, year이 배열 score의 크기 length보다 작을 동안 반복, year에 +1, 즉 배열 score의 행의 크기 4만큼 반복
            for(int term = 0; term < score[year].length; term++) {      // 반복 제어 변수 int형 변수 term 선언 동시에 0 대입하여 초기화, term이 배열 score의 인덱스 i번째 행의 열의 크기 length보다 작을 동안 반복, term에 +1, 즉 배열 score의 i번째 행의 열의 크기 2만큼 반복
                sum += score[year][term];                               // 변수 sum에 배열 score의 인덱스 year번째 행의 term번째 열의 요소에 저장된 값 합함, 즉 4학년 2학기 총 8학기 학점 합함
            }
        }

        int n = score.length;                                           // int형 변수 n 선언 동시에 배열 score의 length, 즉 행의 크기 대입하여 초기화
        int m = score[0].length;                                        // int형 변수 m 선언 동시에 배열 score의 인덱스 0번째 행의 length, 즉 열의 크기 대입하여 초기화

        System.out.println("4년 전체 평점 평균은 " + sum/(n*m));          // System.out.println() 메소드 호출하여 평점 평균 출력
    }
}
