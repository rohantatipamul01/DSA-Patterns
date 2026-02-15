// 4) Next Greater Element (Basic)

// Problem: For each element, find next greater element to its right.

// Test Cases:

// Input: [4, 5, 2, 25] → Output: [5, 25, 25, -1]

// Input: [13, 7, 6, 12] → Output: [-1, 12, 12, -1]

package Stack;
import java.util.Stack;
public class NextGreater {
    public static void main(String args[])
    {
        int arr[]={4, 5, 2, 25};
        int n=arr.length;
        Stack<Integer> s=nextGreater(arr, n);
        while(!s.isEmpty())        {
            System.out.print(s.pop()+" ");
        }

    }

    static Stack<Integer> nextGreater(int arr[],int n)
    {
        Stack<Integer>s=new Stack<>();
        int res[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!s.isEmpty() && s.peek()<=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                res[i]=-1;
            }
            else
            {
                res[i]=s.peek();
            }
            s.push(arr[i]);
        }
        return s;

    }

    // static int[] nextGreaterTP(int arr[], int n)
    // {
    //     int i=0,j=i+1;
    //     int res[]=new int[n];
    //     while(j<n)
    //     {
    //         if(arr[i]<arr[j])
    //         {
    //             res[i]=arr[j];
    //             i++;
    //             j=i+1;
    //         }
    //         else
    //         {
    //             j++;
    //         }
    //     }
    //     while(i<n)
    //     {
    //         res[i]=-1;
    //         i++;
    //     }
    //     return res;
    // }
}
