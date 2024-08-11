 
import java.util.Scanner;

 //This class extends Exception, meaning it's a checked exception.
//It has a constructor that accepts a message and passes it to the superclass constructor.
 class NoMatchException extends Exception{    
    NoMatchException(String msg)                    //constructor
        {
            super(msg);
        }  
}

public class Exception_Handel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        
        try {
            checkString(s);                 //if true i.e if equal
            System.out.println("The string matches 'India'.");
            } 
        catch (NoMatchException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    public static void checkString(String s) throws NoMatchException {
        if (!"India".equals(s)) {
            throw new NoMatchException("NoMatchException: The string does not match 'India'.");
        }
    }
}

