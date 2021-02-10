package testing1;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    static int[] arrHiScore = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int[][] twoDArr;

    static int dices = 5;
    static int rounds = 13;
    static int players = 2;
    static int hiScore;
    static int sum;

    public static void main(String[] args) {
        do setOfDices();
        while (playAgain());
    }

    //takes an 2D array and add its column and gives out a normal array out.
    public static void colSum(int[] arr) {
        for (int j = 0; j < rounds; j++) {
            for (int k = 0; k < dices; k++)
                sum = sum + twoDArr[k][j];
            arr[j] = sum;
            sum = 0;
        }
    }

    //Get 5 random dices.
    public static void getDices() {
        for (int j = 0; j < dices; j++)
            for (int k = 0; k < rounds; k++)
                twoDArr[j][k] = (int) (1 + Math.random() * 6);
    }

    //getDices and getSum to each player
    public static void setOfDices() {
        int[] total = new int[rounds];
        sum = 0;
        twoDArr = new int[dices][rounds];

        for (int i = 0; i <= players; i++) {
            getDices();
            //System.out.println("*"); //format visual array
            colSum(total);

            for (int k : total)
                System.out.print(k + "  ");

            System.out.println("\n");
        }
    }

    public static void whoWins(int[] array0, int[] array1) {
        for (int i = 0; i < array0.length; i++) {
            int temp0 = array0[i], temp1 = array1[i];
            if (temp0 < temp1) {
                System.out.println(i + " You win! " + temp1 + " vs " + temp0);
                hiScore = array1[i];
                showHiScore();
            } else if (temp0 == temp1)
                System.out.println(i + " You tie! " + temp1 + " vs " + temp0);
            else
                System.out.println(i + " You lose! " + temp1 + " vs " + temp0);
        }
    }

    public static void showHiScore() {
        if (arrHiScore[arrHiScore.length - 1] > hiScore)
            arrHiScore[arrHiScore.length - 1] = hiScore;
        reverseBubbleSort(arrHiScore);
        System.out.println(Arrays.toString(arrHiScore));
    }

    public static void reverseBubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 1; j < array.length - 1 - i; j++)
                if (array[j] < array[j - 1])
                    swap(array, j, j - 1);
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static boolean playAgain() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Wanna Play again? (Y/N): ");
        String replay = scan.nextLine();
        return replay.equals("Y");
    }
}