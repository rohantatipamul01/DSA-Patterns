// 3. Remove Duplicates from Sorted Array

// Problem: Remove duplicates in-place and return new length.

// Test Case

// Input:  [1,1,2,2,3]
// Output: [1,2,3], length = 3
import java.util.Scanner;
public class RemoveDuplicate {
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
        int length=remove(arr);
        System.out.println("Array after removing duplicates: "+length);
        sc.close();
    }
    static int remove(int arr[])
    {
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
            }
        }  
        return i+1;
    }
}
