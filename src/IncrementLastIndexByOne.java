import java.util.Scanner;

public class IncrementLastIndexByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the largest integer in the form of array:");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        addIncrement(arr);
    }

    private static void addIncrement(int[] arr) {
        int size = arr.length;
        arr[size-1]++;
        System.out.print("the incremented largest value: ");
        for (int number : arr)
            System.out.print(number);
    }
}
