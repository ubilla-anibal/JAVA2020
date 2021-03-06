package homework.day4;
import java.util.Scanner;

public class Exe1 {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap happens here
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nrIn1;
        int nrIn2;
        int nrIn3;
        int nrIn4;
        String question;

        System.out.print("Write in nr1: ");
        nrIn1 = scan.nextInt();
        System.out.print("Write in nr2: ");
        nrIn2 = scan.nextInt();
        System.out.print("Write in nr3: ");
        nrIn3 = scan.nextInt();
        System.out.print("Write in nr4: ");
        nrIn4 = scan.nextInt();
        int[] arr = {nrIn1, nrIn2, nrIn3, nrIn4};

        scan.nextLine();

        System.out.print("Sort? Y/N: ");
        question = scan.nextLine();

        System.out.println();

        switch (question) {
            case "Y","y" -> {
                bubbleSort(arr);
                System.out.println("Array with Bubble Sort");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            case "N","n" -> {
                System.out.println("Array w/o Bubble Sort");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            default -> System.out.println("Invalid Choice!");
        }
    }
}