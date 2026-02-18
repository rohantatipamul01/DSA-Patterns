package TCS;
import java.util.Scanner;
public class Parking {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Rows :");
        int rows=sc.nextInt();
        System.out.println("Enter the Columns :");
        int cols=sc.nextInt();
        int[][] parkingLot=new int[rows][cols];
        int res=CountSlots(parkingLot,sc);
        if(res==-1)
        {
            System.out.println("No parking slots available");
        }
        else
        {
            System.out.println("Row with maximum parking slots : "+res);
        }
        
    }
    static int CountSlots(int[][] parkingLot,Scanner sc)
    {
        int maxOnes=0,rowIndex=-1;
        for(int i=0;i<parkingLot.length;i++)
        {
            int count=0;
            for(int j=0;j<parkingLot[i].length;j++)
            {
                parkingLot[i][j]=sc.nextInt();
                if(parkingLot[i][j]==1)
                {
                    count++;
                }
            }
            if(count>maxOnes)
            {
                maxOnes=count;
                rowIndex=i+1;
            }

        }
        return rowIndex;
    }
}
