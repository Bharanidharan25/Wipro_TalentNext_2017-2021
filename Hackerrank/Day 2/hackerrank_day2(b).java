import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        scan.close();

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int length = s1.length() < s2.length() ? s1.length() : s2.length();
        String result = "";

        for(int i=0;i<length;i++){
            if(result.indexOf(s1.charAt(i))<0) result+=s1.charAt(i);
            if(result.indexOf(s2.charAt(i))<0) result+=s2.charAt(i);
        }

        if(s1.length() > length){
            for (int i=length; i<s1.length(); i++){
                if(result.indexOf(s1.charAt(i))<0) result+=s1.charAt(i);
            }
        }else{
            for (int i=length; i<s1.length(); i++){
                if(result.indexOf(s2.charAt(i))<0) result+=s2.charAt(i);
            }
        }

        char tempArray[] = result.toCharArray();
        Arrays.sort(tempArray);
        result = new String(tempArray);

        System.out.println(result);
    }
}