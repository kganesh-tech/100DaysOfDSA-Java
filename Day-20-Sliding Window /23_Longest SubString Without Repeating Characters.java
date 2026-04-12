
// Problem: Longest Substring Without Repeating Characters

// Approach:
- Use sliding window with two pointers (left, right)
- Use HashSet to store unique characters
- Expand window using right pointer
- If duplicate found, shrink window from left until valid
- Track maximum length of valid window

// Time Complexity: O(n)
// Space Complexity: O(1)


  import java.util.*;

class Solution {
    public int lengthofLongestSubString (String s) {
        int left = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        
        for(int right = 0; right < s.length(); right++) {
            
            char ch = s.charAt(right);
            
            while(set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            
            set.add(ch);
            
            maxLength = Math.max(maxLength , right - left + 1);
            
        }
        
        return maxLength;
    }
    
    public static void main (String[] args) {
        Solution obj =new Solution();
        String s = "pwwkew";
        
        int result = obj.lengthofLongestSubString(s);
        
        System.out.println(result);
        
    }
}
