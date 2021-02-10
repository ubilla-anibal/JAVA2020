package homework.day2;

public class Exe5 {
    public static void main(String[] args){

        String[] music = {"Disturbed!","FFDP!","PowerWolf!","Avenged Sevenfold!","Shakira!"};
        String[] sport = {"Football!","Ice Hockey","Volleyball","Olympic Games!","Wrestling!"};
        String[] event = {"WW3!","Cancer's Cure!","UFOs are Real!","Human Cloning!","Mar's landing!"};

        int arrNr = 5;

        for (int i = 1968; i < 1973; i++) {
            int randMusic = (int) (Math.random()*arrNr);
            int randSport = (int) (Math.random()*arrNr);
            int randEvent = (int) (Math.random()*arrNr);

            System.out.println(i);
            System.out.println(music[randMusic]);
            System.out.println(sport[randSport]);
            System.out.println(event[randEvent]);
            System.out.println("");
        }
    }
}