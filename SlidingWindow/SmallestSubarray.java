// 6) Smallest Subarray With Sum ≥ S

// Problem: Find the length of smallest subarray whose sum is at least S.

// Testcases:

// Input: arr=[2,1,5,2,3,2], S=7
// Output: 2

// Input: arr=[1,1,1,1,1], S=3
// Output: 3

package SlidingWindow;

public class SmallestSubarray {
    public static void main(String args[])
    {
        int arr[] = {2, 1, 5, 2, 3, 2};
        int S = 7;

        int result = findSmallestSubarray(arr, S);

        System.out.println("Length of smallest subarray with sum ≥ " + S + " is: " + result);
    }
    static int findSmallestSubarray(int arr[],int s)
    {
        int minLength=Integer.MAX_VALUE;
        int windowSum=0;
        int windowStart=0;
        for(int windowEnd=0;windowEnd<arr.length;windowEnd++)
        {
            windowSum+=arr[windowEnd];
            while(windowSum>=s)
            {
                minLength=Math.min(minLength,windowEnd-windowStart+1);
                windowSum-=arr[windowStart];
                windowStart++;
            }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
}
