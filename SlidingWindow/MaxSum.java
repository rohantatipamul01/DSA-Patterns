package SlidingWindow;
class MaxSum {
    public static void main(String args[])
    {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int result = maxSumSubarray(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
    static int maxSumSubarray(int arr[], int k)
    {
        int maxSum = 0;
        int windowSum = 0;
        int n = arr.length;

        // Calculate sum of first window of size k
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Slide the window from start to end of the array
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    } 
}
