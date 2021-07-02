package com.company.week1;

import java.util.Scanner;

public class Manav {

    public static void main(String[] args) {
        System.out.println("Welcome to Fruit Seller\n************");
        Scanner scanner = new Scanner(System.in);

        //Define constant
        String[] fruitList = {"Armut","Elma","Domates","Muz","Patlıcan"};
        float[] priceList={2.14f,3.67f,1.11f,0.95f,5.00f};
        double totalPrice=0;

        //Print information
        for(int i=0;i<fruitList.length;i++){
            System.out.println(fruitList[i]+" kilosu :"+priceList[i]);
        }

        // Calculate Price
        for(int i=0;i<fruitList.length;i++){
            System.out.print(fruitList[i]+" kaç kilo alacaksınız:");
            double kilo=scanner.nextInt();
            totalPrice+=kilo*priceList[i];
        }

        System.out.format("\nTotal price : %.2f TL", totalPrice);
    }
}
