//problem : Maximum number of vowels in a Substring of given Length
//Pattern: Sliding Window (Fixed Size)
//Approach:
Use a window of size k
Count vowels in the first window
Slide the window:
Add next character → if vowel, increase count
Remove previous character → if vowel, decrease count
Track maximum count
//Complexity:
Time Complexity: O(n);
Space Complexity: O(1);

import java.util.*;

class solution {
    public static int maxVowels(String s, int k) {
        int maxCount = 0;
        int count = 0;
        
        for(int i=0; i < k;i++) {
            if(isVowel(s.charAt(i))) {
                count++;
            }
        }
        
        maxCount = count;
        
        for (int i = k; i < s.length(); i++)  {
            if(isVowel(s.charAt(i))) {
                count++;
        }
        
        
            if (isVowel(s.charAt(i - k))) {
                count--;
            }
            
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
    
    public static  boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    public static void main (String[] args) {
        String s = "Ganesh";
        int k = 3;  
        
        int result = maxVowels(s, k);
        
        System.out.println("Maximum number of vowels in the substring of size" + k + " = " + result);
    }
}



