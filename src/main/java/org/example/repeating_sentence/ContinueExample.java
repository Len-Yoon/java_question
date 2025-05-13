package org.example.repeating_sentence;

import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 5개를 입력하세요");
        int sum = 0;

        for(int i = 0 ; i < 5; i++) {
            int n = sc.nextInt();
            sum += n;

            if (n <= 0) {
                continue;
            } else {
                sum += 0;
            }
        }

        System.out.println("양수의 합은 "+sum);

        sc.close();
    }
}
