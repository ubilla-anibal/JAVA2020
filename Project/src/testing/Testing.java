package testing;

import java.util.Scanner;

public class Testing {

    public static void reverseBubbleSort(int[] talen) {
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
    }
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] < arr[j]) {
                    swap(arr, j-1, j);
                }
            }
        }
    }
    private static void swap(int[] arr, int var1, int var2) {
        var temp = arr[var1];
        arr[var1] = arr[var2];
        arr[var2] = temp;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numb = {2,7,2,8,6,2,7,5,2,7,8,5,4,2,6};

        printArr(numb);

        sort(numb);

        printArr(numb);

        reverseBubbleSort(numb);

        printArr(numb);
    }
}