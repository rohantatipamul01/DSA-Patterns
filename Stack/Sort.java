// 8) Sort a Stack (Easy version)

// Problem: Sort stack elements in ascending order.

// Test Cases:

// Input: [3, 1, 4, 2] → Output: [1, 2, 3, 4]

// Input: [5, 2, 9, 1] → Output: [1, 2, 5, 9]

package Stack;
import java.util.Stack;
public class Sort {
    public static void main(String args[])
    {
        int arr[]={3, 1, 4, 2};
        Stack<Integer> res=sortStack(arr);
        System.out.println(res);
    }
    static Stack<Integer> sortStack(int arr[])
    {
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            st1.push(arr[i]);
        }
        while(!st1.isEmpty())
        {
            int temp=st1.pop();
            while(!st2.isEmpty() && st2.peek()>temp)
            {
                st1.push(st2.pop());
            }
            st2.push(temp);
        }
        return st2;
    }
}
