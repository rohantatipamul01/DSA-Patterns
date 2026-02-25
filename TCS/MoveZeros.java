package TCS;
import java.util.Scanner;
import java.util.Arrays;
public class MoveZeros {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int result[]=move(arr);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
    static int[] move(int arr[])
    {
        int n = arr.length;
        int pos = 0; // next position to place a non-zero
        for (int k = 0; k < n; k++) {
            if (arr[k] != 0) {
                arr[pos++] = arr[k];
            }
        }
        while (pos < n) {
            arr[pos++] = 0;
        }
        return arr;
    }

}
