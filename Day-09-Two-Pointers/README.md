**Problem:**
1) MergeSorted Array

Given two sorted arrays nums1 and nums2, merge them into nums1 as one sorted array.
nums1 has enough space at the end to hold all elements.

**My Approach:**
I used the two pointer approach, but instead of starting from the front, I started from the end.
Why from end?
Because if we start from front, elements in nums1 may get overwritten.
So:
i → last element of nums1 (m - 1)
j → last element of nums2 (n - 1)
k → last position of nums1 (m + n - 1)
Then I compare and place the bigger element at position k.

**Time Complexity:** - 0(m + n)
**Space Complexity:** - 0(1)

**Problem:**

2) remove elements with the value
  - Given an array nums and a value val, remove all occurrences of val in-place and return the new length.

**My Approach:**
I used two pointers:
One pointer j to go through the array
One pointer i to store valid elements
If nums[j] is not equal to val, I put it at index i and increase i.

**Time Complexity:** - 0(n)
**Space Complexity:** - 0(1)

    
