//Problem: Count the Sum OfSubarrays =K
// Pattern : Prefix Sum + HashMap

//Approach:
1. Initialize:
- sum = 0
- count = 0
- HashMap<Integer, Integer> map
- Put (0, 1) in map to handle subarrays starting from index 0

  2. Traverse the array:
For each elements:
- Add element to sum

  -Check if(sum - k) exists in map:
   - If yes, add its frequency to count
   - Store current sum in map:
       map.put(sum, map.getOrDefault(sum, 0) + 1)
  3. Return count

  Key Idea:
  If (sum - k) exists, then a subarray with sum = k is found.

  // Complexity:
    - Time Complexity : o(n)
    - Space Complexity : 0(1)

  code:

import java.util.*;

public class Main {
  public static int CountOfSubarrays (int[] nums. int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    int sum = 0;
    int count = 0;

  map.put(0, 1);

  for(int num : nums) {
    sum += num;

    if(map.containsKey(sum - k)) {
      count+= map.get(sum - k);
    }

      map.put(sum, map.getOrDefault(sum, 0) + 1);
  } 

    return count;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 1, 1};
    int k = 2;

  System.out.println(CountOfSubarrays(sum, k));
  }
}
