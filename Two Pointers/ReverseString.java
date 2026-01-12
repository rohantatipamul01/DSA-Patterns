// 5. Reverse String

// Problem: Reverse a character array.

// Test Case

// Input:  ['h','e','l','l','o']
// Output: ['o','l','l','e','h']

import java.util.Arrays;
import java.util.Scanner;
public class ReverseString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of character array: ");
        int n=sc.nextInt();
        char arr[]=new char[n];
        System.out.println("Enter elements of character array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        char result[]=reverse(arr);
        System.out.print("Reversed character array: "+Arrays.toString(result));
        sc.close();
    }
    static char[] reverse(char arr[])
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
}
