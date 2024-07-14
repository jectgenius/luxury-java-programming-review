package com.sh.example;

public class ReturnArray {
    static int[] makeArray() {                      // makeArray() 메소드 정의
        int[] temp = new int[4];                    // 크기가 4인 int형 배열 temp 선언 동시에 생성
        for(int i = 0; i < temp.length; i++)        // 반복제어변수 int형 변수 i 선언 동시에 0 대입하여 초기화, i가 temp의 크기 length 보다 작을 동안 반복, i에 +1
            temp[i] = i;                            // 배열 temp의 인덱스 i번째 요소에 변수 i에 저장된 값 대입하여 초기화
        return temp;                                // 배열 temp의 레퍼런스 값 리턴
    }                                               // 메소드의 배열 리턴은 배열 객체가 아니라 배열의 레퍼런스 값이 리턴된다.

    public static void main(String[] args) {        // main() 메소드 정의 시작
        int[] intArray;                             // int형 배열 변수 intArray 선언
        intArray = makeArray();                     // makeArray() 메소드 호출하여 생성한 배열의 레퍼런스 값을 리턴 받아 배열 변수 intArray에 대입


        for(int i = 0; i < intArray.length; i++)    // 반복제어변수 int형 변수 i 선언 동시에 0 대입하여 초기화, i가 intArray의 크기 length 보다 작을 동안 반복, i에 +1
            System.out.print(intArray[i] + " ");    // System.out.print() 메소드 호출하여 배열 intArray의 인덱스 i번째 요소 출력
                                                    // 배열 intArray의 모든 요소 출력 완료
    }                                               // main() 메소드 정의 끝

}
