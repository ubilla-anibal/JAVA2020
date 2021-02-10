package homework.day2;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        do {
            game();
        } while (playAgain());
    }

    static void game() {
        Scanner scan = new Scanner(System.in);

        String pInnPut;
        System.out.print("Press 'P' for paper,\nPress 'R' for rock or\nPress 'S' for scissors: ");
        pInnPut = scan.nextLine();

        String[] choice = {"R", "P", "S"};
        int randChoice = (int) (Math.random()*3);
        String cInput = (choice[randChoice]);

        String match = pInnPut+"v"+cInput;

        switch (match) {
            case "PvR", "RvS", "SvP" -> System.out.println("You win "+match);
            case "PvP", "RvR", "SvS" -> System.out.println("Tie! "+match);
            case "RvP", "SvR", "PvS" -> System.out.println("You Lose "+match);
            default -> System.out.println("Invalid Choice!");
        }
        System.out.println();
    }

    public static boolean playAgain() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Wanna Play again? (Y/N): ");
        String replay = scan.nextLine();
        return replay.equals("Y");
    }
}