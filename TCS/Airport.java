package TCS;
import java.util.Scanner;
public class Airport {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the risk of each item: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res[]=itemRisk(arr);
        System.out.println("Risk of each item: ");
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
        sc.close();
    }
    static int[] itemRisk(int arr[])
    {
       int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                // swap nums[low] and nums[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            } 
            else if (arr[mid] == 1) {
                mid++;
            } 
            else {
                // swap nums[mid] and nums[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
        return arr;
    }
}
