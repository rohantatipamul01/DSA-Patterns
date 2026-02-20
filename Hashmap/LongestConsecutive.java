// 12) Longest Consecutive Sequence (Medium)

// Problem: Return length of longest consecutive sequence.

// Test Cases:

// Input: [100,4,200,1,3,2] → Output: 4

// Input: [0,3,7,2,5,8,4,6,0,1] → Output: 9

package Hashmap;
import java.util.HashSet;

class LongestConsecutive
{
    public static void main(String args[])
    {
        int arr[]={100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
    
    static int longestConsecutive(int arr[])
    {
        if (arr == null || arr.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int n : arr) set.add(n);

        int longest = 0;
        for (int n : set) {
            // only start counting from sequence starts
            if (!set.contains(n - 1)) {
                int current = n;
                int length = 1;
                while (set.contains(current + 1)) {
                    current += 1;
                    length += 1;
                }
                if (length > longest) longest = length;
            }
        }
        return longest;
    }
}