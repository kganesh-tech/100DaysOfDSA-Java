//Problem : Trapping of the RainWater
//Pattern : Two Pointers
//Difficulty : hard.
//Approach:

- Use two pointers (left and right) starting from both ends
- Maintain leftMax and rightMax to track the maximum height seen so far from both sides.
- At each step, move the pointer with the smaller height.
- If current height is less than max, add ( max - height) to water.
- Continue until left < right and return total traped water.

  //Time Complexity: 0(n);
  // Space Complexity:0(1);


  code:

  import java.util.*;
public class Main {

    public static int trap (int[] height){
    
    int left = 0;
    int right = height.length  - 1;
    int leftMax = 0;
    int rightMax = 0;
    int water = 0;
    
    while(left < right) {
        if ( height[left] < height[right]) {
            if (height[left] >= leftMax) {
                leftMax = height[left];
            }else {
                water+= leftMax - height[left];
            }
            
            left++;
        }else{ 
            if(height[right] >= rightMax) {
                rightMax = height[right];
                
            } else {
                water+= rightMax - height[right];
            }
            right--;
    }
    }
    
    return water;
    
}

public static void main(String[] args) {
    int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    
    System.out.println(trap(height));
}
}
