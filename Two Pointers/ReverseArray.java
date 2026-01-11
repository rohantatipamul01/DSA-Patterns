// 1. Reverse an Array

// Problem: Reverse the given array in-place.

// Test Case

// Input:  [1, 2, 3, 4, 5]
// Output: [5, 4, 3, 2, 1]
import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result[]=reverse(arr);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
    static int[] reverse(int arr[])
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
}