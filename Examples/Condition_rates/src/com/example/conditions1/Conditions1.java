package com.example.conditions1;
import java.util.Scanner;

public class Conditions1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write your name: ");
        String name = scan.nextLine();

        if(name.equals("Jerry")){
            System.out.println("Hej " + name + ", glad to have you");
        }
        else if(name.equals("Kalle")){
            System.out.println("Hej " + name + ", glad to have you, too");
        }
        else {
            System.out.println("Hej " + name + ", sorry we many need to reschedule");
        }
    }
}