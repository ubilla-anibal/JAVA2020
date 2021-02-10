package com.example.exempelfor2;

public class ExempelFor2 {
  public static void main(String[] args){
    for(int i = 1; i <= 10; i++){
      // Vi bryter loopen efter fem gånger
      if(i > 5){
        break;
      }
      System.out.println("Rad nummer " + i);
    }
  }
}
