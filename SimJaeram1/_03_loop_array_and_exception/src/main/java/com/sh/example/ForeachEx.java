package com.sh.example;

public class ForeachEx {                                                // ForeachEx 클래스 정의 시작
    enum Week {월, 화, 수, 목, 금, 토, 일}                                 // 나열 Week 선언

    public static void main(String[] args) {                            // main() 메소드 정의 시작
        int[] n = {1, 2, 3, 4, 5};                                      // int형 배열 n 선언 동시에 초기화 블럭으로 값 초기화하여 배열 생성
        String[] names = {"사과", "배", "바나나", "체리", "딸기", "포도"};  // String형 배열 names 선언 동시에 초기화 블럭으로 값 초기화하여 배열 생성
        int sum = 0;                                                    // int형 변수 sum 선언 동시에 0 대입하여 초기화

        for(int k : n) {                                                // 반복이 진행될 때마다 int형 변수 k에 배열 n의 요소가 순차적으로 대입, 즉 k는 n[0], n[1] ...
            System.out.print(k + " ");                                  // System.out.print() 메소드 호출하여 변수 k에 저장된 값 출력, 즉 배열 n의 모든 요소 순차적으로 출력
            sum += k;                                                   // 변수 sum에 변수 k에 합함, 즉 배열 n의 모든 요소의 합
        }
        System.out.println("합은 " + sum);                               // System.out.println() 메소드 호출하여 합 안내 메세지 출력, 즉 배열 n의 모든 요소의 총합

        for(String name : names)                                        // 반복이 진행될 때마다 String형 변수 name에 배열 names의 요소가 순차적으로 대입, 즉 name은 names[0], names[1] ...
            System.out.print(name + " ");                               // System.out.print() 메소드 호출하여 변수 name에 저장된 값 출력, 즉 배열 names의 모든 요소 순차적으로 출력
        System.out.println();                                           // System.out.println() 메소드 호출하여 줄바꿈

        for(Week day : Week.values())                                   // 반복이 진행될 때마다 day에 나열 Week의 모든 요소가 순차적으로 대입, 즉 day는 월, 화, 수, 목 ..., // Week는 배열이 아니므로 values() 메소드 호출
            System.out.print(day + "요일 ");                             // System.out.print() 메소드 호출하여 day에 저장된 값 출력, 즉 나열 Week의 모든 요소 순차적으로 출력
        System.out.println();                                           // System.out.println() 메소드 호출하여 줄바꿈
    }                                                                   // main() 메소드 정의 끝
}                                                                       // ForeachEx 클래스 정의 끝
