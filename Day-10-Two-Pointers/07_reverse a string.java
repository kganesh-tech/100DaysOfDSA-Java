//problem: reverse a string
//Pattern: Two Pointers
//Time Complexity: 0(n)
//Space Complexity: 0(1)

import java.util.*;

public class ReverseString {
    public static void reverseString (char[] s) {
        int left =0;
        int right = s.length - 1;
        
        while (left < right) {
            
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        
        
        left++;
        right--;
    }
}

public static void main(String[] args) {
    char[] s = { 'h', 'e', 'l', 'l', '0'};
    reverseString(s);
    System.out.println(Arrays.toString(s));
}
}
