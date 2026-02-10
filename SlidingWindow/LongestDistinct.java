// 9) Longest Substring With K Distinct Characters

// Problem: Given string, find length of longest substring with exactly k distinct chars.

// Testcases:

// Input: s="araaci", k=2
// Output: 4

// Input: s="cbbebi", k=3
// Output: 5
package SlidingWindow;
import java.util.HashMap;
public class LongestDistinct{
    public static void main(String[] args) {
        String s = "cbbebi";
        int k = 3;
        System.out.println(longestDistinct(s, k));
    }
    static int longestDistinct(String s, int k){
        int i=0, j=0, max=0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(j<s.length()){
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0)+1);
            if(map.size() < k){
                j++;
            } else if(map.size() == k){
                max = Math.max(max, j-i+1);
                j++;
            } else {
                while(map.size() > k){
                    char left = s.charAt(i);
                    map.put(left, map.get(left)-1);
                    if(map.get(left) == 0){
                        map.remove(left);
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}