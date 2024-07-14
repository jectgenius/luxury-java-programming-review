import java.util.Scanner;

public class UpAndDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int user = 0, card;
        int count = 0;
        String answer;

        // 게임 시작
        System.out.println("수를 결정하였습니다. 맞추어보세요");
        card = (int) (Math.random() * 100);

        while(true) {
            System.out.println(user + "-99");
            count++;
            System.out.print(count + ">>");
            user = sc.nextInt();

            if(user == card) { // 사용자가 입력한 수가 맞는 경우
                System.out.println("맞았습니다.");
                System.out.print("다시하시겠습니까(y/n)>>");
                answer = sc.next();
                if(answer.equals("n")) {                                // 사용자가 n을 입력한 경우 게임 종료
                    System.out.println("게임을 종료합니다.");
                    break;
                }
                else {                                                  // 사용자가 y를 입력한 경우 게임 재시작
                    System.out.println("수를 결정하였습니다. 맞추어보세요");
                    card = (int) (Math.random() * 100);
                    count = 0;
                    user = 0;
                }
            }
            else { // 사용자가 입력한 수가 틀린 경우
                if(user > card) {
                    System.out.println("더 낮게");
                }
                else if(user < card) {
                    System.out.println("더 높게");
                }
            }
        }

        sc.close();
    }
}
