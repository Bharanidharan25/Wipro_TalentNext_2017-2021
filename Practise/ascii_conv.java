import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        };
        scan.close();
        for(int item: a){
            System.out.print(Character.toString ((char) item)+' ');
        }
     }
         
}