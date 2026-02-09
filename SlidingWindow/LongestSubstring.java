// 7) Longest Subarray With Sum ≤ K

// Problem: Find longest subarray having sum ≤ k.
// (Assume all elements are positive)

// Testcases:

// Input: arr=[1,2,1,0,1,1,0], k=4
// Output: 7

// Input: arr=[2,3,1,2,4,3], k=7
// Output: 4

package SlidingWindow;

public class LongestSubstring {
    public static void main(String args[])
    {
        int arr[] = {1, 2, 1, 0, 1, 1, 0};
        int k = 4;

        int result = findLongestSubarray(arr, k);

        System.out.println("Length of longest subarray with sum ≤ " + k + " is: " + result);
    }
    static int findLongestSubarray(int arr[],int k)
    {
        int maxLength=0;
        int windowSum=0;
        int windowStart=0;
        for(int windowEnd=0;windowEnd<arr.length;windowEnd++)
        {
            windowSum+=arr[windowEnd];
            while(windowSum>k)
            {
                windowSum-=arr[windowStart];
                windowStart++;
            }
            maxLength=Math.max(maxLength,windowEnd-windowStart+1);
        }
        return maxLength;
    }
}
