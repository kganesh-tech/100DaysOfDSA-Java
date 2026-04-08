
// Problem: Average of Subarray of Size K
// Pattern: Sliding Window (Fixed Window)

// Approach:
- Use a sliding window of size k to calculate averages efficiently.
- Initialize two pointers: left = 0 and iterate right from 0 to n-1.
- Keep adding arr[right] to a running sum as the window expands.
- When window size becomes k (right - left + 1 == k):
    - Calculate the average as sum / k.
    - Store the result at index 'left' in the result array.
    - Before moving forward, subtract arr[left] from sum.
    - Increment left to slide the window.
- Continue until the end of the array.

// Key Insight:
- Instead of recalculating sum for every subarray, reuse the previous window sum.
- This reduces time complexity from O(n*k) to O(n).

// Time Complexity: O(n)
// Space Complexity: O(n - k + 1)

  import java.util.*;

class Solution {
    public double[] findAverages(int[] arr, int k){
        double[] result = new double[arr.length - k + 1];
        
        int left = 0;
        double sum = 0;
        
        for (int right = 0; right < arr.length; right++) {
            sum+= arr[right];
            
            if (right - left + 1 == k) {
                result[left] = sum / k;
                
                sum -= arr[left];
                left++;
            }
        }
        return result;
    }
    
    public static void main (String[] args) {
        Solution sol = new Solution();
        
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        
        double[] result = sol.findAverages(arr, k);
        
        System.out.println(Arrays.toString(result));
    }
}
