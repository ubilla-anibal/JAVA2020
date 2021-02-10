package com.example.exempelsortinsertion;

public class ExempelSortInsertion {
  public static void main(String args[]){
    // Array med värden att sortera
    int[] lista = new int[5];

    lista[1] = 19;
    lista[2] = 21;
    lista[3] = 18;
    lista[4] = 20;

    sortera(lista);

    // Den sorterade arrayen skrivs ut
    String textOutput = "";
    for(int a=1;a<lista.length;a++){
      textOutput += "Siffra :" + lista[a] + "\n";
    }

    System.out.println(textOutput);
  }

  // Metod som sorterar arrayen
  static void sortera(int[] lista) {
    int i;
    // Jämförelsetalet sparas i en temporär variabel
    int temp;
    // Skrivs över om vi högerskiftar talen till vänster om det
    for (int n = 1; n < lista.length; n++) {
      temp = lista[n];
      i = n - 1;

      // Jämförelsetalet jämförs med talen till vänster.
      // Avbryts bara av ett mindre tal eller om talen tar slut
      while (i >= 0 && lista[i] > temp) {
        lista[i + 1] = lista[i]; // Förskjuts åt höger
        i--;

      }
      // Jämförelsetalet infogas på det senaste indexet som högerskiftades (den tomma platsen)
      lista[i + 1] = temp;
    }
  }
}
