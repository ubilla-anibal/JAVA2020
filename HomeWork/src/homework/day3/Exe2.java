package homework.day3;

import java.util.Arrays;
import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nrIn1;
        System.out.print("Write in nr1: ");
        nrIn1 = scan.nextInt();

        int nrIn2;
        System.out.print("Write in nr2: ");
        nrIn2 = scan.nextInt();

        int nrIn3;
        System.out.print("Write in nr3: ");
        nrIn3 = scan.nextInt();

        int nrIn4;
        System.out.print("Write in nr4: ");
        nrIn4 = scan.nextInt();

        int[] arr = {nrIn1, nrIn2, nrIn3, nrIn4};
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}