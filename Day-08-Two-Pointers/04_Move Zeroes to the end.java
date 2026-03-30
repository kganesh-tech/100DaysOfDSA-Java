problem : Move Zeroes to the end
Pattern: Two Pointers
Time Complexity: 0(n)
Space Complexity: 0(1)

  import java.util.*;
public class moveZeroes {

    public static void moveZeroes(int[] arr) {

        int slow = 0;

        for (int fast = 0; fast < arr.length; fast++) {

            if(arr[fast]!= 0) {
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;
                slow++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 0};
         moveZeroes(arr);
         
         for(int num: arr) {
             System.out.println(num + " ");
         }
    }
}
