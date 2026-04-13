//Problem:
Given a string s and an integer k, find the length of the longest substring that contains at most k distinct characters.

------------------------------------------------------------

// Intuition:
We need to find a substring where the number of unique characters is ≤ k and the length is maximum.

Instead of checking all substrings (which is inefficient), we use the Sliding Window technique to dynamically maintain a valid window.

------------------------------------------------------------

// Approach (Sliding Window):

1. Initialize:
   - Two pointers: left = 0
   - maxLength = 0
   - HashMap to store character frequencies

2. Traverse the string using right pointer:
   - Add the current character to the map
   - Update its frequency

3. Check validity:
   - If the number of distinct characters (map.size()) becomes greater than k:
     → The window is invalid

4. Shrink the window:
   - Move the left pointer forward
   - Decrease frequency of left character
   - If frequency becomes 0 → remove it from map
   - Continue until map.size() ≤ k

5. Update result:
   - At every valid window, update:
     maxLength = max(maxLength, right - left + 1)

------------------------------------------------------------

// Key Observations:
- The window size is dynamic (not fixed)
- HashMap helps track frequency and distinct characters
- We expand using right pointer and shrink using left pointer

------------------------------------------------------------

/ Time Complexity:
O(n) 
// Space Complexity:
O(k) 

------------------------------------------------------------

🔹 Summary:
Expand the window, fix it when it becomes invalid, and keep track of the maximum valid window size.


  import java.util.*;

class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int left = 0;
        int maxLength = 0;
        
        Map<Character, Integer> map = new HashMap<> ();
        
        for ( int right = 0; right < s.length() ; right++) {
            char ch = s.charAt(right);
            
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
            while (map.size() > k) {
                char leftChar = s.charAt(left);
                
                map.put(leftChar, map.get(leftChar) - 1);
                
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
    
    public static void main (String[] args) {
        Solution sol = new Solution();
        String s = "eceba";
        int k = 2;
        System.out.println(" Output 1: " + sol.lengthOfLongestSubstringKDistinct(s, k));
    }
}
