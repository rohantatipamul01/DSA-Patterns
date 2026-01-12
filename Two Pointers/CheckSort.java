// 6. Check If Array Is Sorted

// Problem: Check whether array is sorted in ascending order.

// Test Case

// Input:  [1,2,3,4]
// Output: true

import java.util.Scanner;
public class CheckSort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean result=isSorted(arr);
        System.out.println("Is array sorted? "+result);
        sc.close();
    }
    static boolean isSorted(int arr[])
    {
        int i=0;
        int j=1;
        while(j<arr.length)
        {
            if(arr[i]>arr[j])
            {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
