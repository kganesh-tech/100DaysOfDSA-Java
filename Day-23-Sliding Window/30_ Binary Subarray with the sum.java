// Problem: Binary Subarray With Sum 

//Approach:

-Problem: Count number of subarrays with sum = goal

// Method:

- Use Prefix Sum + HashMap
- Keep a running sum ("sum")
- Store frequency of each prefix sum in map

// Key Idea:

- If "(sum - goal)" exists in map,
  → it means a subarray with required sum is found
- Add its frequency to the result

// Steps:

1. Initialize map with "{0:1}"
2. Traverse array and keep adding to "sum"
3. Check if "(sum - goal)" exists in map
4. Add its count to result
5. Update map with current sum

Time Complexity:

- Time Complexity: O(n)
- Space Complexity: O(n)

// Summary:

«Prefix Sum → Check (sum - goal) → Count subarrays»

  import java.util.*;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map< Integer, Integer> map = new HashMap<> ();
        
        map.put(0, 1);
        
        int count = 0;
        int sum = 0;
        
        for (int num : nums) {
            sum += num;
            
            if(map.containsKey(sum - goal)) {
                count+= map.get(sum - goal); 
                    
                }
            
            
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            
        }
        
        return count;
        
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;
        
        int result = sol.numSubarraysWithSum(nums,goal);
        
        System.out.println("Number of subarrays: " + result);
    }
}
