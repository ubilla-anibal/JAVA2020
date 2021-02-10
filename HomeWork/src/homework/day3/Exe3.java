package homework.day3;

public class Exe3 {
    public static void main(String[] args) {
        int t, i;
        int[][] table = new int[3][4];

        for (t = 0; t < 3; ++t)
            for (i = 0; i < 4; ++i) {
                table[1][3] = (int) (1 + Math.random() * 10);
                System.out.print(table[t][i] + " ");
            }
            System.out.println();
    }
}