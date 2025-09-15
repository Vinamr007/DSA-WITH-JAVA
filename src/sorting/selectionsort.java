package sorting;

public class selectionsort {
    static void swap(int[] arr,int st,int end){
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;

    }
    static void printar(int[]  arr){
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }
    public static void main(String[] args) {
        int [] arr={7,8,3,1,2};

        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
if(arr[small]>arr[j]){
    small=j;
}
            }
            swap(arr,small,i);
        }
    printar(arr);
    }

}
