import java.util.HashMap;

public class LeetCode1 {
    public static void main(String[] args) {
        System.out.println();
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] sum = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.containsKey(nums[i]) && i != target - nums[i] ) {
                sum = new int[]{i, map.get(target - nums[i])};
            }
        }
        return sum;
    }
}
