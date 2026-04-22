// Problem : Number OfArithmeticSlices
// Pattern : Dynamic Programming

//Approach :
1. First according to the problem we are going to check the difference between the 3 consecutive subarrays.
   - if (nums[i - 1] - nums[i] == nums[i - 2] - nums[i - 1] } {
         count ++;
2.  then :
    - We can extend previous arithmetic slices.
    - And also from one new slice.


// Algorithm Steps :

1. Inittialize :
    - count = 0 - numbers of slices ending at current index.
    -  total = 0 - final answer.
2. Traverse array from index 2 to n - 1:
   - If current elements form arithmetic.
      - Increment count.
      - Add count to total
    
      - Else:
         - Reset count = 0.
3. Return total.

// Complexity:
-Time Complexity : O(n).
- Space Complexity : O(1).
