// 9) Longest Substring Without Repeating Characters

// Problem: Find length of longest substring with no repeating characters.

// Testcases:

// Input: s="abcabcbb"
// Output: 3

// Input: s="bbbbb"
// Output: 1

package SlidingWindow;

public class SubstringLongest {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstring(s));
    }
    static int longestSubstring(String s){
        int i=0, j=0, max=0;
        boolean[] visited = new boolean[256];
        while(j<s.length()){
            char c = s.charAt(j);
            if(!visited[c]){
                visited[c] = true;
                max = Math.max(max, j-i+1);
                j++;
            } else {
                while(visited[c]){
                    char left = s.charAt(i);
                    visited[left] = false;
                    i++;
                }
            }
        }
        return max;
    }
}
