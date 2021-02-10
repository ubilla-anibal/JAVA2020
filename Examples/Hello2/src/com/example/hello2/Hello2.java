package com.example.hello2;

import java.util.Scanner;

public class Hello2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write your name: ");
        String inputName = scan.nextLine();
        System.out.println(inputName);
    }
}