package homework.day3;

import java.util.Arrays;

public class Exe4 {
    public static void main(String[] args) {
        int t, i;
        int[][] table = new int[5][4];

        for (t = 0; t < 5; ++t) {
            for (i = 0; i < 4; ++i) {
                table[t][i] = (int) (1 + Math.random() * 9);
                System.out.print(table[t][i] + " ");
            }
            System.out.println();
        }
        int sum1 = table[0][0]+table[1][0]+table[2][0];
        int sum2 = table[0][1]+table[1][1]+table[2][1];
        int sum3 = table[0][2]+table[1][2]+table[2][2];
        int sum4 = table[0][3]+table[1][3]+table[2][3];
        int arr [] = {sum1, sum2, sum3, sum4};
        System.out.println(Arrays.toString(arr));

    }



}
