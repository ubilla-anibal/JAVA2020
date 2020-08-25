package com.homework.exercise6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cheese;
        System.out.print("Write how many Cheeses you want, each Cheese cost $5, you get a 10$ discount if you buy more than 4!: ");
        cheese = scan.nextInt();
        if ((cheese <=4)&&(cheese > 0)) {
            int total = cheese*5;
            System.out.println("You bought "+cheese+" Cheese(s) and it cost you "+total+"$");
        }
        else if (cheese >4) {
            int total = cheese*5;
            int total2Pay = total-10;
            System.out.println("You bought "+cheese+" Cheese(s) and it cost you "+total+"$, but including discount your total is "+total2Pay+"$");
        }
        else {
            System.out.println("Please write a positive nr");
        }
    }
}