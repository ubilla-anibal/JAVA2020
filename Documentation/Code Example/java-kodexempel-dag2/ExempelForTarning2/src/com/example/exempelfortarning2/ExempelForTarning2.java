package com.example.exempelfortarning2;

public class ExempelForTarning2 {
  public static void main(String[] args) {
    int antalKast = 5;
    int antalSidor = 6;
    int summa = 0;

    // Skapar ett tärningskast lika många gånger som variabeln summa har angett
    for(int i=1; i <= antalKast; i++){
      int mittKast = (int) (1+antalSidor*Math.random());
      System.out.println("Kast " + i + " är " + mittKast);
      summa += mittKast;
    }
    System.out.println("Din summa är " + summa);
  }
}
