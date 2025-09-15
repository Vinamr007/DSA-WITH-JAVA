package searchingg.binarysearching.TwoD2D;

public class searchelement {
static int targetsearch(int[][] arr,int target){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[i][j]==target){
                System.out.println("target is found"+arr[i][j]);
            }
        }
    }
 return -1;
}

    public static void main(String[] args) {
        int[][] arr={{18,9,12},
                {36,-4,91},
                {44,33,16}
        };
int target=91;
targetsearch(arr,target);
    }


}
