package levelupjava;

import java.util.Scanner;

public class booleanCheck {

    public static boolean isEven(int a){
        return a%2==0;
    }

    public static void main(String[]args){
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Is the number even ? " +isEven(num));
        input.close();

    }
}
