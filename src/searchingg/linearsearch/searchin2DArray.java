package searchingg.linearsearch;

public class searchin2DArray {
    static void search(int[][] arr,int target){
        for(int i=0;i <arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr= {
                {6,8,640},
                {1, 2, 30,34},
                {65,45,8,9},
                {99,45,6}
        }        ;
        int target=34;
search(arr,target);
    }
}
