// 4. Move All Zeros to End

// Problem: Move all 0s to the end without changing order.

// Test Case

// Input:  [0,1,0,3,12]
// Output: [1,3,12,0,0]

import java.util.Arrays;
import java.util.Scanner;

public class MoveZero {
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
        int result[]=move(arr);
        System.out.println("Array after moving zeros to end: "+ Arrays.toString(result));
        sc.close();
    }
    static int[] move(int arr[])
    {
        int i=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            
        }
        return arr;
    }
}
