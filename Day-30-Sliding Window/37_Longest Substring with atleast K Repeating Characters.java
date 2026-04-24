// Problem Name : 
Longest Substring with At Least K Repeating Characters

// Pattern : 
Divide & Conquer

// Approach :  
- If the length of the substring is less than k, return 0  
- Count the frequency of each character in the current substring  
- Traverse the string and find any character whose frequency is less than k  
- Such a character cannot be part of the valid substring → use it as a split point  
- Recursively solve for:
  - Left substring (before the split point)  
  - Right substring (after skipping invalid characters)  
- Return the maximum of left and right results  
- If no invalid character is found, return the length of the substring  

// Complexity  
- Time Complexity: O(N log N) (Worst case: O(N²))  
- Space Complexity: O(log N) (Recursion stack)

class Solution {

    public int longestSubstring(String s, int k) {
        return helper(s, 0, s.length(), k);
    }

    private int helper(String s, int start, int end, int k) {

        // Base case
        if (end - start < k) return 0;

        // Frequency count
        int[] freq = new int[26];
        for (int i = start; i < end; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Find invalid character and split
        for (int i = start; i < end; i++) {
            if (freq[s.charAt(i) - 'a'] < k) {

                int j = i + 1;
                while (j < end && freq[s.charAt(j) - 'a'] < k) {
                    j++;
                }

                int left = helper(s, start, i, k);
                int right = helper(s, j, end, k);

                return Math.max(left, right);
            }
        }

        // All characters are valid
        return end - start;
    }
}
