package org.example.arithmetic_practice;

import java.util.Scanner;

public class CheckSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("달을 입력하세요(1~12)>> ");
        int month = sc.nextInt();

        String season;
        switch (month) {
            case 3: case 4: case 5:
                season = "봄";
                break;
            case 6: case 7: case 8:
                season = "여름";
                break;
            case 9: case 10: case 11:
                season = "가을";
                break;
            case 12: case 1: case 2:
                season = "겨울";
                break;
            default:
                season = "잘못 입력하였습니다";
        }

        System.out.println(season);

        sc.close();
    }
}
