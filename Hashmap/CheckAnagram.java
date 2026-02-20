// 14) Check if Two Strings are Anagrams (Medium)

// Problem: Return true if both strings are anagrams.

// Test Cases:

// Input: "listen", "silent" → Output: true

// Input: "hello", "world" → Output: false

package Hashmap;
import java.util.HashMap;
public class CheckAnagram {
    public static void main(String args[])
    {
        String s1="listen";
        String s2="silent";
        boolean res=check(s1,s2);
        System.out.println(res);
    }
    static boolean check(String s1,String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c : s1.toCharArray()){
    map.put(c, map.getOrDefault(c, 0)+1);
}
for(char c : s2.toCharArray()){
    if(!map.containsKey(c) || map.get(c)==0){
        return false;
    }
    if(map.get(c)==1){
        map.remove(c);
    }else{
        map.put(c, map.get(c)-1);
    }
}
return map.isEmpty();

    }
}
