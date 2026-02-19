package Hashmap;
import java.util.HashMap;
public class SubarraySum {
    public static void main(String args[])
    {
        int arr[]={1,2,3,0,5};
        int target=9;
        boolean result=subArraySum(arr,target);
        System.out.println(result);
    }
    static boolean subArraySum(int arr[],int target)
    {
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==target)
            {
                return true;
            }
            if(map.containsKey(sum-target))
            {
                return true;
            }
            map.put(sum,i);
        }
        return false;
    }
}
