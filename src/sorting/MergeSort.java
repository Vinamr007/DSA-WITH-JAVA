package sorting;

public class MergeSort {

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        int[] aux = new int[arr.length];
        mergeSort(arr, aux, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] aux, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(arr, aux, left, mid);
        mergeSort(arr, aux, mid + 1, right);
        merge(arr, aux, left, mid, right);
    }

    private static void merge(int[] arr, int[] aux, int left, int mid, int right) {
        for (int i = left; i <= right; i++) aux[i] = arr[i];

        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right) {
            if (aux[i] <= aux[j]) arr[k++] = aux[i++];
            else arr[k++] = aux[j++];
        }
        while (i <= mid) arr[k++] = aux[i++];
        while (j <= right) arr[k++] = aux[j++];
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("Before:");
        printArray(arr);
        mergeSort(arr);
        System.out.println("After:");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }
}
