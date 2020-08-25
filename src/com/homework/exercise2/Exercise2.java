package com.homework.exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write your name: ");
        String name = scan.nextLine();

        System.out.print("Write your surname: ");
        String surName = scan.nextLine();

        System.out.print("Write your hobby: ");
        String hobby = scan.nextLine();

        System.out.println("Hello "+name+" "+surName+" glad to have you, we also enjoy "+hobby);
    }
}