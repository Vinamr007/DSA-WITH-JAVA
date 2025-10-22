package Array;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumSlidingWindow {
    
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }
        
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ri = 0;
        
        // Store indices of useful elements in deque
        Deque<Integer> deque = new LinkedList<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Remove elements outside current window
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            
            // Remove elements smaller than current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            
            // Add current element
            deque.offer(i);
            
            // Add to result if we have a complete window
            if (i >= k - 1) {
                result[ri++] = nums[deque.peek()];
            }
        }
        
        return result;
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Test case 1: Regular array
        int[] nums1 = {1, 3, -1, -3, 5, 3, 6, 7};
        int k1 = 3;
        System.out.println("Test Case 1:");
        System.out.println("Array:");
        printArray(nums1);
        System.out.println("Window size: " + k1);
        System.out.println("Maximum in each sliding window:");
        printArray(maxSlidingWindow(nums1, k1));
        
        // Test case 2: Array with duplicate elements
        int[] nums2 = {1, 1, 1, 1, 1};
        int k2 = 2;
        System.out.println("\nTest Case 2:");
        System.out.println("Array:");
        printArray(nums2);
        System.out.println("Window size: " + k2);
        System.out.println("Maximum in each sliding window:");
        printArray(maxSlidingWindow(nums2, k2));
        
        // Test case 3: Window size equals array length
        int[] nums3 = {1, -1, 2, -2};
        int k3 = 4;
        System.out.println("\nTest Case 3:");
        System.out.println("Array:");
        printArray(nums3);
        System.out.println("Window size: " + k3);
        System.out.println("Maximum in each sliding window:");
        printArray(maxSlidingWindow(nums3, k3));
    }
}