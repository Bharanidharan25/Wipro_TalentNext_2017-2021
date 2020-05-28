import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        scan.close();
        System.out.print(s1+" technologies "+s2);
        
     }
}