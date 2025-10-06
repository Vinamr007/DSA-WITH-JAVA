package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {

    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices.
        // Key: number, Value: index
        Map<Integer, Integer> numMap = new HashMap<>();

        // Iterate through the array.
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement needed to reach the target.
            int complement = target - nums[i];

            // Check if the complement exists in our map.
            if (numMap.containsKey(complement)) {
                // If it exists, we found our pair.
                // Return the index of the complement and the current index.
                return new int[] { numMap.get(complement), i };
            }

            // If the complement is not found, add the current number and its index to the map.
            // We do this after the check to avoid using the same element twice.
            numMap.put(nums[i], i);
        }

        // If no solution is found, throw an exception.
        // The problem statement guarantees a solution, so this is for robustness.
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);

        System.out.println("Input: nums = [2, 7, 11, 15], target = 9");
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]"); // Output: [0, 1]
    }
}