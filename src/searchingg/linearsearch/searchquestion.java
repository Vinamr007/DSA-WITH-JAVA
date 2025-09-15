package searchingg.linearsearch;

public class searchquestion {
    static void findmax(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                int temp=max;
                max=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println(max);
    }


//    static int findmin(int[] arr){
//        int small=arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]<small){
//                int temp=small;
//                small=arr[i];
//                arr[i]=temp;
//            }
//        }
//        System.out.println(small+"it is the smallest element");
//        return small;
//    }


    public static void main(String[] args) {
        int[] arr={18,5,9,-66,5670};
//findmin(arr);
       // System.out.println(ans);

  findmax(arr);
    }
}
