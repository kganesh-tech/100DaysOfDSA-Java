// Problem : Trapping Rain Water.
// Pattern : Two-Pointers.

//Approach:

-Use two pointers ( left , right) starting from both the ends.
- Maintain 'leftMax' and 'rightMax' to store the maximum height seen so far.
-  Compare 'height[left]' and 'height[right].
-   If left is smaller - process left side.
-   ELse - process right side.

-   If current height is less than max, add trapped water.
-   Move pointers accordingly until 'left < right'.
   
//Time Complexity: 0(n);
// Space Complexity : 0(1);
