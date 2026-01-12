package Array;

public class cycrotatedarr {

    static void rotate(int[] arr){
int lastelement=arr[arr.length-1];

for (int i=arr.length-1;i>0;i--){
    arr[i]=arr[i-1];
}

for(int i=0;i< arr.length;i++){
    System.out.println(arr[i]);
}

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
rotate(arr);
    }
}
