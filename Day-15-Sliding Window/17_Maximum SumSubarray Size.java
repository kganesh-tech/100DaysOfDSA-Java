// Problem: Maximum Sum Subarray of Size K
// Pattern: Sliding Window (Fixed Size)

// Approach:
- First, calculate the sum of the first k elements (initial window).
- Store this as the current maximum sum.
- Then slide the window one element at a time:
  - Add the next element to the window.
  - Remove the element that goes out of the window.
- Update the maximum sum at each step.

// Key Insight:
Instead of recalculating the sum for every subarray, we reuse the previous window sum by adding the next element and removing the previous element. This reduces time complexity to O(n).

// Time Complexity: O(n)
// Space Complexity: O(1)

  import java.util.*;
public class ContainerWithMostWater {
    public static int maxArea (int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        
        while (left < right) {
            int width = right - left;
            int h = Math.min (height[left] , height[right]); 
            int area = width * h;
            
            maxArea = Math.max(maxArea , area);
            
            
            if(height[left] < height[right]) {
                left++;
                
            } else {
                right--;
            }
            
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = { 1,8,6,2,5,4,8,3,7};
        int result = maxArea(height);
        System.out.println ("ContainerWithMostWater: " + result);
    }
}
