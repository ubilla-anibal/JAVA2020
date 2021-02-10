package com.example.exempelarray2;

public class ExempelArray2 {
  public static void main(String[] args) {
    int heltal[] = new int[10];

    // Tilldelar värden till varje element i arrayen
    for(int n=1;n<10;n++){
      heltal[n]=n;
    }

    // Gör en loop som skapar en variabel med innehållet i arrayen
    for(int n=1;n<10;n++){
      System.out.println("Siffra: " + heltal[n]);
    }
  }
}
