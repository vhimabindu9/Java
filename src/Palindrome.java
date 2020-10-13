public class Palindrome {

    public static void main (String[]args){
        isPalindrome("race car");
        isPalindrome("drone");
    }

    private static void isPalindrome(String s) {

        String t = "";
        //removing white spaces for string s

        String s1 = s.replaceAll("\\s","");

        for(int i=s1.length()-1; i>=0; i--){
            t= t+s1.charAt(i);
        }

        if(s1.equals(t))
            System.out.println(s +" - palindrome ");
        else
            System.out.println(s+ " - not palindrome");
    }
}
