package com.example.exempeltypomvandlingar;

// Exempel på typomvandlingar i Java
public class ExempelTypomvandlingar {
  public static void main(String[] args){
    // Omvandlar till heltal (avrundar inte utan tar bort decimaltalet)
    int antal = (int) 5.9;
    System.out.println("Omvandlar till heltal: " + antal);

    // Omvandlar till decimaltal (5.0)
    double pris = 5;
    System.out.println("Omvandlar till decimaltal (double): " + pris);

    // Omvandla tal till strängar
    double  miltal = 5.9;
    String outputMiltal = Double.toString(miltal);
    System.out.println("Omvandlar decimaltal till sträng: " + outputMiltal);

    String artal = Integer.toString(2018);
    System.out.println("Omvandlar (årtal) till sträng: " + artal);

    // Omvandla strängar till tal
    int heltal = Integer.valueOf(artal);
    System.out.println("Omvandlar heltal till sträng: " + heltal);

    double decimaltal = Double.valueOf("5.9");
    System.out.println("Omvandlar decimaltal till sträng: " + decimaltal);

    // Går inte att omvandla text till tal
    // int feltal = Integer.valueOff("Jerry");
  }
}
