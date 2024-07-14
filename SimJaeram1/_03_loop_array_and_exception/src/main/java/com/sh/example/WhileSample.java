package com.sh.example;

import java.util.Scanner;                                       // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class WhileSample {                                      // WhileSample 클래스 정의 시작
    public static void main(String[] args) {                    // main() 메소드 정의 시작
        Scanner sc = new Scanner(System.in);                    // 사용자로부터 입력 받기 위해 Scanner 객체 생성

        // 변수 선언
        int count = 0;                                          // int형 변수 count 선언 동시에 0 대입하여 초기화, 평균을 구하고자 하는 수의 개수
        int sum = 0;                                            // int형 변수 sum 선언 동시에 0 대입하여 초기화, 총합
        int n;                                                  // int형 변수 n 선언, 사용자로부터 입력 받은 수 저장할 변수

        // 입력
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");// System.out.println() 메소드 호출하여 입력 안내 메세지 출력
        n = sc.nextInt();                                       // 변수 n에 sc 객체의 nextInt() 메소드 호출하여 리턴 받은 값 대입

        // 수 입력
        while(n != -1) {                                        // 사용자가 입력한 수가 -1이 아니면 반복
            sum += n;                                           // 변수 sum에 사용자로부터 입력 받은 수 n 합함
            count++;                                            // 변수 count에 +1
            n = sc.nextInt();                                   // 변수 n에 sc 객체의 nextInt() 메소드 호출하여 리턴 받은 값 대입
        }

        // 평균 연산
        if(count == 0) {                                        // 변수 count에 저장된 값이 0이면, 즉 사용자가 입력한 수의 개수가 0이면
            System.out.println("입력된 수가 없습니다.");           // System.out.println() 메소드 호출하여 안내 메세지 출력
        }
        else {                                                  // 그렇지 않으면, 즉 사용자가 입력한 수의 개수가 0개가 이니면
            System.out.print("정수의 개수는 " + count + "개이며 ");// System.out.println() 메소드 호출하여 입력된 수의 개수 안내 메세지 출력
            System.out.println("평균은 " + (double) sum / count + "입니다."); // System.out.println() 메소드 호출하여 입력된 수의 평균 안내 메세지 출력
        }

        sc.close();
    }                                                               // main() 메소드 정의 끝
}                                                                   // WhileSample 클래스 정의 끝
