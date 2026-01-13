// 8. Remove Element

// Problem: Remove all occurrences of a value.

// Test Case

// Input:  nums = [3,2,2,3], val = 3
// Output: [2,2], length = 2
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class RemoveElement {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];   
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value to be removed: ");
        int val=sc.nextInt();
        List<Integer> result=remove(arr,val);
        System.out.println("Array after removing "+val+": "+result);
        sc.close();
    }
    static List<Integer> remove(int arr[],int val)
    {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=val)
            {
                result.add(arr[i]);
            }
        }
        return result;
    }
}
