package org.example.arithmetic_practice;

import java.util.Scanner;

public class CheckMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("금액을 입력하세요");
        int money =  sc.nextInt();

        int a = money/50000;
        money = money-a*50000;

        int b = money/10000;
        money = money-b*10000;

        int c = money/1000;
        money = money-c*1000;

        int d = money/100;
        money = money-d*100;

        int e = money/50;
        money = money-e*50;

        int f = money/10;
        money = money-f*10;

        int g = money/1;
        money = money-g*1;

        System.out.println("오만원권 "+a+"매");
        System.out.println("만원권 "+b+"매");
        System.out.println("천원권 "+c+"매");
        System.out.println("백원권 "+d+"매");
        System.out.println("오십원권 "+e+"매");
        System.out.println("십원권 "+f+"매");
        System.out.println("일원권 "+g+"매");

        sc.close();
    }
}
