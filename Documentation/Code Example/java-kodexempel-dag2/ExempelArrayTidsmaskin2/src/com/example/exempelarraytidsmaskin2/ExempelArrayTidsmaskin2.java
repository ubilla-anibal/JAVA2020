package com.example.exempelarraytidsmaskin2;

public class ExempelArrayTidsmaskin2 {
  public static void main(String[] args){
    // Arrayer för tre olika typer av händelser
    String[] musik = {"Beatles ger ut Abbey Road!","Jimi Hendrix spelar på Woodstock!","Frank Zappa spelar med Mothers i Göteborg!","Grateful Dead släpper Live Dead!","Black Sabbath släpper Paranoid!"};
    String[] sport = {"Fotbolls-VM!","Ishockey-VM!","OS i London!","OS i Tokyo!","Formel 1 i New Delhi!"};
    String[] viktigt = {"Val i USA!","Striden om almarna i Stockholm!","Hagahuset ockuperas i Göteborg!","Norrmalmstorgsdramat i Stockholm!","Val i Sverige!"};

    // Variabel för antal element i samtliga arrayer
    int arrAntal = 5;

    // Skapar en loop mellan åren 1968 och 1972
    for(int i=1968;i<=1972;i++){

      // Variabler med slumpade händelser
      int randMusik = (int) (Math.random()*arrAntal);
      int randSport = (int) (Math.random()*arrAntal);
      int randViktigt = (int) (Math.random()*arrAntal);


      // Skriver ut händelserna
      System.out.println("Året är: " + i);
      System.out.println(musik[randMusik]);
      System.out.println(sport[randSport]);
      System.out.println(viktigt[randViktigt]);
    }
  }

}
