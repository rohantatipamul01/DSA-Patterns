package Hashmap;
import java.util.HashMap;
public class TwoSum {
    public static void main(String args[])
    {
        int arr[]={3,7,11,2,15};
        int target=9;
        HashMap<Integer,Integer> map=twoSum(arr,target);
        System.out.println(map);
        
    }
    static HashMap<Integer,Integer> twoSum(int arr[],int target)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],i);
        }
        HashMap<Integer,Integer> result=new HashMap<>();
        for(int key:map.keySet())
        {
            int complement=target-key;
            if(map.containsKey(complement) && map.get(complement)!=map.get(key))
            {
                result.put( map.get(complement),map.get(key));
                break;
            }
        }
        return result;
    }
}
