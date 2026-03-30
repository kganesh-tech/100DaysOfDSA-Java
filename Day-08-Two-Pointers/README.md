# Day-08: Two Pointers Pattern

## Problems Solved

### 1. Remove Duplicates from Sorted Array
- **Difficulty:** Easy  
- **Pattern:** Two Pointers  
- **Problem:** Given a sorted array, remove duplicates in-place so that each number appears only once. Return the length of the updated array.  

- **My Approach:**  
  1. I kept one pointer (`i`) at the position of the last unique number.  
  2. Another pointer (`j`) moves forward to check every element.  
  3. If `nums[j]` is different from `nums[i]`, I move `i` forward and copy `nums[j]` there.  

- **Complexity:**  
  - Time: O(n)  
  - Space: O(1)  

- **Example:**  
  ```text
  Input: [1,1,2]
  Output: [1,2]

  ### 2. Move Zeroes to the End
- **Difficulty:** Easy
- **Pattern:** Two Pointers
- **Problem:** Move all zeros in the array to the end without changing the order of non-zero elements.

  
-**My Approach:**
I used a pointer lastNonZeroFoundAt to track where the next non-zero should go.
Went through the array with another pointer current.
Every time I found a non-zero, I swapped it with nums[lastNonZeroFoundAt] and moved lastNonZeroFoundAt forward.

-**Complexity:**
Time: O(n)
Space: O(1)

-**Example:**
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
