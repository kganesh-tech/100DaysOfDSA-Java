// Problem: Container With Most Water
// Pattern: Two Pointers

// Approach:
- Initialize two pointers: left = 0 and right = n - 1
- Calculate area using: min(height[left], height[right]) * (right - left)
- Update maximum area
- Move the pointer with smaller height
- Repeat until left < right

// Key Insight:
To maximize area, always move the pointer with smaller height because width is decreasing

// Time Complexity: O(n)
// Space Complexity: O(1)


  import java.util.*;
public class ContainerWithMostWater {
    public static int maxArea (int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        
        while (left < right) {
            int width = right - left;
            int h = Math.min (height[left] , height[right]); 
            int area = width * h;
            
            maxArea = Math.max(maxArea , area);
            
            
            if(height[left] < height[right]) {
                left++;
                
            } else {
                right--;
            }
            
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = { 1,8,6,2,5,4,8,3,7};
        int result = maxArea(height);
        System.out.println ("ContainerWithMostWater: " + result);
    }
}
