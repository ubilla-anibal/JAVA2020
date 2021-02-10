package com.example.exempelsortbubble;

public class ExempelSortBubble {
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
  static void sortera(int[] lista){
    // Den inre loopen ökar n och flyttar upp det största talet
    // Den yttre loopen gör om proceduren med minskade m
    for(int m=lista.length-1; m>0; m--){
      for(int n=0;n<m;n++){
        if(lista[n] > lista[n+1]){
          int temp = lista[n];
          lista[n] = lista[n+1];
          lista[n+1] = temp;
        }
      }
    }
  }
}
