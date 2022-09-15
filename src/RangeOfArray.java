import java.util.Arrays;
import java.util.Scanner;

public class RangeOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        int range = checkRange(size, arr);
        System.out.println("Range is: "+range);
    }
    public static int checkRange(int n, int[] arr)
    {
        Arrays.sort(arr);
        return arr[n-1] - arr[0];
    }
}
