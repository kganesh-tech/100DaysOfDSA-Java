
// Problem: 3Sum
// Pattern: Two Pointers

// Approach:
- Sort the array
- Fix one element (i)
- Use two pointers (left = i+1, right = end)
- Calculate sum = nums[i] + nums[left] + nums[right]
- If sum == 0 → add to result and skip duplicates
- If sum < 0 → move left++
- If sum > 0 → move right--

Key Insight:
Fix one element and reduce the problem to Two Sum using two pointers

// Time Complexity: O(n^2)
// Space Complexity: O(1) 


  import java.util.*;

public class ThreeSum {

    public static void threeSum(int[] nums) {

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 3) {
                    System.out.println(nums[i] + " " + nums[left] + " " + nums[right]);
                    left++;
                    right--;
                }
                else if(sum < 3) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4};

        threeSum(nums);
    }
}


