package homework.day2;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nrInPut;
        String txtInPut;

        System.out.print("Input a number: ");
        nrInPut = scan.nextInt();

        scan.nextLine(); /* bugs are dumb */

        System.out.print("Input some text: ");
        txtInPut = scan.nextLine();

        for (int i = 0; i < nrInPut; i++) {
            if (i > 9){
                break;
            }
            System.out.println(i+1+" "+txtInPut);
        }

    }
}
