package com.sh.exercise;

import java.util.Scanner;

public class Ch3_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 선언
        String[] course = {"java", "C++", "HTMLS", "컴퓨터구조", "안드로이드" };
        int[] score = {95, 88, 76, 62, 55};
        String name;                                                    // 사용자로부터 입력 받은 과목명 저장할 String형 변수 name

        while(true) {
            System.out.print("과목 이름>>");
            name = sc.next();

            // 사용자가 그만을 입력한 경우 프로그램 종료
            if(name.equals("그만")) {
                break;
            }

            // 사용자가 입력한 과목에 해당하는 점수 찾기
            for(int i = 0; i < course.length; i++) {
                if(name.equals(course[i])) {                                // 사용자가 입력한 과목이 배열에 있는 경우
                    System.out.println(course[i] + "의 점수는 " + score[i]);  // 점수 출력 후
                    break;                                                  // 점수 찾기 반복문 빠져나감, 다른 과목 이름 검색
                }
                else if(i + 1 == course.length) {                           // course 배열 요소 끝까지 찾아 봤을 때, 사용자가 입력한 과목이 없는 경우
                    System.out.println("없는 과목입니다.");                    // 없는 과목입니다. 안내 메세지 출력
                }
            }

        }

        sc.close();
    }
}
