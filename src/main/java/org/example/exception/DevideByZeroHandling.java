package org.example.exception;

import java.util.Scanner;

public class DevideByZeroHandling {
    public static void main(String[] args) {
        //ArithmeticException 예외처리

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("나뉨수를 입력하세요!"); //100 입력
            int dividend = sc.nextInt();
            System.out.println("나눔수를 입력하세요!"); // 0 입력
            int divisor = sc.nextInt();

            try {
                System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
                break;
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요!");
            }
        }

        sc.close();
    }
}
