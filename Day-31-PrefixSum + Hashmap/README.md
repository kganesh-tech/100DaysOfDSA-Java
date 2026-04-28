//Problem : Binary Subarrays With Sum
// Pattern : Prefixsum + hashmap

// Approach: Binary Subarrays With Sum
 Core Idea:

We need to count subarrays whose sum = goal.

- Method (Prefix Sum Logic)
Keep a running prefix sum while traversing the array.
At any index:
Let current sum = S

We want:

subarray sum = goal

which means:

S - previousSum = goal
⇒ previousSum = S - goal
So, for every element:
Check how many times (S - goal) has already appeared
Add that count to answer
Store frequency of prefix sums using a map
 Why it Works

Instead of checking all subarrays (which is slow), we:

Use past information (prefix sums)
Instantly know how many valid subarrays end at current index
 Steps Summary
Initialize:
sum = 0
answer = 0
map with {0 → 1} (important base case)
Traverse array:
Update sum
Check (sum - goal) in map
Add its frequency to answer
Store current sum in map
 Special Note (Binary Array Trick)

Since array has only 0s and 1s, you can also use:

count(goal) = atMost(goal) - atMost(goal - 1)

(using sliding window)

// Complexity
-Time: O(n)
-Space: O(n)
