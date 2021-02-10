package com.example.exempelmetoder1;

public class ExempelMetoder1 {
  public static void main(String args[]){
    int tal1 = 1;
    int tal2 = 4;

    System.out.println(summa(tal1,tal2));
  }

  static int summa(int inTal1, int inTal2){
    int utSumma = inTal1 + inTal2;
    return utSumma;
  }
}
