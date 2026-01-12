package Daily5que;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
      //  int[] temp;
       int right=arr.length-1;
       int left=0;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;

        }
    
    System.out.println("reverse array");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");

    }
    
    
}}
