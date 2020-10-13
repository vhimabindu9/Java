public class FizzBuzz {

  //  if number is divisible by 3, then you need to say Fizz
  //  If number is divisible by 5, then you need to say Buzz
  //  If number is divisible by 3 and 5 both, then you need to say FizzBuzz
  //  Else you just need to say next number

    public static void main (String[]args){
        int n = 100;
        for(int i =1; i<=n; i++){
            if(i%15==0){
                System.out.println("FizzBuzz"+"");
            }
            else if(i%5==0)
                System.out.println("Buzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else
                System.out.println(i+"");
        }
    }
}
