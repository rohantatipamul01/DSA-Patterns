// 2) Min Add to Make Parentheses Valid

// Problem: Add minimum brackets to make string valid.

// Test Cases:

// Input: "())" → Output: 1

// Input: "(((" → Output: 3

package Stack;

import java.util.Stack;

public class MinParanthesis {
    public static void main(String[] args) {
        String s = "())";
        System.out.println(minAddToMakeValid(s));
    }
    static int minAddToMakeValid(String s)
    {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                stack.push(ch);
            }
            else
            {
                if(!stack.isEmpty() && stack.peek()=='(')
                {
                    stack.pop();
                }
                else
                {
                    stack.push(ch);
                }
            }
        }
        return stack.size();
    }
}
