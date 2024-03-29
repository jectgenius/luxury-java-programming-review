package com.sh.example;

public class NumException {
    public static void main(String[] args) {
        String[] stringNumber = {"23", "12", "3.141592", "998"};                // String 배열 stringNumber 선언 동시에 초기화 블럭으로 초기화한 배열 생성

        int i = 0;                                                              // 반복제어변수, int형 변수 i 선언 동시에 0 대입하여 초기화
        try{                                                                    // 예외가 발생할 가능성이 있는 문장을 try 블럭에 작성한다.
            for(i = 0; i < stringNumber.length; i++) {                          // i에 0 대입, i가 stringNumber 배열의 크기인 length 보다 작을동안 반복, i에 +1
                int j = Integer.parseInt(stringNumber[i]);                      // int형 변수 j 선언 동시에 Integer 클래스의 parseInt() 메소드 호출하여 배열 stringNumber의 인덱스 i번째 요소에 저장된 값을 문자열에서 int형으로 변환하여 리턴받은 값 대입하여 초기화
                System.out.println("정수로 변환된 값은 " + j);                     // System.out.println() 메소드 호출하여 변수 j에 저장된 값 출력, 즉 정수로 변환된 값 출력
            }
        }
        catch(NumberFormatException e) {                                        // NumberFormatException 예외 처리 코드
            System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");  // System.out.println() 메소드 호출하여 정수로 변환할 수 없습니다. 안내 메세지 출력
        }

    }                                           
}
