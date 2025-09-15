package String;

public class character_frequency {
    public static void main(String[] args) {
String str="this is mango";
char ch='s';
int count=0;
for(int i=0;i<str.length();i++){
    if(str.charAt(i)==ch){
    count++;
    }
}
        System.out.println("the number of charcter is present this time"+count);
    }
}
