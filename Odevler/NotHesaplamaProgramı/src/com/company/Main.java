package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] lessons = {"Matematik", "Fizik", "Kimya", "Türkçe", "Tarih", "Müzik"};
        int totalGrade = 0;
        int lessonCount = lessons.length;
        float resultGrade;

        Scanner scan = new Scanner(System.in);

        for (String lesson : lessons) {
            System.out.print(lesson + " dersinin notunu giriniz : ");
            totalGrade += scan.nextInt();
        }

        resultGrade = (float) totalGrade/lessonCount;

        System.out.println("Not ortalaman : " + resultGrade);

    }
}
