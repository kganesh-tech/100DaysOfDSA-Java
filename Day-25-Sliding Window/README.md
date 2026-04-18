 // Problem : Counting  Numbers of Nice Subarrays
 //Pattern : Sliding Window

 //Appraoch:

 1. We need to find subarrays with exactlly k odd numbers.
 2. Direct counting of exactly k is difficult using slidiing window
     so we use this trick:

    exactly(k) = atMost(k) - atMost(k - 1)
3. Now focus on building atMost(k):
   - Use silding window with two pointers: left and right
   - Maintain: countOdd - number of odd elements in current window
   - result - total subarrays count 
4. Traverse with right pointers:

 For each element:
 - If it is odd - increment countOdd

5. If countOdd > k:
   -Move left pointer forward
   - If removed element is odd - decrement countOdd
   - Continue until countOdd <k

6. When window is valid (CountOdd < k):
 -add all subarrays ending at right:
   result += (right - left + 1)
7. This gives total subarrays with at most k odd numbers.
8. Final answer:
     answer = atMost(k) - atMost(k - 1)

// Complexity:

   // Time Complexity: 0(n)
  // Space Complexity: 0(1)
