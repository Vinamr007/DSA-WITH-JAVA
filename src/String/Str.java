package String;

public class Str {
    public static void main(String[] args) {
//        StringBuilder str=new StringBuilder("Tony");

//        //printing string
//        System.out.println(str);
//
//        //printing perticular index
//        System.out.println( str.charAt(0));
//
////        //change any perticular  index charatcter
////        str.setCharAt(0,'p');
////        System.out.println(str);
//
//
//
//        //add extra character in perticular index
//        str.insert(0,'p');
//        System.out.println(str);
//
//        //delete the perticular index charatcer
//        str.delete(0,1);
//        System.out.println(str);

        StringBuilder sb=new StringBuilder("hello");

//        //add indexin last
//        sb.append('e');
//        sb.append('l');
//        sb.append('l');
//        sb.append('o');
//
//        System.out.println(sb);

        //to printlength
        //System.out.println(sb.length());
for(int i=0;i<sb.length()/2;i++){
    int front=i;
    int back=sb.length()-i-1;

    char frontchar=sb.charAt(front);
    char backchar=sb.charAt(back);

    sb.setCharAt(front,backchar);
    sb.setCharAt(back,frontchar);

}
        System.out.println(sb);
    }
}
