import java.util.Scanner;

public class ProjectMain {
    static Scanner scan = new Scanner(System.in);


    static int zero() {
        int input;
        System.out.println("nr");
        input = scan.nextInt();
        return input;
    }


    static int first(int x) {
        int sum;
        sum = 5 + x;
        return sum;
    }


    public static void main(String[] args) {
        zero();
        first(zero());
    }
}