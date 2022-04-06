package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        // Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        // 𝑢 = (a+b+c) / 2
        // Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        double first, second, third, u, area;


        Scanner scan = new Scanner(System.in);

        System.out.print("1. kenarı giriniz : ");
        first = scan.nextDouble();

        System.out.print("2. kenarı giriniz : ");
        second = scan.nextDouble();

        System.out.print("3. kenarı giriniz : ");
        third = scan.nextDouble();

        u = (first + second + third) / 2.0;
        area = Math.sqrt(u * (u - first) * (u - second) * (u - third));

        System.out.println("Üçgenin alanı : " + area);

    }
}
