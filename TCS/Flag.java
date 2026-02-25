package TCS;
import java.util.Scanner;
import java.util.Arrays;
public class Flag {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans[]=sort(arr);
        System.out.println(Arrays.toString(ans));
        sc.close();
    } 
    static int[] sort(int arr[])
    {
        int result[]=new int[arr.length];
        int low=0,mid=0,high=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                low++;
            }
            else if(arr[i]==1)
            {
                mid++;
            }
            else
            {
                high++;
            }
        }
        for(int i=0;i<low;i++)
        {
            result[i]=0;
        }
        for(int i=low;i<low+mid;i++)
        {
            result[i]=1;
        }
        for(int i=low+mid;i<low+mid+high;i++)
        {
            result[i]=2;
        }
        
        return result;
        
    }
}
