package backUp;

import java.util.Arrays;
import java.util.Scanner;

public class BackUp {
    static Scanner input = new Scanner(System.in);
    static int dices = 5;
    static int rounds = 3;
    static int players = 2;

    public static void main(String[] args)
    {
        int[][] m = getDices(); //Create a 2dArray that gets the values from getDices
        int[] a = sum(m);
        int[][] b = getPlayers(a);
        System.out.println("Sum of all elements is " + Arrays.toString(b));
    }

    public static int[][] getDices()
    {
        int[][] allDices = new int[dices][rounds];
        for (int row = 0; row < dices; row++) {
            for (int col = 0; col < rounds; col++) {
                allDices[row][col] = (int) (1 + Math.random() * 6);
                System.out.print(allDices[row][col]+" ");
            }
            System.out.println();
        }
        return allDices;
    }

    public static int[] sum(int[][] arr)
    {
        int sum = 0;
        int[] total = new int[rounds];
        for (int i = 0; i < rounds; i++) {
            for (int j = 0; j < dices; j++) {
                sum = sum + arr[j][i];
            }
            total[i] = sum;
            sum = 0;
        }
        return total;
    }

    public static int[][] getPlayers(int[] arr)
    {
        int[][] totalPlayers  = new int[players][rounds];
        for (int row = 0; row < players ; row++) {
            for (int col = 0; col < rounds; col++) {
                totalPlayers[row][col] = arr[row];
                System.out.print(totalPlayers[row][col]+" ");
            }
            System.out.println();
        }
        return totalPlayers;
    }
}