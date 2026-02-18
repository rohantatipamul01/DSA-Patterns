package Hashmap;
import java.util.HashMap;
public class FirstNonRepeating {
    public static void main(String args[])
    {
        int arr[]={1,3,4,5,1,2,3,4,5,1};
        int ans=firstNonRepeating(arr);
        System.out.println(ans);
    }
    static int firstNonRepeating(int arr[])
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])==1)
            {
                return arr[i];
            }
        }
        return -1;
    }
}
