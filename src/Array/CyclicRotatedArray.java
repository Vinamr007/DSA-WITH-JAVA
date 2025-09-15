package Array;

public class CyclicRotatedArray {
    static void cycreotate(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i!=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

    }
    static void printarrr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
      cycreotate(arr);
printarrr(arr);
    }
}
