package com.example.exempelswitvh1;

public class ExempelSwitch1 {
  public static void main(String args[]) {

    for(int i=0; i<10; i++) {
      switch (i) {
        case 0:
          System.out.println("i är noll");
          break;
        case 1:
          System.out.println("i är ett");
          break;
        case 2:
          System.out.println("i är två");
          break;
        case 3:
          System.out.println("i är tre");
          break;
        case 4:
          System.out.println("i är fyra");
          break;
        default:
          System.out.println("i är fem eller mer");
      }
    }
  }
}
