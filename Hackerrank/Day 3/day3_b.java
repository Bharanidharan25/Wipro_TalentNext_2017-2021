import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        scan.close();
        String result1 = "";
        String result2 = "";
        for (int i=0; i<input.length(); i++){
            if (Character.isUpperCase(input.charAt(i))){
                result2+=input.charAt(i);
            }else{
                result1+=input.charAt(i);
            }
        }
        System.out.println(result1+result2);
    }
}