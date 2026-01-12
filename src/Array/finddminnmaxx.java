package Array;

public class finddminnmaxx {
public static void min(int[]arr){
    int min=arr[0];
    for(int i=0;i<arr.length;i++){
        if(min>arr[i]){
            min=arr[i];
        }
    }
    System.out.println("min"+min);
}
public static void max(int[]arr){
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            max=arr[i];
        }
    }
    System.out.println("max"+max);
}
    public static void main(String[] args) {
        int[] arr={1,2,34,646,5,6,89,5};
        min(arr);
        max(arr);
    }

}
