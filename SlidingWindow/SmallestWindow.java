package SlidingWindow;

public class SmallestWindow {
    public static void main(String args[])
    {
        String s="01212";
        int result=hasAllChars(s, "012");
        System.out.println("Smallest window length containing 0, 1 and 2 is: "+result);
    }
    static int hasAllChars(String s, String pattern)
    {
       int res=Integer.MAX_VALUE;
       boolean zero=false, one=false, two=false;
       int zeroIndex=-1, oneIndex=-1, twoIndex=-1;
       for(int i=0;i<s.length();i++)
       {
           char ch=s.charAt(i);
           if(ch=='0')
            {
                zero=true;
                zeroIndex=i;

            }  
           else if(ch=='1')
             {
                one=true;
                oneIndex=i;
            }   
           else if(ch=='2') {
                two=true;
                twoIndex=i;
           }

           if(zero && one && two)
           {
               int windowSize = Math.max(zeroIndex, Math.max(oneIndex, twoIndex)) - Math.min(zeroIndex, Math.min(oneIndex, twoIndex));
               res = Math.min(res, windowSize);
           }
       }
       return res==Integer.MAX_VALUE?-1:res+1;
       
    }
}
