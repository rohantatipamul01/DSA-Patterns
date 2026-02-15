// 7) Check Palindrome using Stack

// Problem: Check if a string is palindrome using stack.

// Test Cases:

// Input: "madam" → Output: true

// Input: "hello" → Output: false
package Stack;
import java.util.*;
public class Palindrome {
    public static void main(String args[])
    {
        String s="madam";
        boolean res=isPalindrome(s);
        System.out.println(res);
    }
    static boolean isPalindrome(String s)
    {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            stack.push(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        return s.equals(sb.toString());
    }
}
