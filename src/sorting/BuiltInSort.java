// Repository: DSA-WITH-JAVA
// GitHub: https://github.com/Vinamr007/DSA-WITH-JAVA
// -----------------------------------------------

import java.util.Arrays;

public class BuiltInSort {

    public static void main(String[] args) {
        // The array to be sorted
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Unsorted array: " + Arrays.toString(arr));
        
        // The single line that does all the sorting!
        Arrays.sort(arr);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}