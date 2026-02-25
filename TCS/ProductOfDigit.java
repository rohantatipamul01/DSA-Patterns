package TCS;
import java.util.Scanner;
public class ProductOfDigit {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=product(n);
        System.out.println(ans);
        sc.close();
    }
    static int product(int n)
    {
        int mul=1;
        while(n>0)
        {
            int rem=n%10;
            mul*=rem;
            n=n/10;
        }
        return mul;
    }
}
