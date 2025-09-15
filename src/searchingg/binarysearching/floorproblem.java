package searchingg.binarysearching;

public class floorproblem {
    static int searchtarget(int []ar,int target){
        int n=ar.length;
        int st=0,end=n-1;
        while(st<=end){
         int mid=st+(end-st)/2;
         if(ar[mid]==target){
             return mid;
         }else if(ar[mid]<target){
             st=mid+1;
         }
         else{
            end=mid-1;
         }

        }

     return end;

    }
    public static void main(String[] args) {
        int[] ar={2,3,5,9,14,16,18};
        int target=15;

        System.out.println(searchtarget(ar,target));
    }
}