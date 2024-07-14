package com.sh.example;

import java.util.Scanner;

public class Book {                                                 // Book 클래스 정의 시작
    String title;                                                   // String형 변수 title 선언
    String author;                                                  // String형 변수 author 선언

    void show() {
        System.out.println(title + " " + author);
    }

    public Book() {
        this("", "");
        System.out.println("생성자 호출됨");
    }
    public Book(String t) {                                         // 매개변수가 String 1개인 생성자
//        title = t;                                                  // Book 클래스의 멤버 변수 title에 t 대입하여 초기화
//        author = "작자미상";                                          // Book 클래스의 멤버 변수 author에 "작자미상" 대입하여 초기화
        this(t, "작자미상");
    }

    public Book(String t, String a) {                               // 매개변수가 String 2개인 생성자
        title = t;                                                  // Book 클래스의 멤버 변수 title에 t 대입하여 초기화
        author = a;                                                 // Book 클래스의 멤버 변수 author에 매개변수 a 대입하여 초기화
    }

    public static void main(String[] args) {                        // main() 메소드 정의 시작
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");  // Book 클래스 객체 littlePrince 선언 동시에 매개변수가 2개인 생성자 호출하여 객체 생성
        Book loveStory = new Book("춘향전");                       // Book 클래스 객체 loveStory 선언 동시에 매개변수가 1개인 생성자 호출하여 객체 생성
//        System.out.println(littlePrince.title + " " + littlePrince.author); // System.out.println() 메소드 호출하여 객체 littlePrince의 멤버 변수 title, author 출력
//        System.out.println(loveStory.title + " " + loveStory.author);   // loveStory 객체의 필드 title, author 출력
        Book emptyBook = new Book();
        loveStory.show();

        Book[] book = new Book[2];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < book.length; i++) {
            System.out.print("제목>>");
            String title = scanner.nextLine();
            System.out.print("저자>>");
            String author = scanner.nextLine();
            book[i] = new Book(title, author);

            System.out.println("(" + book[i].title + ", " + book[i].author + ")");
        }

        scanner.close();
    }                                                               // main() 메소드 정의 끝
}                                                                   // Book 클래스 정의 끝
