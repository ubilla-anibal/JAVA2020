package com.example.conditions3;

import java.util.Scanner;

public class Conditions3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write in your name: ");
        String name = scan.nextLine();

        if(name.equals("Jerry")){
            System.out.println("Hello "+name+", glad to have you");

            System.out.print("What is your favourite album?: ");
            String album = scan.nextLine();

            if (album.equals("Revolver")) {
                System.out.println("Revolver is a good album with Beatles!");
            }
            else {
                System.out.println(album + " its a good album");
            }
        }
        else if(name.equals("Kalle")){
            System.out.println("Hi "+name+" glad to have you");
        }
        else {
            System.out.println("Hi "+name+" sorry we may need to rescheduled");
        }
    }
}