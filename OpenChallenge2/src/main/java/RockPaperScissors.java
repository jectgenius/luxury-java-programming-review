import java.util.Scanner;                                                       // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class RockPaperScissors {                                                // RockPaperScissors 클래스 정의 시작
    public static void main(String[] args) {                                    // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);                               // 사용자로부터 입력 받기 위해 Scanner 클래스 객체 생성
        String chulsu, younghee;                                                // String형 변수 chulsu, younghee 선언, 철수와 영희가 입력할 문자열을 가리키는 참조형 변수

        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");   // System.out.println() 메소드 호출하여 입력 안내 메세지 출력
        System.out.print("철수 >> ");                                            // System.out.print() 메소드 호출하여 철수 입력 안내 메세지 출력
        chulsu = scanner.next();                                                // String형 변수 chulsu에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 값 리턴 받아 대입, 즉 철수가 낸 것
        System.out.print("영희 >> ");                                            // System.out.print() 메소드 호출하여 철수 입력 안내 메세지 출력
        younghee = scanner.next();                                              // String형 변수 younghee에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 값 리턴 받아 대입, 즉 영희가 낸 것

          // 만약 철수가 가위, 영희가 보를 내거나 철수가 바위, 영희가 가위를 내거나 철수가 보, 영희가 바위를 내면 철수가 이김
        if((chulsu.equals("가위") && younghee.equals("보")) || (chulsu.equals("바위") && younghee.equals("가위")) || (chulsu.equals("보") && younghee.equals("바위"))) {
            System.out.println("철수가 이겼습니다.");                               // System.out.println() 메소드 호출하여 승패 안내 메세지 출력
        } // 그렇지 않고 만약 영희가 가위, 철수가 보를 내거나 영희가 바위, 철수가 가위를 내거나 영희가 보, 철수가 바위를 내면 영희가 이김
        else if((younghee.equals("가위") && chulsu.equals("보")) || (younghee.equals("바위") && chulsu.equals("가위")) || (younghee.equals("보") && chulsu.equals("바위"))) {
            System.out.println("영희가 이겼습니다.");                               // System.out.println() 메소드 호출하여 승패 안내 메세지 출력
        } // 마지막 블럭은 else if가 아닌 else로 작성해도 돼지만 사용자가 입력시 오타를 낼 수 있으므로 else if로 작성함
          // 그렇지 않고 만약 영희랑 철수가 둘다 가위를 내거나, 보를 내거나, 바위를 내면 비김
        else if((younghee.equals("가위") && chulsu.equals("가위")) || (younghee.equals("보") && chulsu.equals("보")) || (younghee.equals("바위") && chulsu.equals("바위"))){
            System.out.println("비겼습니다.");                                     // System.out.println() 메소드 호출하여 승패 안내 메세지 출력
        }

        scanner.close();                                                         // scanner 객체의 close() 메소드 호출하여 객체 닫기
    }                                                                            // main() 메소드 정의 끝
}                                                                                // RockPaperScissors 클래스 정의 끝
