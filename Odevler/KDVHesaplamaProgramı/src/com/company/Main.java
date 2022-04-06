package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float kdvRatio = 0.18f,
                userInput,
                result,
                diff;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ücret tutarını giriniz (%18 KDV) : ");
        userInput = scan.nextInt();

        result = userInput + userInput*kdvRatio;
        diff = result - userInput;

        System.out.println("KDV'li tutarı : " + result);
        System.out.println("Fark : " + diff);

    }
}
