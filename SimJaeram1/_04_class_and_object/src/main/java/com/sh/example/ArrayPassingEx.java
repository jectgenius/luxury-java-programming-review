package com.sh.example;

public class ArrayPassingEx {                           // ArrayPassingEx 클래스 정의 시작
    // ' ' 문자를 ','로 대체하는 메소드
    static void replaceSpace(char[] a) {                // replaceSpace 메소드 정의 시작
        for(int i = 0; i < a.length; i++) {             // 반복제어변수 int형 변수 i 선언 동시에 0 대입하여 초기화, i가 char형 배열 c의 크기 length 보다 작을 동안 반복, i에 +1
            if(a[i] == ' ')                             // 만약 배열 a의 인덱스 i번째 요소가 ' ' 공백문자이면
                a[i] = ',';                             // 배열 a의 인덱스 i번째 요소에 ',' 대입, 즉 공백문자를 콤마로 대체
        }                                               // for문 끝
    }                                                   // replaceSpace 메소드 정의 끝

    // char형 배열 요소 모두 출력하는 메소드
    static void printCharArray(char[] a) {              // printCharArray 메소드 정의 시작
        for(int i = 0; i < a.length; i++) {             // 반복제어변수 int형 변수 i 선언 동시에 0 대입하여 초기화, i가 char형 배열 a의 크기 length보다 작을 동안 반복, i에 +1
            System.out.print(a[i]);                     // System.out.print() 메소드 호출하여 배열 a의 인덱스 i번째 요소 출력
        }                                               // for문 끝
        System.out.println();                           // System.out.println() 메소드 호출하여 배앨 a의 모든 요소 출력 후 줄바꿈
    }                                                   // printCharArray 메소드 정의 끝

    public static void main(String[] args) {            // main() 메소드 정의 시작
        // char형 배열 c 선언 동시에 초기화 블럭으로 배열 생성 동시에 초기화
        char[] c = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.'};
        printCharArray(c);                              // printArray() 메소드 호출하여 대체 전 원래 배열 요소 출력
        replaceSpace(c);                                // replaceSpace() 메소드 호출하여 char형 배열 c에 있는 공백문자를 ,로 대체
        printCharArray(c);                              // printArray() 메소드 호출하여 대체 후 배열 요소 출력
    }                                                   // main() 메소드 정의 끝
}                                                       // ArrayPassingEx 클래스 정의 끝
