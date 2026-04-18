// Problem: Count Number of Nice Subarrays
// Pattern : Sliding Window

//Approach:
1. we need to find subarrays with exactly k odd numbers.
2. Direct counting of exactly k is difficult using sliding window, so we use this trick:
     exactly(k) = atMost(k) - atMost(k - 1)
3. Now focus on building atMost(k):

   - Use sliding window with two pointers: left and right
   - Maintain:
       countOdd → number of odd elements in current window
       result → total subarrays count

4. Traverse with right pointer:

   For each element:
   - If it is odd → increment countOdd

5. If countOdd > k:
   - Move left pointer forward
   - If removed element is odd → decrement countOdd
   - Continue until countOdd ≤ k

6. When window is valid (countOdd ≤ k):
   - Add all subarrays ending at right:
     
     result += (right - left + 1)

7. This gives total subarrays with at most k odd numbers.

8. Final answer:
   
   answer = atMost(k) - atMost(k - 1)

Time Complexity: O(n)
Space Complexity: O(1)


  import java.util.*;
public class NiceSubarrays {
  public static int numberOfSubarrays(int[] nums, int k) {
      return atMost(nums, k) - atMost(nums, k - 1);
  }

  private static int atMost(int[] nums, int k) {
    int left = 0;
    int countOdd = 0;
    int result = 0;
 
    for ( int right = 0; right < nums.length; right++) {

      if(nums[right] % 2 == 1)  {
        count odd++;
      }
       while ( countOdd > k) {
         if (nums[left] % 2 == 1) {
           countOdd--;
         }
         left++;
       }

    result += (right - left + 1);
    }
    return result;
  }

public static void main(String[] args) {
  int[] nums = { 1, 1, 2, 1, 1};
  int k = 3;

  int ans = numberOfSubArrays(nums, k);

  System.out.println("Output: " + ans);
}
}
