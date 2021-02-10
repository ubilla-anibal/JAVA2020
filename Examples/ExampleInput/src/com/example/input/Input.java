package com.example.input;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = scan.nextLine();

        System.out.print("Your Age: ");
        int age = scan.nextInt();

        System.out.print("Your length: ");
        double length = scan.nextDouble();

        System.out.println(name + " is " + age + " years old and " + length + " meters long ");
    }
}
