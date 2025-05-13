package org.example.arithmetic_practice;

import java.util.Scanner;

public class WonToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("원화를 입력하세요!");
        double won = sc.nextDouble();

        System.out.println((int)won+"원은 $"+(won/1200)+"입니다.");

        sc.close();
    }
}
