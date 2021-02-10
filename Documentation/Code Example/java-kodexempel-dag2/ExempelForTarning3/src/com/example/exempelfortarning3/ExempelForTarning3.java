package com.example.exempelfortarning3;

public class ExempelForTarning3 {
  public static void main(String[] args) {
    int antalKast = 5;
    int antalSidor = 6;
    int summaSpelare1 = 0;
    int summaSpelare2 = 0;

    // Initierar en array med integer och allokerar minne för två integer
    int[] kastArray;
    kastArray = new int[2];

    // Skapar tärningskast för två spelare lika många gånger som variabeln summa har angett
    for(int i=1; i <= antalKast; i++){
      kastArray[0] = (int) (1+antalSidor*Math.random());
      kastArray[1] = (int) (1+antalSidor*Math.random());

      System.out.println("Spelare 1: Kast: " + i + " är " + kastArray[0]);
      System.out.println("Spelare 2: Kast: " + i + " är " + kastArray[1]);

      summaSpelare1 += kastArray[0];
      summaSpelare2 += kastArray[1];
    }
    System.out.println("Summa för spelare 1 är: " + summaSpelare1);
    System.out.println("Summa för spelare 2 är: " + summaSpelare2);
  }
}
