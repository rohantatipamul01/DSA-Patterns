// 13. Sort Colors (Dutch National Flag)

// Test Case

// Input:  [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

import java.util.Scanner;
public class SortColors {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array (0s, 1s and 2s only): ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result[]=Sort(arr);
        System.out.println("Sorted colors array: "+java.util.Arrays.toString(result));
        sc.close();
    }
    static int[] Sort(int arr[])
    {
        int i=0;
        int j=arr.length-1;
        int k=0;
        while(k<=j)
        {
            if(arr[k]==0)
            {
                //swap arr[i] and arr[k]
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                i++;
                k++;
            }
            else if(arr[k]==1)
            {
                k++;
            }
            else
            {
                //swap arr[j] and arr[k]
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
                j--;
            }
        }
        return arr;
    }
}
