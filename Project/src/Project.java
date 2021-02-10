import java.util.Scanner;

public class Project {
    static Scanner scan = new Scanner(System.in);
    static int rounds;
    static int dices;
    static int players;
    static int[] hiScore = new int[5];


    static int[] getDices() {
        int[] a = new int[rounds];
        for (int i = 0; i < rounds; i++)
            a[i] = (int) (1 + Math.random() * 6);
        return a;
    }

    public static void intro(){
        System.out.print("Rounds? :");
        rounds = scan.nextInt();
        /*
        System.out.print("Players? :");
        players = scan.nextInt();
        System.out.print("Dices? :");
        dices = scan.nextInt();
        */
    }

    static void game() {
        intro();
        setHiScore();
        int[] a = getDices();
        int[] b = getDices();
        int aTotal = 0;
        int bTotal = 0;

        for (int i = 0; i < rounds; i++) {
            if (a[i] > b[i])
                System.out.println("Round " + (i + 1) + " winner is Player: " + a[i] + " vs " + b[i]);
            else if (a[i] < b[i])
                System.out.println("Round " + (i + 1) + " winner is CPU: " + a[i] + " vs " + b[i]);
            else
                System.out.println("Round " + (i + 1) + " is a tie: " + a[i] + " vs " + b[i]);
        }

        for (int i = 0; i < a.length; i++)
            aTotal = aTotal + a[i];

        for (int i = 0; i < b.length; i++)
            bTotal = bTotal + b[i];

        System.out.println();

        if (aTotal > bTotal) {
            if (hiScore[hiScore.length - 1] < aTotal) {
                hiScore[hiScore.length - 1] = aTotal;
                hiScore = reverseBubbleSort(hiScore);
            }
            System.out.println();
            System.out.println("Player is the winner with a total of " + aTotal + " points");

        } else if (bTotal > aTotal) {
            System.out.println("CPU is the winner with a total of " + bTotal + " points");
        } else
            System.out.println("Wicked! Its a tied! " + aTotal + " vs " + bTotal);
    }

    public static int[] reverseBubbleSort(int[] talen) {
        while (true) {
            int antalflytt = 0;

            for (int i = talen.length - 1; i > 0; i--) {

                if (talen[i] > talen[i - 1]) {
                    antalflytt++;

                    int rembember = talen[i];

                    talen[i] = talen[i - 1];
                    talen[i - 1] = rembember;
                }
            }
            if (antalflytt == 0)
                break;
        }
        return talen;
    }

    public static void setHiScore() {
        System.out.println("Current HiScore");
        for (int i = 0; i < hiScore.length; i++) {
            System.out.print(hiScore[i] + " ");
        }
    }

    public static boolean playAgain() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Wanna Play again? (Y/N): ");
        String replay = scan.nextLine();
        return replay.equals("Y");
    }

    public static void main(String[] args) {
        do game();
        while (playAgain());
    }
}