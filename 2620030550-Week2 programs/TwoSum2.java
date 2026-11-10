import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Store each number and its index: <Value, Index>
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the required pair already exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, add the current number and index to the map
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found (per constraints, a solution always exists)
        return new int[] {};
    }
}
