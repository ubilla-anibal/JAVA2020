package com.example.exempeltal2;

import java.util.Scanner;

// Räknar ut summan av två tal som användaren matar in
public class ExempelTal2 {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int tal1;
    int tal2;
    int summa;

    System.out.print("Skriv tal 1: ");
    tal1 = scan.nextInt();

    System.out.print("Skriv tal 2: ");
    tal2 = scan.nextInt();

    summa = tal1 + tal2;

    System.out.println("Summan är: " + summa);
  }
}
