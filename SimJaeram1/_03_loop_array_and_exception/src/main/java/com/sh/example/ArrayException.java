package com.sh.example;

public class ArrayException {
    public static void main(String[] args) {
        // 배열 선언
        int[] intArray = new int[5];                                            // 크기가 5인 int형 배열 intArray 선언 동시에 생성, 배열의 크기가 5이므로 인덱스의 범위는 0 ~ 4
        intArray[0] = 0;                                                        // 배열 intArray의 인덱스 0번째 요소에 0 대입하여 초기화

        try{                                                                    // 예외가 발생할 가능성이 있는 문장을 try 블럭에 작성
            for(int i = 0; i < 5; i++) {                                        // 반복제어변수 i 선언 동시에 0 대입하여 초기화, i가 5보다 작을 동안 반복, i에 +1
                intArray[i+1] = i + 1 + intArray[i];                            // 배열 intArray의 인덱스 i+1번째 요소에 i + 1 + intArray[i] 연산 결과 대입
                                                                                // i가 4일 때 i+1, 즉 인덱스 5번째 요소에 접근 시 배열의 인덱스 범위를 벗어날 때 발생하는 ArrayIndexOutOfBounds 예외 발생
                System.out.println("intArray[" + i + "]" + "=" + intArray[i]);  // System.out.println() 메소드 호출하여 배열 intArray의 인덱스 i번째 요소 출력
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {                               // ArrayIndexOutOfBounds 예외 처리 코드
            System.out.println("배열의 인덱스가 범위를 벗어났습니다.");               // System.out.println() 메소드 호출하여 배열의 인덱스가 범위를 벗어났습니다. 안내 메세지 출력
        }                                                                       // 예외 처리 코드 있으므로 프로그램이 종료되지 않는다.

    }
}
