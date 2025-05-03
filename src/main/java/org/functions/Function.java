package org.functions;

import java.util.Scanner;

public class Function {
    public static void announceDeveloperTeaTime(){
        System.out.println("Waiting for developer tea time");
        System.out.println("Input a random word and press enter its developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("Its developer tea time");
    }
    public static void main(String[] args){
        announceDeveloperTeaTime();
    }
}
