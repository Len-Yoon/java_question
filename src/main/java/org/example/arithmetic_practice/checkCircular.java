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

        // (점과 원의 중심 사이의 거리)^2 = (x-cx)^2 + (y-cy)^2
        // 이 값이 r^2 이하이면 점이 원 내부에 있음
//        if ((x - cx) * (x - cx) + (y - cy) * (y - cy) <= r * r) {
//            System.out.println("점 (" + x + ", " + y + ")는 원 안에 있다.");
//        } else {
//            System.out.println("점 (" + x + ", " + y + ")는 원 밖에 있다.");
//        }

        //제곱근으로 비교
        double distance = Math.sqrt((x - cx) * (x - cx) + (y - cy) * (y - cy));

        if (distance <= r) {
            System.out.printf("점 (%.1f, %.1f)은(는) 원 안에 있습니다.\n", x, y);
        } else {
            System.out.printf("점 (%.1f, %.1f)은(는) 원 안에 없습니다.\n", x, y);
        }

        sc.close();
    }
}
