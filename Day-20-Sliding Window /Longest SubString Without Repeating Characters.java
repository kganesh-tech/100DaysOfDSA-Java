/*
Problem: Longest Substring Without Repeating Characters

Approach:
- Use sliding window with two pointers (left, right)
- Use HashSet to store unique characters
- Expand window using right pointer
- If duplicate found, shrink window from left until valid
- Track maximum length of valid window

Time Complexity: O(n)
Space Complexity: O(1)
*/
