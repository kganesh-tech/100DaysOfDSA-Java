 // Problem: Subarray Product Less Than K
// Pattern : Sliding Window

//Approach:
- Use Sliding Window with two pointers ("left", "right")
- Maintain a variable "product" for current window

// Steps:

1. Initialize:
   
   - "left = 0"
   - "product = 1"
   - "count = 0"

2. Expand window:
   
   - Multiply "nums[right]" into "product"

3. If "product >= k":
   
   - Shrink window from left
   - Divide "nums[left]" from product
   - Move "left++"

4. Count subarrays:
   
   - Add "(right - left + 1)" to count

5. Repeat for all "right"

---

// Complexity:

- Time Complexity: O(n)
- Space Complexity: O(1)

---

// Key Idea:

Maintain product < k and count all valid subarrays ending at each index

  import java.util.*;

public class Main {
    public static int numSubarrayProductLessThanK(int[] arr, int k) {
        
        if (k <= 1) return 0;
        
        int left = 0;
        int product =1;
        int count = 0;
        
        for(int right =0; right < arr.length; right++) {
            
            product*= arr[right];
            
            while (product >=k) {
                product /= arr[left];
                left++;
            }
            
            count += (right - left + 1);
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 6};
        int k = 100;
        
        int result = numSubarrayProductLessThanK(arr, k);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("K: " + k);
        System.out.println("Number of subarrays: " + result);
    }
    
}
