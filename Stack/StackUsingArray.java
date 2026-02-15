// 5) Implement Stack using Array

// Problem: Implement stack with operations push, pop, peek.

// Test Cases:

// Push: 10, 20, 30 → Peek → Output: 30

// Pop once → Peek → Output: 20

package Stack;

public class StackUsingArray {
    public static void main(String args[])
    {
        int arr[]=new int[100];
        int top=-1;
        top=push(arr,top,10);
        top=push(arr,top,20);
        top=push(arr,top,30);
        System.out.println(peek(arr,top));
        top=pop(arr,top);
        System.out.println(peek(arr,top));
            
    } 
    static int push(int arr[],int top,int x)
    {
        if(top==arr.length-1)
        {
            System.out.println("Stack Overflow");
            return top;
        }
        else
        {
            top++;
            arr[top]=x;
            return top;
        }
    }
    static int pop(int arr[],int top)
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return top;
        }
        else
        {
            top--;
            return top;
        }
    }
    static int peek(int arr[],int top)
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return arr[top];
        }
    }
}
