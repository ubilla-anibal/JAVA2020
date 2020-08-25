package com.homework.exercise8;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double weight;
        double height;

        System.out.print("Input your weight (in kg): ");
        weight = scan.nextDouble();
        System.out.print("Input your height (in meters): ");
        height = scan.nextDouble();

        double BMI = weight/(height*height);

        if(BMI <19) {
            System.out.println("You are too thin "+BMI);
        }
        else if((BMI>=20)&&(BMI<=24)) {
            System.out.println("You are underweight "+BMI);
        }
        else if ((BMI<26)&&(BMI>24)) {
            System.out.println("Perfect "+BMI);
        }
        else if((BMI>=26)&&(BMI<=30)) {
            System.out.println("You are overweight "+BMI);
        }
        else {
            System.out.println("Obesity "+BMI);
        }
    }
}