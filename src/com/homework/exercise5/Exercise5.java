package com.homework.exercise5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write 'c' for Coffee and 't' for Tea: ");
        String choice = scan.nextLine();

        if(choice.equals("c")||choice.equals("C")) {
            System.out.print("Write 'm' for milk and/or 's' for sugar with your coffee: ");
            String coffeeChoice = scan.nextLine();
            switch (coffeeChoice) {
                case "m", "M" -> System.out.println("Here, you go some nice warm Coffee with Milk");
                case "s", "S" -> System.out.println("Here, you go some nice warm Coffee with Sugar");
                case "sm", "SM", "sM", "Sm" -> System.out.println("Here, you go some nice warm Coffee with Milk and Sugar");
                default -> System.out.println("Here, you go some nice warm Coffee");
            }
        }
        else if(choice.equals("t")||choice.equals("T")) {
            System.out.println("Here you go some nice warm Tea");
        }
        else {
            System.out.println("Plz, pick either Coffee or Tea!");
        }
    }
}