//Problem : Permutation in a Strinng
//Pattern: Sliding Window + Frequency Array
//Approach:
Use frequency arrays for s1 and current window
Window size = length of s1
Initialize first window in s2
Compare both frequency arrays
Slide window:
Add new character
Remove old character
Compare again
If match found → return true
//Complexity:
// Time Complexity: O(n);
// Space Complexity: O(1).;

  import java.util.*;

class solution {
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        
        int[] freq1 = new int[26];
        int[] window = new int[26];
        
        for(char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }
        
        int k = s1.length();
        
        for (int i = 0; i < k; i++) {
            window[s2.charAt(i) - 'a']++;
        }
        
        if (Arrays.equals(freq1, window))
        return true;
        
        for (int i = k; i < s2.length(); i++) {
            
            window[s2.charAt(i) - 'a']++;
            
            window[s2.charAt(i - k) - 'a']--;
            
            if (Arrays.equals(freq1, window)) return true;
        }
        return false;
}
public static void main(String[] args) {
    String s1 = "ab";
    String s2 = "eidbaooo";
    
    boolean result = checkInclusion(s1, s2);
    System.out.println("Does s2 contain a permutation of s1? " + result);
}
}
