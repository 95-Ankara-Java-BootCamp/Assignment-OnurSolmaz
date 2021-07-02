package com.company.week1;

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {

        double number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score:");
        number = input.nextDouble();

        if(number >0 && number <= 100) {
            if (number >= 90) {
                System.out.println("AA");
            } else if (number >= 80) {
                System.out.println("BA");
            } else if (number >= 70) {
                System.out.println("BB+");
            } else if (number >= 60) {
                System.out.println("BB");
            } else if (number >= 50) {
                System.out.println("BC");
            } else if (number >= 45) {
                System.out.println("CC");
            } else if (number < 45) {
                System.out.println("FF");
            }
        }else
            System.out.println("Please enter valid score");

    }
}
