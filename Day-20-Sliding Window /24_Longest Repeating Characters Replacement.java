
// Problem: Longest Repeating Character Replacement

// Approach:
- Use sliding window with two pointers
- Maintain frequency array for characters
- Track max frequency character in current window
- If (window size - maxFreq > k), shrink window
- Update maximum window size

// Time Complexity: O(n)
// Space Complexity: O(1)


  import java.util.*;

class Solution {
    public  int CharacterReplacement (String s, int k) {
        
        int left = 0;
        int maxLength = 0;
        int maxFreq = 0;
        
        int[] freq = new int[26];
        
        for (int right =0; right < s.length(); right++) {
            char ch = s.charAt(right);
            
            freq[ch - 'A']++;
            
            maxFreq = Math.max(maxFreq , freq[ch - 'A']);
            
            if((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            
            maxLength = Math.max(maxLength , right - left + 1);
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        Solution obj = new Solution();
        
        String s = "AABABBA";
        int k = 1;
        
        int result = obj.CharacterReplacement(s, k);
        System.out.println(result);
    }
}
