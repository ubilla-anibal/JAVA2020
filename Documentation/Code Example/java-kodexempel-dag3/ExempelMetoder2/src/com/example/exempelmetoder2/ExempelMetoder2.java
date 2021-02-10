package com.example.exempelmetoder2;

public class ExempelMetoder2 {
  public static void main(String args[]){
    int tal1 = 1;
    int tal2 = 4;

    summa(tal1,tal2);
  }

  static void summa(int inTal1, int inTal2){
    int utSumma = inTal1 + inTal2;
    System.out.println(utSumma);
  }
}
