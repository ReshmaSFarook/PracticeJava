package org.controlflow;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class GradingSystem {
    //ifElse control flow

    public static void main(String[] args){
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);
        int inputtedNum = scanner.nextInt();
        if (inputtedNum > 5) {
            System.out.println("Enjoy the good luck your friend brings for you");
        } else {
            System.out.println("YourShoeSelection Will make you happy today");
        }
    }

    public boolean isAPass(int percentage){
        if(percentage>=60){
            return true;
        }else {
            return false;
        }
    }

    public char getGrade(int percentage)
    {
        if (percentage>=90){
            return 'A';
        }
        else if (percentage >= 80)
        {
            return 'B';
        }
        else if( percentage>=70)
        {
            return 'C';
        }
        else if(percentage>60){
            return 'D';
        }
        else {
            return 'F';
        }
    }

    public String retakeMessage(int percentage, boolean allowedToRetake){
        if(percentage < 60 && allowedToRetake) {
            return "Allowed to retake";
        }else if(percentage< 60 && !allowedToRetake) {
         return "Not allowed to retake";
        }
        return "A retake is not required";
    }
}
