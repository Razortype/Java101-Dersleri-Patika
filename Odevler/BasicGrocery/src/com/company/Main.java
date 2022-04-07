package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double total = 0;
        int tempKilo;

        HashMap<String, Double> itemList = new HashMap();

        itemList.put("Armut", 2.14);
        itemList.put("Elma", 3.67);
        itemList.put("Domates", 1.11);
        itemList.put("Muz", 0.95);
        itemList.put("Patlıcan", 5.00);

        Scanner scan = new Scanner(System.in);

        for (String itemName : itemList.keySet()) {
            System.out.print("Kaç kilo " + itemName + "? : ");
            tempKilo = scan.nextInt();
            total += (double) tempKilo * itemList.get(itemName);
        }

        System.out.println("Toplam ücret : " + total);

    }
}
