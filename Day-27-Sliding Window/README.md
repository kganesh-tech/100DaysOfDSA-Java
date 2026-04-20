// Problem : Find RepeatedDNA Sequences
//Pattern: Fixed Sliding Window + HashSet

//Approach:
1. Take k- 10(length of the DNA sequence)

2. Create two sets:
   -seen - used to store the sequences seen for the first time.
   -result - it helps to store the repeated Sequence characters in the form of the output.
3. Run a loop from i =0 to i <= s.length() - k
4. At each step:
   -Take substring from i to i + k - store in sub
5. Check :
   - If sub is already inseen - it can be considered as an output(result).
   - If sub is not seen - it can be added to the seen .

6. After loop ends:
    - Convert result set into list and return.


  // Complexity:

  //Time Complexity: 0(n);
  // Space Complexity: 0(n);
