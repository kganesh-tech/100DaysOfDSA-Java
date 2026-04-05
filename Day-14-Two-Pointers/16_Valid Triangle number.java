// Problem: Valid Triangle Number
// Pattern: Two Pointers

// Approach:
- First, sort the array in non-decreasing order
- Fix one element as the largest side of the triangle (k from end)
- Use two pointers:
  - i at the start
  - j just before k
- Check if nums[i] + nums[j] > nums[k]
  - If true, then all elements between i and j can form valid triangles with nums[j] and nums[k]
  - Add (j - i) to the count and move j--
  - If false, move i++ to increase the sum
- Repeat until all triplets are checked

// Key Insight:
After sorting, we only need to check if the sum of two smaller sides is greater than the largest side. Using two pointers allows counting multiple valid pairs at once, reducing time complexity to O(n²)
  
  // Time Complexity - 0(n2)
  // Space Complexity - 0(1)

  
import java.util.*;

class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;

        for (int k = n - 1; k >= 2; k--) {
            int i = 0;
            int j = k - 1;

            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    count += (j - i);
                    j--;
                } else {
                    i++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {2, 2, 3, 4};

        int result = sol.triangleNumber(nums);
        System.out.println("Output: " + result);
    }
}
