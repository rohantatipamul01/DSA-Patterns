package TCS;
import java.util.*;
public class Monkeys {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of monkeys :");
        int m=sc.nextInt();
        System.out.println("Enter the number of bananas :");
        int b=sc.nextInt();
        System.out.println("Enter the number of bananas each monkey eats :");
        int k=sc.nextInt();
        System.out.println("Enter the number of penuts  :");
        int p=sc.nextInt();
        System.out.println("Enter the number of penuts each monkey eats :");
        int j=sc.nextInt();
        int res=monkeys(m,b,k,p,j);
        System.out.println("Number of monkeys left : "+res);
        sc.close();
    }
    static int monkeys(int m,int b,int k,int p,int j)
    {
       int bananaEat=b/k;
       if(b%k!=0)
       {
        bananaEat+=1;
       }
       int penutEat=p/j;
       if(p%j!=0)
       {
        penutEat+=1;
       }
       int totalEat=bananaEat+penutEat;
       return m-totalEat;
    }
}
