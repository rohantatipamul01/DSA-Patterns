// 12. Remove Duplicates II (At Most Twice)

// Test Case

// Input:  [1,1,1,2,2,3]
// Output: [1,1,2,2,3]
import java.util.Scanner;
public class RemoveDuplicatesII {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of sorted array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of sorted array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result[]=removeDuplicate(arr);
        System.out.println("Array after removing duplicates (at most twice): "+java.util.Arrays.toString(result));
        sc.close();
    }
    static int[] removeDuplicate(int arr[])
    {
        int n = arr.length;
        if (n <= 2) {
            return arr;
        }

        int index = 2; // Start from the third position

        for (int i = 2; i < n; i++) {
            if (arr[i] != arr[index - 2]) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Create a new array to hold the result
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = arr[i];
        }

        return result;
    }
}
