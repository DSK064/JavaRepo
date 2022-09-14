import java.util.Scanner;

public class FindingTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows and coloumns:");
        int rows = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Enter the tree number:");
        int treeNum = sc.nextInt();

        if((treeNum >=1 && treeNum <= rows) || (treeNum % col == 0) || (treeNum % rows == 1))
            System.out.println("The tree is mango tree");
        else
            System.out.println("The tree is not a mango tree");
    }
}
