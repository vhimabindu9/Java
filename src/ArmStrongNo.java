public class ArmStrongNo {
    public static void main (String[] args){
        int n=154,r, sum=0, temp,i;
        temp = n;
        while(n>0){
            r = n%10;
            sum = sum + (r*r*r);
            n=n/10;
        }
        if(temp==sum) {
            System.out.println("armstron number");
        }else{
            System.out.println("not a armstrong number");
        }
    }
}
