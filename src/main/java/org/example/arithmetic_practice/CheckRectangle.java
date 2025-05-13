package org.example.arithmetic_practice;

import java.util.Scanner;

public class CheckRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("x좌표 를입력하세요");
        int x = sc.nextInt();

        System.out.println("y좌표 를입력하세요");
        int y = sc.nextInt();

        if (x >= 100 && x <= 200 && y >= 100 && y <= 200) {
            System.out.println("(" + x + ", " + y + ")는 사각형 안에 있습니다.");
        } else {
            System.out.println("(" + x + ", " + y + ")는 사각형 안에 없습니다.");
        }
        sc.close();
    }
}
