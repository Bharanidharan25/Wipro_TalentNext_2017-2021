import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int s1 = scan.nextInt();
        scan.close();
        if(s1%2==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
     }
}