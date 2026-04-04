
// Problem: Boats to Save People
// Pattern: Two Pointers + Greedy

//Approach:
- Sort the people array in ascending order
- Initialize two pointers:
  left = 0 (lightest person)
  right = n - 1 (heaviest person)
- Initialize boats = 0

- While left <= right:
    - If people[left] + people[right] <= limit:
        - Pair both people → move left++
    - Always move right-- (heaviest person is used)
    - Increment boats++

- Return boats

// Key Insight:
Always try to pair the heaviest person with the lightest possible person to minimize boats.

// Time Complexity:
O(n log n)

// Space Complexity:
O(1) 

import java.util.*;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            boats++;
        }

        return boats;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] people = {3, 2, 2, 1};
        int limit = 3;

        int result = sol.numRescueBoats(people, limit);

        System.out.println("Minimum boats required: " + result);
    }
}
 
