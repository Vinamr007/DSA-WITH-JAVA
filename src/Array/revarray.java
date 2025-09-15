package Array;

public class revarray {
    static void swap(int[] arr,int st,int end){
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
    }
    static void rev(int[] arr,int st,int end){

        while(st<end){
            swap(arr,st,end);
            st++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        rev(arr,0,arr.length-1);
    }

}
