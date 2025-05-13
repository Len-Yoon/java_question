package org.example.arithmetic;

import java.util.Scanner;

public class CheckCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개를 입력하세요 >> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야 함
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("삼각형이 됩니다.");
        } else {
            System.out.println("삼각형이 안됩니다.");
        }
        sc.close();
    }
}
