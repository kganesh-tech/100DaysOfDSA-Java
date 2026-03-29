// Problem: Two Sum
// Approach: Two Pointer
// Time Complexity: 0(n)
// Space Complexity: 0(1)

import java.util.*;

public class TwoSum {
    public static int[] TwoSum (int[] arr, int target) {
        int left =0;
        int right = arr.length - 1;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if(sum == target) {
                return new int[] {left + 1, right + 1};
            }else if (sum < target) {
                left++;
            }else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
    
    public static void main (String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6};
        int target = 9;
        int[] result = twoSum(arr, target);
        
        System.out.println ("Index1: " + result[0]);
        System.out.println ("Index2: " + result[1]);
    }
}
