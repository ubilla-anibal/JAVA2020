package homework.day2;

import java.util.Random;

public class Exe7 {
    public static void main(String[] args) {
        //withRandFunction();
        noRandFunction();
    }

    static void withRandFunction () {
        Random rand = new Random();

        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 5; j++) {
                int randNr = rand.nextInt(11);
                System.out.print(randNr + " ");
            }
        }
    }
    static void noRandFunction () {
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 5; j++) {
                int randNr = (int)(1+Math.random()*11);
                System.out.print(randNr+" ");
            }
        }
    }
}