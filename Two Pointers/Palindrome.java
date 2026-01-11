// 2. Check Palindrome String

// Problem: Check if a string is a palindrome.

// Test Case

// Input:  "madam"
// Output: true


import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args)
    {
        System.out.println("Enter the String: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean result=isPalindrome(str);
        System.out.println(result);
        sc.close();
    }
    static boolean isPalindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
