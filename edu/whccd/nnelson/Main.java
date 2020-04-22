package edu.whccd.nnelson;
import java.util.Scanner;
import java.util.InputMismatchException;

/* This program is to show how to use a Try/catch statement to have numbers go through while everything NaN is Invalid
Author: Nicolay Nelson
 */


public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        try {
        System.out.print("Enter an integer:");
        int userInput = input.nextInt();
        System.out.println(userInput + " is valid");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        } finally {
            System.out.println("This finally block will run regardless if there is an exception or not.");
        }

    }
}

