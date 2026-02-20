package Hashmap;
import java.util.HashMap;
public class CountSubArray {
    public static void main(String args[])
    {
        int arr[]={3,4,7,2,-3,1,4,2};
        int target=7;
        int result=countSubArray(arr,target);
        System.out.println(result);
    }
    static int countSubArray(int arr[],int target)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i]; //3, 4, 7, 2
            if(sum==target) 
            {
                count++; // 1
            }
            if(map.containsKey(sum-target)) // 3-7=-4 // 7-7 // 14-7
            {
                count+=map.get(sum-target); // -4-7 // 1+0=1 // 1+1
            }
            map.put(sum,map.getOrDefault(sum,0)+1); // 7 2
        }
        return count;
    }
}
