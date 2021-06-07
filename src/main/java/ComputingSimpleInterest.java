/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Seney
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;


public class ComputingSimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // principal amount, the rate as percentage, time, display amount made(prinicepal + inerest)

        // formula is A = P(1+rt) p = principal, r = annual rate, t = number of years invested, a = total amount

        System.out.print("Enter the initial amount:");
        int initial = scanner.nextInt();

        System.out.print("Enter the rate of interest in percentage: ");
        double ratePercentage = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int year = scanner.nextInt();

        double rateDecimal = ratePercentage / 100;

        double finalAmount = initial * (1 + (rateDecimal * year));

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println("After " + year + " years at " + ratePercentage + "%, the investment will be worth $" + df.format(finalAmount));
    }
}
