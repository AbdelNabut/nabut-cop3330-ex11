package org.example;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.text.NumberFormat;

public class App 
{
    public static void main( String[] args )
    {
        BigDecimal dollars, dollarExchangeRate, euros, euroExchangeRate;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        dollarExchangeRate = BigDecimal.valueOf(0.816931);
        Scanner input = new Scanner(System.in);
        System.out.print("How many euros do you have? ");
        euros = input.nextBigDecimal();
        System.out.print("What is the exchange rate? ");
        euroExchangeRate = input.nextBigDecimal();
        dollars = (euros.multiply(euroExchangeRate)).setScale(2, RoundingMode.HALF_UP);
        System.out.println(formatter.format(euros) + " euros at an exchange rate of " + formatter.format(euroExchangeRate) + " is " + formatter.format(dollars) + " U.S. Dollars.");


    }
}
