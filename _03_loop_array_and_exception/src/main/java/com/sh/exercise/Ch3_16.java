package com.sh.exercise;

import java.util.Scanner;

public class Ch3_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 선언
        String[] str = {"가위", "바위", "보"};
        String user, computer;                                  // 사용자와 컴퓨터가 낸 것 저장하는 String형 변수
        int i;                                                  // 컴퓨터가 낼 것 제어할 인덱스

        // 게임 시작
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        while(true) {
            // 사용자
            System.out.print("가위 바위 보!>>");
            user = sc.next();

            // 컴퓨터
            i = (int) (Math.random() * 3);
            computer = str[i];

            // 사용자가 그만을 입력한 경우 프로그램 종료
            if(user.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            }

            // 승패 출력
            System.out.print("사용자 = " + user + ", 컴퓨터 = " + computer + ", ");

            if((user.equals("가위") && computer.equals("보")) ||
                    (user.equals("바위") && computer.equals("가위")) ||
                    (user.equals("보") && computer.equals("주먹"))) {
                System.out.println("사용자가 이겼습니다.");

            }else if((user.equals("보") && computer.equals("가위")) ||
                    (user.equals("가위") && computer.equals("바위")) ||
                    (user.equals("주먹") && computer.equals("보"))) {
                System.out.println("컴퓨터가 이겼습니다.");

            } else if(user.equals(computer)) {
                System.out.println("비겼습니다.");
            }
        }

        sc.close();
    }
}
