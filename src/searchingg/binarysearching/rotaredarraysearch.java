package searchingg.binarysearching;

public class rotaredarraysearch {
    static int searchtarget(int[] arr,int target){
        int st=0,end=arr.length-1;
        while(st<=end) {
        int mid=st+(end-st)/2;
        if(arr[mid]==target){
            return mid;
        }

        if(arr[st]<arr[mid]){//left sorted array
            if(arr[st]<=target && target<=arr[mid]){
                end=mid-1;
            }else{
                st=mid+1;
            }

        }else{// right sorted array
            if(arr[mid]<=target && target<=arr[end]){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }


        }
     return -1;
    }


    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2,3};
        int target=0;
        int ans=searchtarget(arr,target);
        System.out.println(target);
    }
}
