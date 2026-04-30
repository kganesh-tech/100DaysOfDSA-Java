// Problem: 

Given an array nums and two integers l and r, find the minimum possible sum of any contiguous subarray such that:

Subarray length is between l and r (inclusive)
Subarray sum is strictly greater than 0
Among all valid subarrays, return the smallest positive sum
If no such subarray exists, return -1

// Pattern:
Brute force subarray generation
Nested loop over start and end indices
Running sum maintenance (prefix-style accumulation)
Filtering based on constraints (length + condition check)

// Approach:
Iterate over every possible starting index start
For each start, expand the subarray by moving end from start to n-1
Maintain a running sum as elements are added
For each (start, end):
Compute subarray length = end - start + 1
Check if length is within [l, r]
Check if sum > 0
If valid, update answer with minimum sum
After checking all subarrays, return result or -1 if none found

// Key Idea:

Generate all contiguous subarrays efficiently using a running sum, but only consider those that satisfy the length constraint [l, r] and have a positive sum, while tracking the minimum.

// Time Complexity:
//Time Complexity: O(n²)

Space Complexity: O(1)
(Only variables used, no extra data structures)
