package TCS;
import java.util.Scanner;
public class AddSubtract {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Test Cases :");
        int t=sc.nextInt();
        int res=addsub(t,sc);
        System.out.println("Minimum number of operations : "+res);
        sc.close();
    }
    static int addsub(int t,Scanner sc)
    {
        int operations=0;
        while(t>0)
        {
            System.out.println("Enter the value of p :");
            int p=sc.nextInt();
            System.out.println("Enter the value of q :");
            int q=sc.nextInt();
            System.out.println("Enter the value of r :");
            int r=sc.nextInt();
            if(p==q && q==r)
            {
                return operations;
            }
            if(p>q && p>r)
            {
                p=p-1;
                q=q+1;
                r=r+1;
                operations++;
            }
            else if(q>p && q>r)
            {
                q=q-1;
                p=p+1;
                r=r+1;
                operations++;
            }
            else
            {
                r=r-1;
                p=p+1;
                q=q+1;
                operations++;
            }
            t--;
        }
        return operations;
    }
}
