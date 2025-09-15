package Array;

public class findmin_nax {
    static void max(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max+" "+"max element");
    }

    static void min(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min+" "+"min eleent");
    }
    public static void main(String[] args) {

int[] arr={5,64,9,4512,3,1};
min(arr);
max(arr);
    }
}
