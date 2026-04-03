//Problem: 4Sum
//Pattern: Two Pointers

**Approach:**
- Sort the array
- Fix first element (i)
- Fix second element (j)
- Use left and right pointers
- Skip duplicates

Key Insight:
Reduce the problem to 2Sum using two pointers

//Time Complexity: O(n^3)
//Space Complexity: O(1)

  import java.util.*;

class Solution {
    public List<List<Integer>> fourSum (int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        
        
         Arrays.sort(nums);
         int n = nums.length;
         
         for ( int i = 0; i < n-3; i++) {
             for(int j = i + 1; j < n-2; j++) {
                 
                 int left = j + 1;
                 int right = n - 1;
                 
                 while(left <  right) {
                     int sum = nums[i] + nums[j] + nums[left] + nums[right];
                     if ( sum == target) {
                         result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                         left++;
                         right--;
                     }
                     else if( sum <= target) {
                         left++;
                         
                     }else {
                         right--;
                     }
                 }
             }
         }
         return result;
        
    }
    public static void main (String[] args) {
        Solution obj = new Solution();
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 1;
        
        List<List<Integer>> result = obj.fourSum(nums, target);
        
        System.out.println(result);
    }
    
    
    
    
    
    
    
}
