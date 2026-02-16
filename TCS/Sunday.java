package TCS;
import java.util.Scanner;
public class Sunday {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int days=sc.nextInt();
        System.out.println("Enter the Day :");
        String day=sc.next();
        int res=noOfSundays(days,day);
        System.out.println("Number of Sundays : "+res);
        sc.close();
    }
    static int noOfSundays(int days,String day)
    {
        int sundays=0;
        switch(day)
        {
            case "Monday":
                sundays=days/7;
                if(days%7>=6)
                {
                    sundays+=1;
                }
                break;
            case "Tuesday":
                sundays=days/7;
                if(days%7>=5)
                {
                    sundays+=1;
                }
                break;
            case "Wednesday":
                sundays=days/7;
                if(days%7>=4)
                {
                    sundays+=1;
                }
                break;
            case "Thursday":
                sundays=days/7;
                if(days%7>=3)
                {
                    sundays+=1;
                }
                break;
            case "Friday":
                sundays=days/7;
                if(days%7>=2)
                {
                    sundays+=1;
                }
                break;
            case "Saturday":
                sundays=days/7;
                if(days%7>=1)
                {
                    sundays+=1;
                }
                break;
            case "Sunday":
                sundays=days/7;
                break;
            
        }
        return sundays;
    }
       
}
