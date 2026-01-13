// 9. Find Pair with Given Sum (Sorted Array)

// Test Case

// Input:  [1,2,3,4,6], target = 6
// Output: true (2 + 4)

import java.util.Scanner;
public class FindPair {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of sorted array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target sum: ");
        int target=sc.nextInt();
        boolean result=pair(arr,target);
        System.out.println("Pair exists: "+result);
        sc.close();
    }
    static boolean pair(int arr[],int target)
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int sum=arr[i]+arr[j];
            if(sum==target)
            {
                return true;
            }
            else if(sum<target)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return false;
    }
}
