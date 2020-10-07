import java.util.Scanner;

public class ArmstrongNoWithInRange {
    public static void main(String[] args){
        int start,end,rem,temp, sum,i,counter=0;

        Scanner s = new Scanner(System.in);
        System.out.println("enter the start no.");
        start = s.nextInt();
        System.out.println("enter the end no.");
        end = s.nextInt();

        for(i = start+1;i<end;i++) {
            temp = i;
            sum = 0;

            while (temp != 0) {
                rem = temp % 10;
                sum = sum + (rem * rem * rem);
                temp = temp / 10;
            }
            if (i == sum) {
                if (counter == 0) {
                    System.out.println("Armstrong no.'s between" + start + "and" + end + "");
                }
                System.out.println(i + "");
                counter++;
            }
        }
        if(counter==0){
            System.out.println("no armstrong no's between"+start+"and"+end+"");
        }
    }
}
