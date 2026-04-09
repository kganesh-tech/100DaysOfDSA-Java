// Problem: Find All Anagrams in a String
// Pattern: Sliding Window
// Approach:
Create a frequency array of size 26 for string p.
Store the count of each character in p.
Initialize:
left = 0
right = 0
required = p.length()
Traverse string s using right pointer:
Decrease frequency of current character.
If character is useful (count[ch] >= 0), decrease required.
If required == 0, add left to result.
If window size equals p.length():
Check character at left:
If its count is >= 0, increase required.
Restore its frequency.
Move left forward.
Continue until end of string.

  // Complexity:
// Time Complexity: O(n)
// Space Complexity: O(1)

  import java.util.*;
   
   class Solution {
       public List<Integer> findAnagrams(String s, String p) {
           
           List<Integer> result = new ArrayList<>();
           
           if (s.length() < p.length()) return result;
           
           int[] freqP = new int[26];
           int[] windowFreq = new int[26];
           
           for (int i = 0; i < p.length(); i++) {
               char c = p.charAt(i);
               freqP[ c - 'a']++;
           }
           
           int k = p.length();
           
           for(int i = 0; i < k; i++) {
               char c = s.charAt(i);
               windowFreq[ c -'a']++;
           }
           
           if (Arrays.equals(freqP, windowFreq)) {
               result.add(0);
           }
           
           for (int i = k; i < s.length(); i++) {
               
               char add = s.charAt(i);
               windowFreq[add -'a']++;
               
               char remove = s.charAt(i - k);
               windowFreq[remove - 'a']--;
               
               if (Arrays.equals(freqP, windowFreq)) {
                   result.add(i - k + 1);
               }
           }
              return result;
           }
       }
       
       public class Main {
           public static void main(String[] args) {
               Solution sol = new Solution();
               
               String s = "cbaebabacd";
               String p = "abc";
               
               List<Integer> result = sol.findAnagrams(s,p);
               System.out.println(result);
           }
       }
   
