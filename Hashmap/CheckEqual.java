package Hashmap;

import java.util.HashMap;

public class CheckEqual {
    public static void main(String args[])
    {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3,4,5};
        boolean ans=checkEqual(arr1,arr2);
        System.out.println(ans);
    }
    static boolean checkEqual(int arr1[],int arr2[])
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        if(arr1.length!=arr2.length)
        {
            return false;
        }
        else
        {
             for(int i=0;i<arr1.length;i++)
            {
                map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
                map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
            }
            for(int key:map.keySet())
            {
                if(map.get(key)%2!=0)
                {
                    return false;
                }
            }
        }
        return true;
       
    }
}
