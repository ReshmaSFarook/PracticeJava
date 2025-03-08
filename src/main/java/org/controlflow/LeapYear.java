package org.controlflow;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        // Change these boolean values to control whether you see
        // the expected result and/or hints.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year to check if it is a leap year");
        int year = scanner.nextInt();
        isLeapYear(year);
    }

    static void isLeapYear(int year) {
        // Your code goes here.
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is a not a leap year");
        }
    }
}

