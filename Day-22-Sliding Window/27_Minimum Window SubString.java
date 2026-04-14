// Problem : Minimum Window Substring
// Pattern : Sliding Window

//Approach
- Use Sliding Window with two pointers ("left", "right")
- Store frequency of "t" in "mapT"
- Maintain a "windowMap" for current window
- Use:
  - "required" → unique characters in "t"
  - "formed" → characters matched with correct frequency

//Steps:

1. Expand window using "right" pointer
2. Add characters to "windowMap"
3. If frequency matches → increment "formed"
4. When "formed == required" (valid window):
   - Update minimum length
   - Shrink window using "left"
   - If frequency breaks → decrement "formed"
5. Repeat until end of string

// Complexity:

- Time: O(n)
- Space: O(k)

// Key Idea:

Expand → Make valid → Shrink → Get minimum

  import java.util.*;

public class Main {

    public static String minWindow(String s, String t) {

        if (s.length() == 0 || t.length() == 0) return "";

        Map<Character, Integer> mapT = new HashMap<>();
        for (char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        int required = mapT.size();
        int formed = 0;

        Map<Character, Integer> windowMap = new HashMap<>();

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);

            if (mapT.containsKey(ch) &&
                windowMap.get(ch).intValue() == mapT.get(ch).intValue()) {
                formed++;
            }

            while (formed == required) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);

                if (mapT.containsKey(leftChar) &&
                    windowMap.get(leftChar) < mapT.get(leftChar)) {
                    formed--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE 
               ? "" 
               : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        String result = minWindow(s, t);

        System.out.println("Input s: " + s);
        System.out.println("Input t: " + t);
        System.out.println("Minimum Window Substring: " + result);
    }
}


