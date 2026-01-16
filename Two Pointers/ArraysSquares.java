// 11. Squares of a Sorted Array

// Test Case

// Input:  [-4,-1,0,3,10]
// Output: [0,1,9,16,100]

import java.util.Scanner;
public class ArraysSquares {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of sorted array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of sorted array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result[]=sortedSquares(arr);
        System.out.println("Sorted squares array: "+java.util.Arrays.toString(result));
        sc.close();
    }
    static int[] sortedSquares(int arr[])
{
    int n = arr.length;
    int result[] = new int[n];

    int left = 0;
    int right = n - 1;
    int index = n - 1;

    while (left <= right)
    {
        int leftSquare = arr[left] * arr[left];
        int rightSquare = arr[right] * arr[right];

        if (leftSquare > rightSquare)
        {
            result[index] = leftSquare;
            left++;
        }
        else
        {
            result[index] = rightSquare;
            right--;
        }
        index--;
    }

    return result;
}

}
