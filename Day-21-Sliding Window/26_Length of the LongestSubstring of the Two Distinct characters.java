// Problem:
Given a string s, find the length of the longest substring that contains at most 2 distinct characters.

------------------------------------------------------------

// Intuition:
We need a substring where the number of unique characters is ≤ 2 and the length is maximum.

Instead of checking all substrings (which is inefficient), we use the Sliding Window technique.

------------------------------------------------------------

// Approach (Sliding Window):

1. Initialize:
   - Two pointers: left = 0
   - maxLength = 0
   - HashMap to store character frequencies

2. Traverse using right pointer:
   - Add the current character to the map
   - Update its frequency

3. Check validity:
   - If number of distinct characters (map.size()) > 2:
     → window becomes invalid

4. Shrink the window:
   - Move left pointer forward
   - Decrease frequency of left character
   - If frequency becomes 0 → remove it from map
   - Repeat until map.size() ≤ 2

5. Update result:
   - At every valid window:
     maxLength = max(maxLength, right - left + 1)

------------------------------------------------------------

// Key Observations:
- Window size is dynamic
- HashMap tracks both frequency and distinct count
- Right pointer expands, left pointer shrinks

------------------------------------------------------------

// Time Complexity:
O(n) 

// Space Complexity:
O(1)
------------------------------------------------------------

// Summary:
Maintain a sliding window that always contains at most 2 distinct characters and track the maximum length of such valid windows.


  class Solution {
    public int lengthOfLongestSubstringKDistinct(String s) {
        int left = 0;
        int maxLength = 0;
        
        Map<Character, Integer> map = new HashMap<> ();
        
        for ( int right = 0; right < s.length() ; right++) {
            char ch = s.charAt(right);
            
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
            while (map.size() > 2) {
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
       
        
        System.out.println(" Output 1: " + sol.lengthOfLongestSubstringKDistinct(s));
    }
}
