package org.controlflow;

public class Main {
    public static void main(String[] args){
        GradingSystem gradingSystem = new GradingSystem();
        int percentage = 59;
        System.out.println("Percentage " + percentage);;
        System.out.println("Pass " +gradingSystem.isAPass(percentage));
        System.out.println("Grade "+gradingSystem.getGrade(percentage));
        System.out.println("Retake ? " +gradingSystem.retakeMessage(percentage,false));

    }
}
