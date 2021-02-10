package com.example.exempelarray1;

public class ExempelArray1 {
  public static void main(String[] args) {
    /* Deklarerar variabler för bilmärken
		String cars1 = "Volvo";
    String cars2 = "Saab";
    String cars3 = "Mazda";
    */

    /*
    Skapar istället en array som innehåller bilmärken
    Man måste initiera arrayvariabeln och det gör man med new.
    Man talar också om hur många element den innehåller
    */
    String cars[] = new String[3];
    cars[0] = "Volvo";
    cars[1] = "Saab";
    cars[2] = "Mazda";

    System.out.println("Bilmärken:");
    System.out.println(cars[0] + "\n" + cars[1] + "\n" + cars[2]);

    // Skapar en array med element direkt. Då behöver man inte skriva ut operatorn new.
    String[] guitarist = {"Eric Clapton", "Jimi Hendrix", "Frank Zappa"};

    /*
    Skapar en loop som skapar en variabel med innehållet i arrayen guitarist.
    guitarist.length Kontrollerar hur många element som ingår i arrayen.
    */
    System.out.println("Gitarrister:");
    for (int i = 0; i < guitarist.length; i++) {
      System.out.println(guitarist[i]);
    }
  }
}