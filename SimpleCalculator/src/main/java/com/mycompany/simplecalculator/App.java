/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simplecalculator;

import java.util.Scanner;

/**
 *
 * @author posso
 */
public class App {

    public static void main(String[] args) {

        String userChoice;
        Scanner input = new Scanner(System.in);
        boolean exitProgram = false;
        double op1, op2;
        SimpleCalculator calc = new SimpleCalculator();

        //System.out.println(calc.add(13.5, 16.4));
        while (exitProgram == false) {
            System.out.println("\nPlease select your operation from the menu below: \n");
            System.out.println("Enter 'a' for Addition");
            System.out.println("Enter 's' for Subtraction");
            System.out.println("Enter 'm' for Multiplication");
            System.out.println("Enter 'd' for Division ");
            System.out.println("Enter 'e' to exit the program \n");
            userChoice = input.nextLine().toLowerCase();

            switch (userChoice) {
                case "a":
                    System.out.println("\t Addition ");
                    System.out.println("Enter the first number: ");
                    op1 = Double.parseDouble(input.nextLine());
                    System.out.println("Enter the second number: ");
                    op2 = Double.parseDouble(input.nextLine());
                    System.out.println(op1 + " + " + op2 + " = " + calc.add(op1, op2));
                    break;

                case "s":
                    System.out.println("\t Subtraction ");
                    System.out.println("Enter the first number: ");
                    op1 = Double.parseDouble(input.nextLine());
                    System.out.println("Enter the second number: ");
                    op2 = Double.parseDouble(input.nextLine());
                    System.out.println(op1 + " - " + op2 + " = " + calc.subtract(op1, op2));
                    break;

                case "m":
                    System.out.println("\t Multiplication ");
                    System.out.println("Enter the first number: ");
                    op1 = Double.parseDouble(input.nextLine());
                    System.out.println("Enter the second number: ");
                    op2 = Double.parseDouble(input.nextLine());
                    System.out.println(op1 + " * " + op2 + " = " + calc.multiply(op1, op2));
                    break;

                case "d":
                    System.out.println("\t Division ");
                    System.out.println("Enter the first number: ");
                    op1 = Double.parseDouble(input.nextLine());
                    System.out.println("Enter the second number: ");
                    op2 = Double.parseDouble(input.nextLine());
                    System.out.println(op1 + " / " + op2 + " = " + calc.divide(op1, op2));
                    break;

                case "e":
                    System.out.println("Thank you! Come back soon.");
                    exitProgram = true;
                    break;

                default:
                    System.out.println("You entered '" + userChoice + "'. Take a closer look at the options and enter a valid option. \n");
                    break;
            }

        }
    }

}
