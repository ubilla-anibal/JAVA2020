package com.example.exempelloopnested;

public class ExempelLoopNested {
  public static void main(String args[]) {

    for(int i=1; i <= 5; i++) {
      System.out.println("Yttre loop " + i + ".");
      for(int j = 1; j < 7; j++) {
        System.out.println(" Inre loop " + j + " (i yttre loop: " + i + ").");
      }
    }
  }
}
