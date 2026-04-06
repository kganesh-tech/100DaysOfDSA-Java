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
public class Main {
    public static int maxSubarray(int[] arr, int k) {
        int windowSum = 0;
        int maxSum = 0;
        
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
            
        }
        
        maxSum = windowSum;
        
        for (int i = k; i< arr.length; i++) {
            windowSum += arr[i];
            
            windowSum -= arr[i - k];
            
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
    
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        
        int result = maxSubarray(arr, k);
        
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
}
