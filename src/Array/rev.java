package Array;

public class rev {
    static void swapp(int[] arr,int st,int end){
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
 }
 static void reverse(int[] arr,int st,int end){
        while(st<end){
            swapp(arr,st,end);
            st++;
            end--;
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr,0, arr.length-1);
    }
    
}
