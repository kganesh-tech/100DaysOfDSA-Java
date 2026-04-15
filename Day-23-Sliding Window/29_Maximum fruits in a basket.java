 // Problem: Maximum fruits in a basket

//Approach:

- Problem reduces to finding the longest subarray with at most 2 distinct elements

// Method:

- Use Sliding Window + HashMap
- Expand window using "right"
- Store fruit counts in map
- If "map.size() > 2", shrink window from "left"
- Update maximum length at each step

// Key Idea:

«Expand → If invalid (>2 types) → Shrink → Update max length»

// Time Complexity:

- Time Complexity: O(n)
- Space Complexity: O(1)

  import java.util.*;

class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map= new HashMap<>();
        
        int left = 0;
        int maxLen = 0;
        
        for(int right =0; right< fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right],0) + 1);
            
            while(map.size() > 2) {
                int leftFruit = fruits[left];
                
                map.put(leftFruit, map.get(leftFruit) - 1);
                
                if(map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }
                left++;
            }
            maxLen = Math.max(maxLen , right - left + 1);
            
            
        }
        return maxLen;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] fruits= { 1, 2, 1, 2, 3};
        
        int result = sol.totalFruit(fruits);
        
        System.out.println("Maximum fruits collected: " + result);
    }
}
