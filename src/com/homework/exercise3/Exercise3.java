package com.homework.exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nr1;
        double nr2;
        double mult;
        double divi;

        System.out.print("Write in the first number: ");
        nr1 = scan.nextDouble();
        System.out.print("Write in the second number: ");
        nr2 = scan.nextDouble();

        mult = nr1*nr2;
        divi = nr1/nr2;

        System.out.println("The multiplication is: "+mult);
        System.out.println("The division is: "+divi);
    }
}
