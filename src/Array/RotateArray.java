package Array;

public class RotateArray {

    // Rotate array to the right by k steps using reverse method
    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) return;
        k = k % nums.length;
        if (k == 0) return;
        
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    private static void printArray(int[] arr) {
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println("Before:");
        printArray(nums);
        rotate(nums, k);
        System.out.println("After rotating by " + k + " steps:");
        printArray(nums);
    }
}
