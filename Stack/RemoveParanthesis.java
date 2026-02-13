// 1) Remove Outermost Parentheses

// Problem: Remove the outermost parentheses from every primitive part.

// Test Cases:

// Input: "(()())(())" → Output: "()()()"

// Input: "(()())(())(()(()))" → Output: "()()()()(())"

package Stack;
import java.util.Stack;
public class RemoveParanthesis {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }
    static String removeOuterParentheses(String s)
    {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                if(stack.isEmpty() || stack.peek()==')')
                {
                    stack.push(ch);
                }

            }
            else
            {
                if(stack.isEmpty() || stack.peek()=='(')
                {
                    stack.push(ch);
                }
                
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:stack)        {
            sb.append(ch);
        }
        return sb.toString();
    }
}
