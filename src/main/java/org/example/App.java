/**
 * UCF COP3330 Fall 2021 Assignment 11 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        double euros, usd, rate;
        Scanner scnr = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        euros = scnr.nextDouble();
        System.out.print("What is the exchange rate? ");
        rate = scnr.nextDouble();

        usd = rate * euros;
        System.out.println(euros + " euros at an exchange rate of " + rate + " is \n" + String.format("%.2f", usd) + " U.S. dollars.");
    }
}
