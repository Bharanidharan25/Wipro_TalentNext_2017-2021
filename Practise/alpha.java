import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        char input_char = scan.next().charAt(0);
        scan.close();
        if ((input_char >= 65 && input_char <= 90) 
            || (input_char >= 97 && input_char <= 122)) 
            System.out.println(" Alphabet "); 

        else if (input_char >= 48 && input_char <= 57) 
            System.out.println(" Digit "); 

        else
            System.out.println(" Special Character "); 
    } 
 
}