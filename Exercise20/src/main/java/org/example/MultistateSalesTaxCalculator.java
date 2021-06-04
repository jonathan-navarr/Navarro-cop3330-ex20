package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Navarro
 */

public class MultistateSalesTaxCalculator {
    public static void main(String[] args){
        double amount, tax, total;
        String state, county;

        Scanner scnr = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        amount = scnr.nextDouble();
        System.out.print("What state do you live in? ");
        state = scnr.next();

        if(state.equals("Wisconsin") || state.equals("WI")){
            System.out.print("What county do you live in? ");
            scnr.nextLine();
            county = scnr.nextLine();
            if(county.equals("Dunn") || county.equals("dunn")){
                tax = .05*amount;
                System.out.println("The tax is " + (tax+.004));
                total = (tax + amount);
                String strTotal = String.format("%.2f", total);
                System.out.print("The total is $" + strTotal);
            }
            if(county.equals("Eau Claire") || county.equals("eau claire")){
                tax = .05*amount;
                System.out.println("The tax is " + (tax+.005));
                total = (tax + amount);
                String strTotal = String.format("%.2f", total);
                System.out.print("The total is $" + strTotal);
            }
        }
        else if(state.equals("Illinois") || state.equals("illinois")){
            tax = .08*amount;
            System.out.println("The tax is " + tax);
            total = (tax + amount);
            String strTotal = String.format("%.2f", total);
            System.out.print("The total is $" + strTotal);
        }
        else{
            tax = 0.00;
            System.out.println("The tax is "+ 0.00);
            total = (tax + amount);
            String strTotal = String.format("%.2f", total);
            System.out.print("The total is $" + strTotal);
        }

    }
}
