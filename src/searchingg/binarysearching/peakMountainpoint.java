package searchingg.binarysearching;

public class peakMountainpoint {

static int peak(int[] arr){
  int st=0,end=arr.length-1;
  while(st<=end){
      int mid=st+(end-st)/2;
      if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
          return mid;

      }
      else if(arr[mid-1]<arr[mid]){
          st=mid+1;
      }
      else{
          end=mid-1;
      }

  }

    return -1;

}
    public static void main(String[] args) {
        int[] arr={0,1,3,4,5,9,3,2,1};
     int ans=   peak(arr);
        System.out.println(ans);
    }

}
