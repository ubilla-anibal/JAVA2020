package com.example.typeConversions;

public class TypeConversions {
    public static void main(String[] args) {
        int number = (int)5.9;
        System.out.println("Removes decimal: "+number);

        double price = 5;
        System.out.println("Adds decimal: "+price);

        double myNumber = 5.9;
        String outputMyNumber = Double.toString(myNumber);
        System.out.println("Changes double/int to string: "+outputMyNumber);

        String year = Integer.toString(2020);
        System.out.println("Changes (year) to string: " +year);

        int yearNumber = Integer.valueOf(year);
        System.out.println("Changes string to Int: " +yearNumber);

        double decimalNr = Double.valueOf("5.9");
        System.out.println("Changes string to Double: " +decimalNr);
    }
}
