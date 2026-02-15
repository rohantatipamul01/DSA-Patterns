// 6) Evaluate Postfix Expression

// Problem: Evaluate postfix like "2*31+9-"

// Test Cases:

// Input: "231*+9-" → Output: -4

// Input: "52+" → Output: 7

package Stack;
import java.util.Stack;
public class PostfixExpression {
    public static void main(String args[])
    {
        String s="231*+9-";
        int res=evaluatePostfix(s);
        System.out.println(res);
    }
    static int evaluatePostfix(String s)
    {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isDigit(c))
            {
                st.push(c-'0');
            }
            else
            {
                int val1=st.pop();
                int val2=st.pop();
                switch(c)
                {
                    case '+':
                    st.push(val2+val1);
                    break;
                    case '-':
                    st.push(val2-val1);
                    break;
                    case '*':
                    st.push(val2*val1);
                    break;
                    case '/':
                    st.push(val2/val1);
                    break;
                }
            }
        }
        return st.pop();
    }
}
