package org.controlflow;

public class GradingSystem {
    //ifElse control flow

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
