package com.homework.exercise4;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write 'c' for Coffee and 't' for Tea: ");
        String choice = scan.nextLine();

        if(choice.equals("c")||choice.equals("C")) {
            System.out.println("Here you go some nice warm Coffee");
        }
        else if(choice.equals("t")||choice.equals("T")) {
            System.out.println("Here you go some nice warm Tea");
        }
        else {
            System.out.println("Plz, pick either Coffee or Tea!");
        }
    }
}