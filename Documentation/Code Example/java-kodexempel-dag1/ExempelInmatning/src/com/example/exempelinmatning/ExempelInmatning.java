package com.example.exempelinmatning;

import java.util.Scanner;

// Exempel på inmatning med Scanner-klassen i en konsoll-applikation
public class ExempelInmatning {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.print("Ditt namn: ");
    String namn = scan.nextLine();

    System.out.print("Din ålder: ");
    int alder = scan.nextInt();

    System.out.print("Din längd: ");
    double langd = scan.nextDouble();

    System.out.println(namn + " är " + alder + " år gammal och " + langd + " meter lång. ");
  }
}
