import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class SortComparator implements Comparator<Integer> { 
    private final Map<Integer, Integer> freqMap; 
    SortComparator(Map<Integer, Integer> tFreqMap) 
    { 
        this.freqMap = tFreqMap; 
    } 
    @Override
    public int compare(Integer k1, Integer k2) 
    { 
        int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1));  
        if (freqCompare != 0){
            return freqCompare; 
        }
        return 0;
    } 
} 

public class Solution {    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++){
            arr[i]=scan.nextInt();
        }
        scan.close();
        Map<Integer, Integer> map = new HashMap<>(); 
        List<Integer> outputArray = new ArrayList<>(); 
  
        for (int current : arr) { 
            int count = map.getOrDefault(current, 0); 
            map.put(current, count + 1); 
            outputArray.add(current); 
        } 
  
        SortComparator comp = new SortComparator(map); 
        Collections.sort(outputArray, comp); 
  
         List<Integer> result = new ArrayList<>();
        for (Integer i : outputArray) { 
            if(result.indexOf(i)<0){
                result.add(i); 
            }
        }
        for (Integer i : result) { 
            System.out.print(i+" ");
        } 
        
    }
}