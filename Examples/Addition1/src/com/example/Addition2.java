package com.example;
import java.util.Scanner;

public class Addition2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nr1;
        int nr2;
        int sum;

        System.out.println("Write first number: ");
        nr1 = scan.nextInt();

        System.out.println("Write second number: ");
        nr2 = scan.nextInt();

        sum = nr1 + nr2;
        System.out.println("Tne Total is: "+sum);
    }
}