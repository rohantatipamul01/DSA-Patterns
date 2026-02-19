package Hashmap;
import java.util.HashMap;
public class MajorityElement {
    public static void main(String args[])
    {
        int arr[]={2,2,1,1,1,2,2};
        int res=findMajority(arr);
        System.out.println("Majority Element : "+res);
    }
    static int findMajority(int arr[])
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max=arr.length/2;
        for(Integer key:map.keySet())
        {
            if(map.get(key)>max)
            {
                return key;
            }
        }
        return -1;
    }
}
