package Hashmap;
import java.util.HashMap;
public class FindCommon {
    public static void main(String args[])
    {
        int arr1[]={1,2,3,4,5};
        int arr2[]={3,4,5,6,7};
        int arr3[]={5,6,7,8,9};
        HashMap<Integer,Integer> map=findCommon(arr1,arr2,arr3);
        for(Integer key:map.keySet())
        {
            if(map.get(key)==3)
            {
                System.out.print(key+" ");
            }
        }
    }
    static HashMap<Integer,Integer> findCommon(int arr1[],int arr2[],int arr3[])
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length || i<arr2.length || i<arr3.length ;i++)
        {
            if(i<arr1.length)
            {
                map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
            }
            if(i<arr2.length)
            {
                map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
            }
            if(i<arr3.length)
            {
                map.put(arr3[i],map.getOrDefault(arr3[i],0)+1);
            }
        }
        
        
        return map;

    }

}
