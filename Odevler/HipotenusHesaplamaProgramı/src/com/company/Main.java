package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        // ΓΓ§πππππ Γ§ππ£πππ π = 2π’
        // π’ = (a+b+c) / 2
        // Alan * Alan = π’ * (π’ β π)* (π’ β π) * (π’ β π)

        double first, second, third, u, area;


        Scanner scan = new Scanner(System.in);

        System.out.print("1. kenarΔ± giriniz : ");
        first = scan.nextDouble();

        System.out.print("2. kenarΔ± giriniz : ");
        second = scan.nextDouble();

        System.out.print("3. kenarΔ± giriniz : ");
        third = scan.nextDouble();

        u = (first + second + third) / 2.0;
        area = Math.sqrt(u * (u - first) * (u - second) * (u - third));

        System.out.println("ΓΓ§genin alanΔ± : " + area);

    }
}
