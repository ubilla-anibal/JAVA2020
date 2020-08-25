package com.homework.exercise7;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double temp;
        double celsius;
        double fahrenheit;

        System.out.print("For F->C enter 'C' and for C->F enter 'F': ");
        String choice = scan.nextLine();

        System.out.print("Enter the temperature you want to convert: ");
        temp = scan.nextDouble();

        if(choice.equals("c")||choice.equals("C")) {
            celsius = ((temp - 32)*5)/9;
            System.out.println(temp+"º Fahrenheit could be "+celsius+"º in Celsius");
        }
        else if(choice.equals("f")||choice.equals("F")) {
            fahrenheit = ((temp*9)/5)+32;
            System.out.println(temp+"º Celsius could be "+fahrenheit+"º in Fahrenheit");
        }
        else {
            System.out.print("Please ONLY enter  either 'C' or 'F'");
        }

    }
}