package Hashmap;
import java.util.HashMap;
public class LongestSubarray {
    public static void main(String args[])
    {
        int arr[]={2,3,5,1,9};
        int k=10;
        System.out.println(subarray(arr, k));
    }
    static int subarray(int arr[],int k)
    {
        HashMap<Integer, Integer> prefixIndex = new HashMap<>();
        prefixIndex.put(0, -1);
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            // store earliest index for this prefix sum
            if (!prefixIndex.containsKey(sum)) {
                prefixIndex.put(sum, i);
            }
            // if we've seen (sum - k) before, update max length
            if (prefixIndex.containsKey(sum - k)) {
                int len = i - prefixIndex.get(sum - k);
                if (len > maxLen) maxLen = len;
            }
        }
        return maxLen;
    }
}
