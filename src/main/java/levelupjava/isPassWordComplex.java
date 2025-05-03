package levelupjava;

import java.util.Scanner;

public class isPassWordComplex {

    public static boolean isPasswordComplex(String password){
        if(password.length() <6) {
            System.out.println("Password doesnt match length");
            return false;
        }
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasNumber = false;
        for (int i=0;i<password.length()|| !hasLowerCase && !hasUpperCase && !hasNumber;i++){
            char current = password.charAt(i);
            if(Character.isDigit(current))
            {
                hasNumber=true;
            }
            else if (Character.isUpperCase(current)) {
                hasUpperCase=true;
            }
            else  if( Character.isLowerCase(current)){
                hasLowerCase = true;
            }
        }
        if(!hasNumber){
            System.out.println("Password has no number");
        }
        if(!hasUpperCase){
            System.out.println("Password has no uppercase");
        }
        if(!hasLowerCase){
            System.out.println("Password has no lowercase");
        }
        return hasNumber&&hasLowerCase&&hasUpperCase;
    }
    public static void main(String[] args){
        System.out.println("Enter the password");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        System.out.println("Is password " + password+ " complex??") ;
        System.out.println("Is password complex: " + isPasswordComplex(password));
    }

}
