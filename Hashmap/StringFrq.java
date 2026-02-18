package Hashmap;
import java.util.HashMap;
public class StringFrq {
    public static void main(String args[])
    {
        String str="Rohan Tatipamul";
        HashMap<Character,Integer> map=frequency(str);
        for(Character key:map.keySet())
        {
            System.out.println(key+" "+map.get(key));
        }
    }
    static HashMap<Character,Integer> frequency(String str)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        return map;
    }
}
