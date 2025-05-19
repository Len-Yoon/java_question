package org.example.exception;

import java.util.Scanner;

public class DivideZero {
    public static void main(String[] args) {
        //자바 예외 처리

        Scanner sc = new Scanner(System.in);
        int dividend; //나뉨수
        int divisor; //나눔수

        System.out.println("나뉨수를 입력하세요!"); //100 입력
        dividend = sc.nextInt();
        System.out.println("나눔수를 입력하세요!"); // 0 입력
        divisor = sc.nextInt();

        System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
        sc.close();

//        Execution failed for task ':org.example.exception.DivideZero.main()'.
//        > Process 'command 'C:\Program Files\Java\jdk-11\bin\java.exe'' finished with non-zero exit value 1
    }
}
