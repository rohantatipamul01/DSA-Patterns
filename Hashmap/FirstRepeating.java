package Hashmap;
import java.util.HashMap;
public class FirstRepeating {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,1,2,3,4,5,1};
        int ans=firstRepeating(arr);
        System.out.println(ans);
    }
    static int firstRepeating(int arr[])
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                return arr[i];
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        return -1;
    }
}
