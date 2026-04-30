class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int minSum = Integer.MAX_VALUE;

        for (int start = 0; start < nums.size(); start++) {
            int currentSum = 0;

            for (int end = start; end < nums.size(); end++) {
                currentSum += nums.get(end);

                int len = end - start + 1;

                if (len >= l && len <= r && currentSum > 0) {
                    minSum = Math.min(minSum, currentSum);
                }
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}
