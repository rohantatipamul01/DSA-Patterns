package SlidingWindow;

import java.util.Arrays;

public class AverageSum {
    public static void main(String args[]) {

        int arr[] = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;

        double[] result = findAverage(arr, k);

        System.out.println("Averages of subarrays of size " + k + " are: " + Arrays.toString(result));
    }

    static double[] findAverage(int arr[], int k) {

        double nums[] = new double[arr.length - k + 1];

        int windowSum = 0;

        // First window sum
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        nums[0] = (double) windowSum / k;

        // Sliding window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            nums[i - k + 1] = (double) windowSum / k;
        }

        return nums;
    }
}
