package homework.day2;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nrInPut;

        System.out.print("Input a number: ");
        nrInPut = scan.nextInt();

        for (int i = 0; i < nrInPut; i++) {
            System.out.println(i+1+" Java Is Fun");
        }
    }
}