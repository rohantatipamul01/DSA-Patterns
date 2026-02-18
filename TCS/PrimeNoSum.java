package TCS;
import java.util.Scanner;
public class PrimeNoSum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int ans=primeSum(n);
        System.out.println(ans);
        sc.close();
    }
    static int primeSum(int n)
    {
        int sum=0;
       for(int i=2;i<=n;i++)
       {
              if(isPrime(i))
              {
                sum+=i;
              }
       }
         return sum;
    }
    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
         }
         for(int i=2;i<=Math.sqrt(n);i++)
         {
             if(n%i==0)
             {
                 return false;
             }
         }
         return true;
        
    }
}
