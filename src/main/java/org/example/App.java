/*
 * UCF COP3330 Fall 2021 Assignment 21 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println( "Please enter the number of the month: " );
        int userMonth = input.nextInt();

        while (userMonth <= 0 || userMonth > 12) {
            userMonth = 0;
            System.out.println( "Invalid input. Please enter the number of the month: " );
            userMonth = input.nextInt();
        }

        String month = "uninitialized";

        switch (userMonth) {
            case 1: month = "January";
                break;
            case 2: month = "February";
                break;
            case 3: month = "March";
                break;
            case 4: month = "April";
                break;
            case 5: month = "May";
                break;
            case 6: month = "June";
                break;
            case 7: month = "July";
                break;
            case 8: month = "August";
                break;
            case 9: month = "September";
                break;
            case 10: month = "October";
                break;
            case 11: month = "November";
                break;
            case 12: month = "December";
                break;
        }

        System.out.println("The name of the month is " + month + ".");
    }
}
