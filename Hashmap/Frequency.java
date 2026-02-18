package Hashmap;
import java.util.HashMap;
public class Frequency {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,1,2,3,4,5,1};
        HashMap<Integer,Integer> map=frquency(arr);
        for(int key:map.keySet())
        {
            System.out.println(key+" "+map.get(key));
        }
    }
    static HashMap<Integer,Integer> frquency(int arr[])
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return map;
    }
}
