// 3) Reverse Words in a String

// Problem: Reverse each word using stack.

// Test Cases:

// Input: "I love coding" → Output: "I evol gnidoc"

// Input: "Stack is easy" → Output: "kcatS si ysae"

package Stack;
import java.util.Stack;
public class ReverseWords {
    public static void main(String[] args)
    {
        String s = "Hello World";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s)
    {
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(ch==' ')
            {
                while(!stack.isEmpty())
                {
                    sb.append(stack.pop());
                }
                sb.append(' ');
            }
            else
            {
                stack.push(ch);
            }
        }
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
