//Problem: RemoveDuplicates 
//pattern: Two pointers
//Time Complexity: 0(n)
//Space Complexity: 0(1)

import java.util.*;
public class RemoveElement {

    public static int removeElement(int[] arr, int val) {

        int slow = 0;

        for (int fast = 0; fast < arr.length; fast++) {

            if (arr[fast] != val) {
                arr[slow] = arr[fast];
                slow++;
            }
        }

        return slow;   
    }

    public static void main(String[] args) {

        int[] arr = {3, 2, 2, 3};
        int val = 3;

        int newLength = removeElement(arr, val);

        System.out.println("New Length: " + newLength);

        System.out.print("Array after removing element: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

