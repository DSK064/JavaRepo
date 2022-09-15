import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of square:");
        int size = sc.nextInt();
        int[][] square = new int[size][size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                square[i][j] = sc.nextInt();
        }
        if(isMagicSquare(size, square))
            System.out.println("Yes, It's a magic square");
        else
            System.out.println("No");
    }
    public static boolean isMagicSquare(int size, int[][] square)
    {
        int diSum1 = 0;
        int diSum2 = 0;
        for(int i = 0; i < size; i++)
        {
            diSum1 = diSum1 + square[i][i];
        }
        for (int j = 0; j < size; j++)
        {
            diSum2 = diSum2 + square[j][size-1-j];
        }
        if(diSum1 != diSum2)
            return false;
        for (int i =0; i < size; i++)
        {
            int rowSum = 0;
            for (int j = 0; j < size; j++)
            {
                rowSum = rowSum + square[i][j];
            }
            if(rowSum != diSum1)
                return false;
        }
        for (int i =0; i < size; i++)
        {
            int colSum = 0;
            for (int j = 0; j < size; j++)
            {
                colSum = colSum + square[j][i];
            }
            if(colSum != diSum1)
                return false;
        }
        return true;
    }
}
