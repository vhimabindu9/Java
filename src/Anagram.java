import java.util.Arrays;

public class Anagram {

    // program to check whether two strings are anagram are not
    //example: input: s1 = keep & s2 = peek,  or input: s1 = mother in law & s2 = hitler woman,  output: both are anagrams

    public static void main(String[] args){

        // creating an method with 2 input strings

        isAnagram("keep","peek");
        isAnagram("joy","enjoy");
        isAnagram("mother in law","hitler woman");
        isAnagram("School master","The classroom");

    }

    private static void isAnagram(String s1,String s2) {

        // removing the white spaces of both strings s1 and s2

        String copyOfS1 = s1.replaceAll("\\s","");
        String copyOfS2 = s2.replaceAll("\\s","");

        //intially creating status as true

        boolean status = true;
        // checking if the length of the two strings are equal,
        // if the length of the both strings doesn't equal, then the status should be false
        if(copyOfS1.length()!= copyOfS2.length()){
            status = false;
        } else{
            //changing the character case to lower and then converting them both to char array
            char[] s1Array = copyOfS1.toLowerCase().toCharArray();
            char[] s2Array = copyOfS2.toLowerCase().toCharArray();

            //sorting the both arrays
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            // checking the both arrays are equal
            status = Arrays.equals(s1Array,s2Array);
        }
        //output
        if(status){
            System.out.println(s1 + " and "+ s2 + " are anagrams");
        }else{
            System.out.println(s1 + " and "+ s2 + " are not anagrams");
        }
    }
}
