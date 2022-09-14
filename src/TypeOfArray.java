import java.util.Scanner;

public class TypeOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements:");
        for(int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        int result = checkArray(size, arr);
        if(result == 1)
        System.out.println("It is an even array");
        else if (result == 2) {
            System.out.println("It is an odd array");
        }
        else
            System.out.println("It is a mixed array");
    }
    public static int checkArray(int n, int[] A)
    {
        int odd = 0, even = 0;
        for(int i = 0; i < n; i++)
        {
            if(A[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        if(even > 0 && odd == 0)
            return 1;
        else if((odd > 0) && (even == 0))
            return 2;
        else
            return 3;
    }
}
