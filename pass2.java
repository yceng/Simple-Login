
package Assignment;

/**
 * Part A Question 1
 * 
 * This program is to get user input email and password to check whether the password is true or not.
 * The rule for checking password is password must have at least 10 characters, consists only letters and digits, must contain 2 digits.
 * Only the last two digits of the password are displayed.
 * *author  Yi Ching
 * *version 1.8.0_111
 */
import java.util.Scanner;
public class pass2 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your email: ");// ask user email
        final String email=input.next();
        
        System.out.print("Enter your password: ");// ask user password
        String pass=input.next();
        
        if(lengthPass(pass)){
            System.out.println("\n"+email+" is a valid address! ");
            displayTrue(pass); // call function
        }
        else{
            System.out.println("\n"+email+" is a valid address! ");
            displayFalse(pass);// call function
        }
    }
    
    public static boolean lengthPass(String password){ //use for return true and false value
    boolean aa=letter(password)&&digit(password); // both same value
        if(password.length()>=10)// mesuare password length
        {
            if(aa)
                return true;
        }
        else
        {
            System.out.println("Your password need at least 10 characters!");
        }
        return false;
     }
    
    public static boolean letter(String password){ //use for set password condition-consists only letters
            boolean letter=false;// initial value is false
     
            for(int i=0;i<password.length();i++){ // check password one by one
                char xx=password.charAt(i);// convert password(String) into char
                
                if(Character.isLetter(xx))// check the character is letter or not
                    return true;// have letter return true
            }
            return false;
    }
    
    public static boolean digit(String pp){ //use for set password condition-consists only digits
            boolean digit=false;// initial all is false
            int digitcount=0; // use to count how many digit in the password
            for(int i=0;i<pp.length();i++){ // check password one by one
                char xx=pp.charAt(i);// convert password(String) into char
                if(Character.isDigit(xx))// check the character is digit or not
                {
                    digitcount++; //track how many digit
                 }
                if(digitcount>=2)
                        return true; // return true
            }
            return false;
    }

    public static void displayTrue(String newP){ //Only the last two digits of the password are displayed
        String lastTwo=null;// object can be null // use for display last 2 characters password
        String symbol=""; // use for display password in front of last 2 characters in symbol form
        int max=0;// initial the max length of password
       
            lastTwo=newP.substring(newP.length()-2); // pick last 2 characters
            if(newP.length()>max) // determine if the length of password from user bigger than initial value
            {
                max=newP.length();// newP.length() become max value
                symbol=newP.substring(0,max-2); // look for characters in front of the last two characters
                for(int j=0;j<symbol.length();j++) 
                {
                    System.out.print("*"); //replace with * 
                }
            }
            System.out.println(lastTwo+" is a valid password~");
    }
    
    public static void displayFalse(String newP){ //Only the last two digits of the password are displayed
        String lastTwo=null;// object can be null // use for display last 2 characters password
        String symbol=""; // use for display password in front of last 2 characters in symbol form
        int max=0;// initial the max length of password
       
            lastTwo=newP.substring(newP.length()-2);
            if(newP.length()>max)
            {
                max=newP.length();
                symbol=newP.substring(0,max-2);
                for(int j=0;j<symbol.length();j++)
                {
                    System.out.print("*");
                }
            }
            System.out.println(lastTwo+" is not valid password~"); // different printing statement
    }
}