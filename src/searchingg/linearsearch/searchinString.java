package searchingg.linearsearch;

public class searchinString {


    static boolean search(String str,char target){

        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String name="kunal";
        char target='K';
        System.out.println(search(name,target));
    }
}
