package searchingg.binarysearching;

public class BinarySearchIterative {

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 6;
        int idx = binarySearch(arr, target);
        if (idx != -1) {
            System.out.println("Found " + target + " at index " + idx);
        } else {
            System.out.println(target + " not found");
        }
    }
}
