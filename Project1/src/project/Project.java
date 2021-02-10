package project;

import java.util.Scanner;

public class Project {
    static Scanner scan = new Scanner(System.in);


    static int rounds;
    static int players;
    static int dices = 5;

    static int[][] dicesPerRound;

    static void getDices() {
        for (int i = 0; i < dices; i++)
            for (int j = 0; j < rounds; j++)
                dicesPerRound[i][j] = (int) (1 + Math.random() * 6);
    }

    static int columnSum;

    private static void getSumOfDicesPerRound(int[] arr) {
        for (int i = 0; i < rounds; i++) {
            for (int j = 0; j < dices; j++)
                columnSum = columnSum + dicesPerRound[j][i];
            arr[i] = columnSum;
            columnSum = 0;
        }
    }

    static int total;
    public static void giveSumOfRoundToPlayers() {
        int [] sumPerRound = new int[rounds];
        dicesPerRound = new int[dices][rounds];

        for (int i = 0; i < players; i++) {
            getDices();
            getSumOfDicesPerRound(sumPerRound);

            for (int j = 0; j < players; j++) {
                total = total + sumPerRound[j];
                System.out.println("This is total of all rounds "+total + " ");
            }
            System.out.println();
            total = 0;

        }
    }

    public static void main(String[] args) {

        System.out.print("rounds: ");
        rounds = scan.nextInt();

        System.out.print("players: ");
        players = scan.nextInt();

        giveSumOfRoundToPlayers();
    }
}