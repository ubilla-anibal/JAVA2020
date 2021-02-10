package project;

//simple (maybe) yathzee
//5 dices each throw to a max of 3 throws -chosable
//print out a sum for their cast each round, and the total of throws for player and CPU
//print out who the winner is based on the points

//Hi score list, for add the total points in an array (has to be saved outside, so the game is replayable)

//be able to add more players

import java.util.Arrays;
import java.util.Scanner;


public class Project1 {

    private static int[] setOfDices;

    public static int[] throwDices() {
        setOfDices = new int[5];
        for (int i = 0; i < setOfDices.length; i++)
            setOfDices[i] = (int) (1 + Math.random() * 6);
        return setOfDices;
    }

    static void game() {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to 'Simple Yahtzee' Hi-Score: " );
        System.out.print("How many round do u wanna play?(up to 13): ");
        int rounds = scan.nextInt();
        int dices = 5;

        int[][] setOfDice = new int[dices][rounds];
        for (int i = 0; i < dices; i++) {
            for (int j = 0; j < rounds; j++) {
                setOfDice[i][j] = (int) (1 + Math.random() * 6);
                System.out.print(setOfDice[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < rounds; i++)
        System.out.print("***");
        System.out.println();
    }

    public static boolean playAgain() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Wanna Play again? (Y/N): ");
        String replay = scan.nextLine();
        return replay.equals("Y");
    }

    public void reverseBubbleSort(int[] array) {
        for (int i = 0; i <array.length; i++)
            for (int j = 1; j <array.length; j++)
                if (array[j] < array[j - 1])
                    swap(array, j, j-1);
    }

    private void swap(int[] array,int index1,int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        do game();
        while (playAgain());
    }
}