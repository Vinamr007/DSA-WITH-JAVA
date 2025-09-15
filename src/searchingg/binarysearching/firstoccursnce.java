package searchingg.binarysearching;

public class firstoccursnce {
    static int occurance(int[] arr,  int x) {

        int st = 0, end = arr.length - 1;
int fo=-1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid]==x){
               fo=mid;
end=mid-1;
            } else if (x < arr[mid]) {
               end=mid-1;
            } else {
               st=mid+1;
            }

        }
        return fo;
    }
    public static void main(String[] args) {
        int[] arr={2,5,5,5,6,6,8,9,9,9};
        int x=5;
        occurance(arr,x);
    }
}
