import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int s1 = scan.nextInt();
        scan.close();
        if(s1 == 0){
            System.out.println("number is zero");
        }else if(s1<0){
            System.out.println("number is negative");
        }else{
            System.out.println("number is positive");
        }
     }
}