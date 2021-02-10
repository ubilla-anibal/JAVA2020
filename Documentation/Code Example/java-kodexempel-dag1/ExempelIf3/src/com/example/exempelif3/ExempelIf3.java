package com.example.exempelif3;

import java.util.Scanner;

/*
Skriver ut en hälsning beroende på vad användaren matar in för namn
Om man skriver in Jerry får man en fråga om favortialbum
 */
public class ExempelIf3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Skriv in ditt namn: ");
    String namn = scan.nextLine();

    if(namn.equals("Jerry")){
      System.out.println("Hej " + namn + ", roligt att du hälsar på.");

      System.out.print("Vilket är ditt favoritalbum?: ");
      String album = scan.nextLine();

      if(album.equals("Revolver")){
        System.out.println("Revolver är en fin skiva med Beatles!");
      }
      else{
        System.out.println(album + " är en bra skiva!");
      }

    }
    else if(namn.equals("Kalle")){
      System.out.println("Hej " + namn + ", roligt att du också hälsar på.");
    }
    else{
      System.out.println("Hej " + namn + ", tyvärr vi får träffas en annan gång.");
    }

  }
}
