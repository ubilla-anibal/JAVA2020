package com.example.exempelhello2;

import java.util.Scanner;

// Skriver ut en hälsning med ditt namn
public class ExempelHello2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Skriv ditt namn: ");
    String inputNamn = scan.nextLine();

    System.out.println(inputNamn); }
}

