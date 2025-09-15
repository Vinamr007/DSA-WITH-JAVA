package searchingg.binarysearching;

public class first_lastoccurance_problem {
    static int  searcgtarget(int[] ar,int target){
        int n=ar.length;
        int st=0,end=n-1;

        while(st<end){
            int mid=st+(end-st)/2;
            if(ar[mid]==target){
                for(int i=ar[mid];i!=target;i++){
                    return i;
                }
                for(int j=ar[mid];j!=target;j--){
                    return j;
                }
            }


        }
        return -1;
    }
    public static void main(String[] args) {
        int[] ar={5,7,7,8,8,9};
        int target=7;
        int ans=searcgtarget(ar,target);
        System.out.println(ans);


    }
}
