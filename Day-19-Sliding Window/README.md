#  Sliding Window Problems (Day 1)

This repository contains solutions to important Sliding Window problems.

---

##  Problems Covered

---

###  1. Maximum Number of Vowels in a Substring of Given Length

- Pattern: Sliding Window (Fixed Size)

####  Approach
- Use a window of size k
- Count vowels in the first window
- Slide the window:
  - Add next character → if vowel, increase count
  - Remove previous character → if vowel, decrease count
- Track the maximum count

####  Complexity
- Time: O(n)  
- Space: O(1)

---

###  2. Permutation in String

- Pattern: Sliding Window + Frequency Array

####  Approach
- Use two frequency arrays:
  - One for s1
  - One for current window in s2
- Window size = length of s1
- Initialize first window
- Compare both frequency arrays
- Slide the window:
  - Add new character
  - Remove old character
  - Compare again
- If match found → return true

####  Complexity
- Time: O(n)  
- Space: O(1)

---

##  Key Learnings

- Sliding Window technique
- Fixed size window concept
- Frequency array usage
- Avoiding brute force

---

##  Progress

- Day 19 Completed  
- More problems coming soon...
