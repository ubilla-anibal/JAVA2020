package testing;

import java.util.Scanner;

public class ProjectFinal {

    static Scanner scan = new Scanner(System.in);
    static int rounds;
    static int casts;
    static int playersInPut;
    static int players;
    static int[] hiScore = {};

    static int makeDice() {
        return (int) (1 + Math.random() * 6);
    }

    static int[] makeSetDices() {
        int[] arr = new int[casts];
        for (int i = 0; i < casts; i++)
            arr[i] = makeDice();
        return arr;
    }

    static int sumDices() {
        int[] arr = makeSetDices();
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum;
    }

    static int[] makeRounds() {
        int[] arr = new int[rounds];
        for (int i = 0; i < rounds; i++) {
            arr[i] = sumDices();
        }
        return arr;
    }

    static int sumRounds(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total = total + i;
        }
        return total;
    }

    static int findLargest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    static void updateHiScore(int index) {
        int[] newHiScore = new int[hiScore.length + 1];
        for (int i = 0; i < hiScore.length; i++) {
            newHiScore[i] = hiScore[i];
        }
        newHiScore[newHiScore.length - 1] = index;
        hiScore = newHiScore;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] < arr[j]) {
                    swap(arr, j - 1, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int var1, int var2) {
        var temp = arr[var1];
        arr[var1] = arr[var2];
        arr[var2] = temp;
    }

    static int findWinner(int[] arr, int index) {
        int winner = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == index)
                winner = i;
        }
        return winner;
    }

    static void showHiScore() {
        System.out.println("\nHi-Score!");
        for (int i : hiScore) {
            System.out.print(i + " ");
        }
    }

    static void showPlayer() {
        int[] totalArr = new int[players];
        System.out.println();
        for (int i = 0; i < players; i++) {
            if (i == 0) {
                System.out.println("You");
            } else if (i == 1 && playersInPut == 1) {
                System.out.println("CPU");
            } else {
                System.out.println("Player: " + (i + 1));
            }
            int total = showRound();
            totalArr[i] = total;
        }
        int winnerPoints = findLargest(totalArr);
        int winner = findWinner(totalArr, winnerPoints);
        System.out.println("\nWinner, with -" + winnerPoints + "- points, is Player " + (winner + 1) + "!");
        updateHiScore(winnerPoints);
    }

    static int showRound() {
        int[] a = makeRounds();
        int b = sumRounds(a);
        for (int i = 0; i < rounds; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("| Total: " + b);
        return b;
    }

    public static void intro() {
        System.out.print("Players? ");
        playersInPut = scan.nextInt();
        if (playersInPut == 1) {
            players = 2;
        } else {
            players = playersInPut;
        }
        System.out.print("Rounds? ");
        rounds = scan.nextInt();
        System.out.print("Dices per Round? ");
        casts = scan.nextInt();
    }

    public static boolean playAgain() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n\nWanna Play again? (Y/N): ");
        String replay = scan.nextLine();
        return replay.equals("Y");
    }

    static void game() {

        //intro(); //Renewable parameters
        showPlayer();
        sort(hiScore);
        showHiScore();
    }

    public static void main(String[] args) {
        System.out.println("\nWelcome to Throw-Dices-With-Friends-Or-By-Yourself!!");
        intro(); //Permanent parameters
        do game();
        while (playAgain());
    }
}