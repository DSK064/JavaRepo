import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int lines = sc.nextInt();
        for(int i =1; i <= lines; i++)
        {
            int minValue = 65;
            for(int j = 1; j <= i; j++)
            {
                System.out.print((char)minValue);
                minValue++;
            }
            System.out.println();
        }
    }
}
