package com.company.week1;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {


        int number1 = 1, number2 = 2, total;
        System.out.print(number1 + " " + number1);

        for (int i = 2; i < 10; ++i)   //first 10 point
        {
            total = number1 + number2;
            System.out.print(" " + total);
            number1 = number2;
            number2 = total;
        }

    }
}
