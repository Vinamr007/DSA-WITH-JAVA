package Array;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    
    // Returns the length of the longest increasing subsequence
    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1); // Each number is an LIS of length 1
        
        int maxLength = 1;
        
        // For each position, look back at previous elements
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }
        
        return maxLength;
    }
    
    // Prints one possible longest increasing subsequence
    public static void printOneLIS(int[] nums) {
        if (nums == null || nums.length == 0) return;
        
        int[] dp = new int[nums.length];
        int[] prev = new int[nums.length];
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);
        
        int maxLength = 1;
        int endIndex = 0;
        
        // Calculate dp array and keep track of previous indices
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > maxLength) {
                maxLength = dp[i];
                endIndex = i;
            }
        }
        
        // Print the subsequence
        System.out.print("One possible LIS: ");
        printLIS(nums, prev, endIndex);
        System.out.println();
    }
    
    private static void printLIS(int[] nums, int[] prev, int index) {
        if (index == -1) return;
        printLIS(nums, prev, prev[index]);
        System.out.print(nums[index] + " ");
    }
    
    public static void main(String[] args) {
        // Test case 1: Standard increasing sequence
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("Test Case 1:");
        System.out.println("Array: " + Arrays.toString(nums1));
        System.out.println("Length of LIS: " + lengthOfLIS(nums1));
        printOneLIS(nums1);
        System.out.println();
        
        // Test case 2: All elements same
        int[] nums2 = {7, 7, 7, 7};
        System.out.println("Test Case 2:");
        System.out.println("Array: " + Arrays.toString(nums2));
        System.out.println("Length of LIS: " + lengthOfLIS(nums2));
        printOneLIS(nums2);
        System.out.println();
        
        // Test case 3: Strictly decreasing
        int[] nums3 = {4, 3, 2, 1};
        System.out.println("Test Case 3:");
        System.out.println("Array: " + Arrays.toString(nums3));
        System.out.println("Length of LIS: " + lengthOfLIS(nums3));
        printOneLIS(nums3);
    }
}