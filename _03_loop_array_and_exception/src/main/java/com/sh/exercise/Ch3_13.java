package com.sh.exercise;

public class Ch3_13 {
    public static void main(String[] args) {
        for(int i = 1; i <= 99; i++) {
            int ten = i / 10;
            int one = i % 10;

            if((ten == 3 || ten == 6 || ten == 9) && (one == 3 || one == 6 || one == 9)) {
                System.out.println(i + " 박수 짝짝");
            } else if (one == 3 || one == 6 || one == 9) {
                System.out.println(i + " 박수 짝");
            } else if (ten == 3 || ten == 6 || ten == 9) {
                System.out.println(i + " 박수 짝");
            }
        }

    }
}
