package com.example.exempelif1;

import java.util.Scanner;

// Skriver ut en hälsning beroede på namnet du matar in
public class ExempelIf1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Skriv in ditt namn: ");
    String namn = scan.nextLine();

    if(namn.equals("Jerry")){
      System.out.println("Hej " + namn + ", roligt att du hälsar på.");
    }
    else if(namn.equals("Kalle")){
      System.out.println("Hej " + namn + ", roligt att du också hälsar på.");
    }
    else{
      System.out.println("Hej " + namn + ", tyvärr vi får träffas en annan gång.");
    }

  }
}
