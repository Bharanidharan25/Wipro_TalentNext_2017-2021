import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        s=s.toLowerCase();
        String result= "";
        if (s.indexOf('a') >=0) result+='a';
        if (s.indexOf('e') >=0) result+='e';
        if (s.indexOf('i') >=0) result+='i';
        if (s.indexOf('o') >=0) result+='o';
        if (s.indexOf('u') >=0) result+='u';
        result = result == "" ? "Thank You" : result;
        System.out.println(result);
    }
}

