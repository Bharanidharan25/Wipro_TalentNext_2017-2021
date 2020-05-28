import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0;i<5;i++){
            a[i] = scan.nextInt();
        };
        scan.close();
        int sum = 0;
        int avg = 0;
        for(int i=0;i<5;i++){
            sum+=a[i];
        };
        avg=sum/5;
        System.out.println(sum);
        System.out.println(avg);
 
     }
         
}