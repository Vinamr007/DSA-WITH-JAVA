package Array;

public class SubsetSum {
    
    public static boolean isSubsetSum(int[] arr, int target) {
        boolean[][] dp = new boolean[arr.length + 1][target + 1];
        
        // Empty subset can make sum 0
        for (int i = 0; i <= arr.length; i++) {
            dp[i][0] = true;
        }
        
        // Fill the dp table
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= target; j++) {
                if (arr[i-1] <= j) {
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        return dp[arr.length][target];
    }
    
    public static void printSubsetSum(int[] arr, int target) {
        if (isSubsetSum(arr, target)) {
            System.out.println("Found a subset with sum " + target);
        } else {
            System.out.println("No subset found with sum " + target);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        System.out.println("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        
        // Test different target sums
        int[] targets = {9, 13, 15, 30};
        for (int target : targets) {
            printSubsetSum(arr, target);
        }
    }
}