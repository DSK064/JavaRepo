import java.util.Scanner;

public class FindNextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the numbers of array:");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        findPermutation(arr);
    }

    private static void findPermutation(int[] arr)
    {
        int size = arr.length;
        int lastIndex = size - 2;                                           //   2 3 1 ->  3 1 2
        while (lastIndex >= 0 && arr[lastIndex] >= arr[lastIndex+1]) {
            lastIndex--;
        }
        if(lastIndex >= 0)
        {
            int highIndex = size - 1;
            while ((highIndex >= 0) && arr[highIndex] <= arr[lastIndex])
            {
                highIndex--;
            }
            swap(arr, lastIndex, highIndex);
        }

        reverse(arr,lastIndex+1);
        System.out.println("The next palindrome is : ");

        for (int item : arr)
        {
            System.out.print(item+" ");
        }
    }

    private static void reverse(int[] arr, int i) {
        int size = arr.length-1;
        while (i<size) {
            swap(arr, i, size);
            i++;
            size--;
        }
    }

    private static void swap(int[] arr, int lastIndex, int highIndex) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[highIndex];
        arr[highIndex] = temp;
    }
}
