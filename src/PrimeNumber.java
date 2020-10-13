import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[]args){
        int n=5,i;
        int prime =1;
       // Scanner s = new Scanner(System.in);
       // System.out.println("Enter a number: ");
       // n = s.nextInt();

        for (i=2; i<n;i++){
            if((n%i)==0) {
                prime = 0;
            }
        }
        if(prime == 0){
                System.out.println(n+ " not a prime number");
            }
            else
                System.out.println(n +" prime number");
        }

}
