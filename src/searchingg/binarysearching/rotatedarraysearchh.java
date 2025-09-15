package searchingg.binarysearching;

public class rotatedarraysearchh {
    static int search(int[] arrr,int target){
        int st=0,end=arrr.length-1;

        while(st<=end) {
            int mid = st + (end - st) / 2;
            if (arrr[mid] == target) {
                return mid;
            }

            if (arrr[st] < arrr[mid]) {//left sorted
                if (arrr[st] <= target && target <= arrr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }

            } else {// right sorted
                if (arrr[mid] <= target && target <= arrr[end]) {
                    st = mid + 1;

                } else {
                    end = mid - 1;
                }
            }
        }

            return -1;
        }

    public static void main(String[] args){
        int[] arrr={4,5,6,7,0,1,2};
        int target=0;
        int ans=search(arrr,target);
            System.out.println(ans);
    }
}
