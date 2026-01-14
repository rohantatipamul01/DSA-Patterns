// 10. Merge Two Sorted Arrays

// Test Case

// Input:  [1,3,5], [2,4,6]
// Output: [1,2,3,4,5,6]

import java.util.Scanner;
public class MergeArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of first sorted array: ");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter elements of first sorted array: ");
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter size of second sorted array: ");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter elements of second sorted array: ");
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int merged[]=merge(arr1,arr2);
        System.out.println("Merged sorted array: "+java.util.Arrays.toString(merged));
        sc.close();

    }
    static int[] merge(int arr1[],int arr2[])
    {
        int n1=arr1.length;
        int n2=arr2.length;
        int merged[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2)
        {
            if(arr1[i]<arr2[j])
            {
                merged[k++]=arr1[i++];
            }
            else
            {
                merged[k++]=arr2[j++];
            }
        }
        while(i<n1)
        {
            merged[k++]=arr1[i++];
        }
        while(j<n2)
        {
            merged[k++]=arr2[j++];
        }
        return merged;
    }
}
