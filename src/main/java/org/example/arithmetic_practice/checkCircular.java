package org.example.arithmetic_practice;

import java.util.Scanner;

public class checkCircular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원의 중심과 반지름을 입력하세요>> ");
        double cx = sc.nextDouble();
        double cy = sc.nextDouble();
        double r = sc.nextDouble();

        System.out.print("점을 입력하세요>> ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double distance = Math.sqrt((x - cx) * (x - cx) + (y - cy) * (y - cy));

        if (distance <= r) {
            System.out.printf("점 (%.1f, %.1f)은(는) 원 안에 있습니다.\n", x, y);
        } else {
            System.out.printf("점 (%.1f, %.1f)은(는) 원 안에 없습니다.\n", x, y);
        }

        sc.close();
    }
}
