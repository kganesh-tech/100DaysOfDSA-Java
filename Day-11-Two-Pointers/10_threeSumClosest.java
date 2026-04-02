
// Problem: 3Sum Closest
// Pattern: Two Pointers

**Approach:**
- Sort the array
- Fix one element (i)
- Use two pointers (left = i+1, right = end)
- Calculate sum = nums[i] + nums[left] + nums[right]
- Update closest sum if current sum is nearer to target
- If sum < target → move left++
- Else → move right--

**Key Insight:**
Use two pointers to explore all pairs and keep updating the closest sum to target

// Time Complexity: O(n^2)
// Space Complexity: O(1)

  import java.util.*;

public class ThreeSumClosest {
    public static int ThreeSumClosest ( int[] arr, int target) {
        Arrays.sort(arr);
        int closest = arr[0] + arr[1] + arr[2];
        for(int i = 0; i < arr.length - 2; i++) {
        int left = i + 1;
        int right = arr.length - 1;
        
        while ( left < right ) {
            
            int sum = arr[i] + arr[left] + arr[right];
            
            if(Math.abs(target - sum) < Math.abs(target - closest)) {
                closest = sum;
                
            }
            if(sum < target) {
                left++;
            }else{
                right--;
            }
            
        }
    }
    return closest;
}
public static void main (String[] args) {
    int[] arr = { -1, 2, 4, 1};
    int target = 1;
    
    int result = ThreeSumClosest(arr, target);
    System.out.println("ClosestSum:" + result);
}
}


