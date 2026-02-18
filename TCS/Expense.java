package TCS;
import java.util.HashMap;
import java.util.Scanner;
public class Expense {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Total Income: ");
        int income=sc.nextInt();
        HashMap<String,Integer> map=TotalExpense(income,sc);
        int sum=0;
        for(String key:map.keySet())
        {
            sum+=map.get(key);
        }
        System.out.println("The Total Income is: "+income);
        System.out.println("The Total Expense is: "+sum);
        System.out.println("The Remaining Amount is: "+(income-sum));
        for(String key:map.keySet())
        {
            System.out.println("Expense Name: "+key+" Expense Amount: "+map.get(key));
        }
        sc.close();
    
    }
    static HashMap<String,Integer> TotalExpense(int income,Scanner sc1)
    {
        HashMap<String,Integer> map=new HashMap<>();
//sc1=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the Expense Name (or 'Done' to finish): ");
            String name=sc1.next();
            if(name.equals("Done"))
            {
                break;
            }
            System.out.println("Enter the Expense Amount: ");
            int amount=sc1.nextInt();
            map.put(name,amount);
        }
        return map;
    }
}
