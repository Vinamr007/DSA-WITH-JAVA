package searchingg.linearsearch;

public class linearsearch {
    static int linearsrch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
    for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }

        }

    return 0;
    }

    public static void main(String[] args) {
        int[] arr={16,6,65,94,1,211,485};
int ans=linearsrch(arr,999);
        System.out.println(ans);
    }
}
