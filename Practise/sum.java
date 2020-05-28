import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        scan.close();
        int sum = s1+s2;
        System.out.print("The sum is "+sum);
        
     }
}