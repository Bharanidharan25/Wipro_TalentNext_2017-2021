import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        };
        int numToFind = scan.nextInt();
        scan.close();
        for(int i=0; i<n; i++){
            if(a[i] == numToFind){
                System.out.println(i);
                break;
            }else if(i == n-1){
                System.out.println(-1);
            }
        }
     }
         
}