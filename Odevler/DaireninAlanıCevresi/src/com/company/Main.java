package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double pi = 3.14,
                    area,
                    perimeter,
                    slice;
        int r,
            degree;

        Scanner scan = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        r = scan.nextInt();

        System.out.print("Alanını istediğiniz daire diliminin derecesini giriniz : ");
        degree = scan.nextInt();

        area = pi * r * r;
        perimeter = 2 * pi * r;
        slice = area * ( (float) degree / 360);

        System.out.println("\nDarienin alanı : " + area);
        System.out.println("Dairenin çevresi : " + perimeter);
        System.out.println("Dairenin '" + degree + "' derece açısındaki diliminin alanı : " + slice);

    }
}
