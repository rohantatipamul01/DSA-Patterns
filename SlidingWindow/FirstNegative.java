// 4) First Negative Number in Every Window of Size K

// Problem: For every window of size k, print the first negative number in O(n)

// Testcases:

// Input: arr=[-8,2,3,-6,10], k=2
// Output: [-8, 0, -6, -6]

// Input: arr=[12,-1,-7,8,-15,30,16,28], k=3
// Output: [-1, -1, -7, -15, -15, 0]

package SlidingWindow;

public class FirstNegative {
    public static void main(String args[])
    {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        int[] result = findFirstNegative(arr, k);

        System.out.print("First negative numbers in every window of size " + k + " are: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    static int[] findFirstNegative(int arr[],int k)
    {
        int nums[]=new int[arr.length-k+1];
        int index=0;
        for(int i=0;i<=arr.length-k;i++)
        {
            int firstNegative=0;
            for(int j=i;j<i+k;j++)
            {
                if(arr[j]<0)
                {
                    firstNegative=arr[j];
                    break;
                }
            }
            nums[index++]=firstNegative;
        }
        return nums;
    }
}
