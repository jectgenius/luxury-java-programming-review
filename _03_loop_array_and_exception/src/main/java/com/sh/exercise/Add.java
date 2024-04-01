package com.sh.exercise;

public class Add {
    public static void main(String[] args) {
        // 변수 선언
        int sum = 0;                                // int형 변수 sum 선언 동시에 0 대입하여 초기화, 총합

        // 총 합 연산, 명령행 인자 중에서 정수만
        for(int i = 0; i < args.length; i++) {
            try {
                sum += Integer.parseInt(args[i]);   // 문자열 배열 args의 인덱스 i번째 요소에 저장된 문자열을 int형으로 변환한 뒤, sum에 합함
            }
            catch(NumberFormatException e) {        // 만약 args[i]가 정수가 아닌 경우 NumberFormatException 발생
                continue;                           // 다음 반복으로 넘어감, 즉 문자열 배열 args의 다음 요소에 접근
            }
        }

        // 연산 결과 출력
        System.out.println(sum);
    }
}
