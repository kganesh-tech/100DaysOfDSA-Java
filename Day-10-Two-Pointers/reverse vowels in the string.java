//Problem: reverse a vowels in the string
//Pattern: Two Pointers
//Time Complexity: 0(n)
//Space Complexity: 0(1)

import java.util.*;

public class ReverseVowels {
    public static boolean isVowel (char c) {
        c = Character.toLowerCase(c);
         return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
    public static String reverseVowels(String s) {
        
        char[] arr = s.toCharArray();
        
        int left =0;
        int right =arr.length - 1;
        
        while (left < right) {
            
            while(left < right && ! isVowel(arr[left])) {
                 left++; 
            }
            while(left < right && ! isVowel(arr[right])) {
                right--;
            }
            
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
        return new String(arr);
    }
    
    public static void main(String[] arr) {
        String s = "hello";
        
        String result = reverseVowels(s);
        System.out.println(result);
    }
}
