package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double userLength, userWeight, bodyMassIndex;

        Scanner scan = new Scanner(System.in);

        System.out.print("Boyunuzu giriniz (m) : ");
        userLength = scan.nextDouble();

        System.out.print("Kilonuzu giriniz (kg) : ");
        userWeight = scan.nextDouble();

        bodyMassIndex = userWeight / userLength * userLength;

        System.out.println("Kitle indeksiniz : " + bodyMassIndex);

    }
}
