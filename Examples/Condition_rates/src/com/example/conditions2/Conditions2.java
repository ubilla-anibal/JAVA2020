package com.example.conditions2;

import java.util.Scanner;

public class Conditions2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write in a number: ");
        int nr = scan.nextInt();

        if(nr < 5){
            System.out.println("Your number is less than 5");
        }
        else if (nr < 10){
            System.out.println("Your number is less than 10");
        }
        else {
            System.out.println("Your number is greater than 10-");
        }
    }
}
