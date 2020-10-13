public class ReverseNumber {

    public static void main (String[] args){
        int n = 12345;
        int sum = 0, m;

        while(n>0){
            m = n%10;
            sum = (sum*10) +m;
            n = n/10;
        }
        System.out.println(sum);
    }
}
