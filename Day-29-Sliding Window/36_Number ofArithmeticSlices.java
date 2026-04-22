class Solution {
  public static int NumberOfArithmeticSlices (int[] nums) {
    int count = 0;
    int total = 0;

  for(int i = 0; i< nums.length; i++) {
    if(nums[i - 1) - nums[i] == nums[i - 2] - nums[i - 1]) {
         count ++;
         total += count;
    } else {
      count = 0;
    }
  }
    return total;
  }
}
