package com.example.exempelfortarning1;

public class ExempelForTarning1 {
  public static void main(String[] args){
    int antal = 6;
    // int är en explicit typomvandling som tar bort decimaler och omvandlar till heltal
    int mittKast = (int) (1+Math.random()*antal);
    System.out.println("Tärningen visar " + mittKast);
  }
}
