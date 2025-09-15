package searchingg.binarysearching;

public class q1 {



        static boolean serachh(int[] arr,int target){
            int st=0,end=arr.length-1;
//            int mid=(st+end)/2;
            while(st<end){
                int mid=(st+end)/2;
                if(arr[mid]==target){
                    return true;
                }
                else if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
            return false;
        }
        public static void main(String[] args) {
            int[] arr={1,2,3,4,5};
            int target=4;
            System.out.println(serachh(arr,target));
        }
    }


