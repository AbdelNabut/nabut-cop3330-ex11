package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        double dollars, dollarExchangeRate, euros, euroExchangeRate;
        dollarExchangeRate = 0.816931;
        Scanner input = new Scanner(System.in);
        System.out.print("How many euros do you have? ");
        euros = input.nextDouble();
        System.out.print("What is the exchange rate? ");
        euroExchangeRate = input.nextDouble();
        dollars = (euros * euroExchangeRate);
        System.out.println(euros + " euros at an exchange rate of " + String.format("%.2f", euroExchangeRate) + " is " + String.format("%.2f", dollars) + " U.S. Dollars.");


    }
}
