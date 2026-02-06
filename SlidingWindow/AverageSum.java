package SlidingWindow;

public class AverageSum {
    public static void main(String args[])
    {
        int arr[] = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result = findAverage(arr, k);
        System.out.println("Maximum average of subarray of size " + k + " is: " + result);
    }
    static double findAverage(int arr[],int k)
    {
        int nums[]=new int[arr.length];
        int n=arr.length;
        double maxSum=0;
        double windowSum=0;
        // Calculate sum of first window of size k
        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        maxSum=windowSum;
        // Slide the window from left to right
        for(int i=k;i<n;i++){
            windowSum=windowSum-arr[i-k]+arr[i];
            if(windowSum>maxSum){
                maxSum=windowSum;
            }
        }
        
        return maxSum/k;
    }
}
