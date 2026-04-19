Problem: Count the Sum of the Subarrays = K

Pattern: PrefixSum + HashMap

Approach:
1. Initialize:
   - sum = 0;
   - count =0;
   - HashMap<Integer, Integer> new HashMap<> ()
   - put (0,1) in map to handle subarrays starting from index 0;
 2. Traverse the array:
     For each element:
    - add element to sum
   
    - Check if ( sum - k) exists in map:
    - -If yes, add its frequency to count
    - Store current sum in map:
       map.put(sum, map.getOrDefault(sum, 0) + 1)

      3. Return count

         Key idea:
         If (sum - k) exists, then a subarray with sum = k is found.

        //Complexity:

      Time Complexity: 0(n)
      Space Complexity: 0(1)
         
