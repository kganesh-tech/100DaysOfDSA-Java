// Problem: Longest Substring Without Repeating Characters  
// Pattern: Sliding Window  

// Approach:
- Use a HashSet to track characters in the current window
- Use two pointers (left and right)
- Expand window by moving right pointer
- If duplicate found, shrink window from left until duplicate is removed
- Keep updating the maximum length

// Key Insight:
Sliding window helps maintain a valid substring without recomputing from scratch.

// Time Complexity: O(n)  
// Space Complexity: O(n)import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            
           
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

        
            set.add(s.charAt(right));

            
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "abcabcbb";
        int result = obj.lengthOfLongestSubstring(s);
        System.out.println("Output: " + result);
    }
}
