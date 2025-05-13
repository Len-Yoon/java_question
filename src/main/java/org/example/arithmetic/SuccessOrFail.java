package org.example.arithmetic;

import java.util.Scanner;

public class SuccessOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("점수를 입력하세요!");
        int score = sc.nextInt();

        if (score >= 80) {
            System.out.println("축축 합격!");
        }

        sc.close();
    }
}
