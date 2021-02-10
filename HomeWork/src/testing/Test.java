package testing;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    static Scanner scan = new Scanner(System.in);
    static int dices = 5;
    static int rounds;
    static int hiScore;
    static int players;
    static int[] arrHiScore = {0, 0, 0};

    public static int[][] throwDices() {
        int[][] arr = new int[dices][rounds];
        for (int i = 0; i < dices; i++)
            for (int j = 0; j < rounds; j++)
                arr[i][j] = (int) (1 + Math.random() * 6);

        return arr;
    }

    public static void game() {
        System.out.print("How many round do u wanna play?(up to 13): ");
        rounds = scan.nextInt();
        System.out.print("How many round players?: ");
        players = scan.nextInt();
        System.out.println();

        int[][] setOfDicesCPU = throwDices(); //generate dices for CPU
        int[][] setOfDices = throwDices(); //generate dices for player

        column_sum(setOfDicesCPU);
        column_sum(setOfDices);
    }

    public static void whoWins(int[] array0, int[] array1)
    {
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

    public static void showHiScore()
    {
        if (arrHiScore[arrHiScore.length - 1] > hiScore)
            arrHiScore[arrHiScore.length - 1] = hiScore;
        reverseBubbleSort(arrHiScore);
        System.out.println(Arrays.toString(arrHiScore));
    }

    public static int[] column_sum(int[][] dArr)
    {
        int i = 0, j, sum = 0;
        int [] arr = new int[i];
        for (i = 0; i < rounds; ++i) {
            for (j = 0; j < dices; ++j)
                sum = sum + dArr[j][i];
            System.out.print(sum + " ");
            sum = 0;  // Reset the sum
        }
        return arr;
    }

    /*public static void dynamicLine() {
        System.out.println();
        for (int i = 0; i < rounds; i++)
            System.out.print("***");
        System.out.println();
    }*/

    public static boolean playAgain()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Wanna Play again? (Y/N): ");
        String replay = scan.nextLine();
        return replay.equals("Y");
    }

    public static void reverseBubbleSort(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 1; j < array.length - 1 - i; j++)
                if (array[j] < array[j - 1])
                    swap(array, j, j - 1);
    }

    private static void swap(int[] array, int index1, int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args)
    {
        do game();
        while (playAgain());
    }
}