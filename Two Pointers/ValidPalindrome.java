// 7. Valid Palindrome (Ignore Non-Alphanumeric)

// Test Case

// Input:  "A man, a plan, a canal: Panama"
// Output: true

import java.util.Scanner;
public class ValidPalindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        boolean result=isPalindrome(s);
        System.out.println("Is the string a valid palindrome? "+result);
        sc.close();
    }
    static boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            while(i<j && !Character.isLetterOrDigit(s.charAt(i)))
            {
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j)))
            {
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
