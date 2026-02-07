// 5) Maximum Element in Every Window of Size K

// Problem: Return max element for each sliding window in O(n)

// Testcases:

// Input: arr=[1,3,-1,-3,5,3,6,7], k=3
// Output: [3,3,5,5,6,7]

// Input: arr=[4,2,12,3], k=2
// Output: [4,12,12]

package SlidingWindow;

public class MaxWindow {
    public static void main(String args[])
    {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = findMax(arr, k);

        System.out.print("Maximum elements in every window of size " + k + " are: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    static int[] findMax(int arr[],int k)
    {
        int nums[]=new int[arr.length-k+1];
        int index=0;
        for(int i=0;i<=arr.length-k;i++)
        {
            int max=Integer.MIN_VALUE;
            int j=i;
            while(j<i+k)
            {
                max=Math.max(max,arr[j]);
                j++;
            }
            nums[index++]=max;
        }
        return nums;
    }
}
