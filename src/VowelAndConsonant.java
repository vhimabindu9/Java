import java.util.Scanner;

public class VowelAndConsonant {
    
    public static void main (String[] args){
        char str = 0;
        Scanner s = new Scanner(System.in);
        System.out.println(" enter a character: ");
        str = s.nextLine().charAt(str);

            if (str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u' || str ==' ') {
                System.out.println(str + " - vowel ");
            } else {
                System.out.println(str + " - consonant");
            }
        }
}
