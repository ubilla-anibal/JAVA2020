package com.example.exempelif2;

import java.util.Scanner;

// Skriver ut en meddelande beroende på det tal användaren matar in
public class ExempelIf2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Skriv in ett tal: ");
    int tal = scan.nextInt();

    if(tal < 5){
      System.out.println("Ditt tal är mindre än 5");
    }
    else if(tal < 10){
      System.out.println("Ditt tal är mindre än 10");
    }
    else{
      System.out.println("Ditt tal är större än 10");
    }

  }
}
