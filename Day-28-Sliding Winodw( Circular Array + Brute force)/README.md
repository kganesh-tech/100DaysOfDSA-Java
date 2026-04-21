// Problem: Defuse the bomb
// Pattern : Sliding Window(Circular array + Brute Force)

// Problem Summary:
  - If k > 0 - replaces each elements with sum of next k elements.
  - If k < 0 - replace each elements with sum of previous k elements.
  - If k == 0 - return all zeroes.

//Approach:
 1. Create result array of size n
 2. For each index i:
    - initialize sum = 0;
 3. If k > 0:
    - Add next k elements using:
          ( i + j) % n.
4. If k < 0:
    - add previous K elements using:
          ( i - j + n) % n.
5. Store result in res[i].


//  Complexity:
  - Time Complexity: 0(n * k).
  - Space Complexity : 0(n).
