
public class ReverseString {

    public static void main (String[]args){
        String s = "reverse";
        String t = "";

        for(int i=s.length()-1; i>=0; i--){
            t= t+s.charAt(i);
        }
        System.out.println("the reverese string is : "+t);

    }


}
