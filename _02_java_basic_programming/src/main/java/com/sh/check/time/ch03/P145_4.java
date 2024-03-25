package com.sh.check.time.ch03;

public class P145_4 {                                           // P145_4 클래스 정의 시작
    public static void main(String[] args) {                    // main() 메소드 정의 시작

        // 방법 1. 각 행에 대한 배열 객체 각각 생성 후, 요소에 각각 값 대입
        int[][] arr = new int[4][];                           // 2차원 int형 배열 arr 선언 동시에 크기가 4인 행에 대한 배열 객체 생성
        int value = 0;                                        // 배열 원소 초기화용 int형 변수 value 선언 동시에 0 대입하여 초기화

        arr[0] = new int[4];                                  // 배열 arr의 0번째 원소에 크기가 4인 int형 배열 객체 생성하여 대입
        arr[1] = new int[1];                                  // 배열 arr의 1번째 원소에 크기가 1인 int형 배열 객체 생성하여 대입
        arr[2] = new int[1];                                  // 배열 arr의 2번째 원소에 크기가 1인 int형 배열 객체 생성하여 대입
        arr[3] = new int[4];                                  // 배열 arr의 3번째 원소에 크기가 4인 int형 배열 객체 생성하여 대입


        for (int i = 0; i < arr.length; i++) {                 // int형 변수 i 선언 동시에 0 대입하여 초기화, i가 배열 arr의 행의 크기인 length 보다 작을 동안 반복, i에 +1
            for (int j = 0; j < arr[i].length; j++) {          // int형 변수 j 선언 동시에 0 대입하여 초기화, j가 배열 arr의 인덱스 i번째 행의 열의 크기인 length 보다 작을 동안 반복, j에 +1
                arr[i][j] = value++;                           // 배열 arr의 i번째 행 j번째 열의 요소에 변수 value 대입한 뒤, value에 +1
                System.out.print(arr[i][j] + "\t");            // System.out.print() 메소드 호출하여 배열 arr의 i번째 행의 j번째 열 요소 + 탭 출력
            }                                                  // 한 행 출력 완료
            System.out.println();                              // System.out.println() 메소드 호출하여 줄바꿈
        }                                                      // 2차원 배열 arr 모두 출력 완료

    }                                                          // main() 메소드 정의 끝
}                                                              // P145_4 클래스 정의 끝
//        // 방법 2. 배열 선언 동시에 초기화 블럭으로 값 대입하여 초기화
//        int[][] arr = {                                         // 2차원 int형 배열 arr 선언 동시에 초기화 블럭으로 배열 생성하여 대입
//                {0, 1, 2, 3},
//                {4},
//                {5},
//                {6, 7, 8, 9}};
//
//        for(int i = 0; i < arr.length; i++) {                   // int형 변수 i 선언 동시에 0 대입하여 초기화, i가 배열 arr의 행의 크기 length보다 작을 동안 반복, i에 +1
//            for(int j = 0; j < arr[i].length; j++) {            // int형 변수 j 선언 동시에 0 대입하여 초기화, j가 배열 arr의 [i]번째 행의 열의 크기 length보다 작을 동안 반복, j에 +1
//                System.out.print(arr[i][j] + "\t");             // System.out.print() 메소드 호출하여 배열 arr의 i번째 행의 j번째 열 요소 + 탭 출력
//            }                                                   // 한 행 출력 완료
//            System.out.println();                               // System.out.println() 메소드 호출하여 줄바꿈
//        }                                                       // 2차원 배열 arr 모두 출력 완료
//
//    }                                                           // main() 메소드 정의 끝
//}                                                               // P145_4 클래스 정의 끝
