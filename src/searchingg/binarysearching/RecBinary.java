package searchingg.binarysearching;

public class RecBinary {

    static boolean recbin(int[] arr, int st, int end, int target){
     if(st>end) return false;
     int mid=(st+end)/2;
if(target==arr[mid]){
    return true;

}
else if(target<arr[mid]){
    return recbin(arr,st,mid-1,target);
}
else{
    return recbin(arr,mid+1,end,target);
}


    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=4;
        System.out.println(recbin(arr,0,arr.length-1,target));
    }
}
