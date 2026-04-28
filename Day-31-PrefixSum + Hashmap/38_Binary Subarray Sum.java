import java.util.HashMap;

public class BinarySubarraysWithSum {

    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1); 

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            
            if (map.containsKey(sum - goal)) {
                count += map.get(sum - goal);
            }

            
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    
    public static void main(String[] args) {
        BinarySubarraysWithSum obj = new BinarySubarraysWithSum();
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;

        System.out.println(obj.numSubarraysWithSum(nums, goal)); 
    }
}
