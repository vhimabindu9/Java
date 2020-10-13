public class FibonacciSeries {

public static void main (String[] args){

    //0,1,1,2,3,5,13,....
    //finding out first 10 fibonacci series

    int n = 10;
    int n1=0,n2=1,n3 = 0;
    System.out.println(n1+" "+n2);
    for (int i=2; i<n;i++){
        n3= n1+n2;
        System.out.println(""+n3);
        n1=n2;
        n2=n3;
    }

}
}
