import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check the day:");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("It's a Sunday");
                break;
            case 2:
                System.out.println("It's a Monday");
                break;
            case 3:
                System.out.println("It's a Tuesday");
                break;
            case 4:
                System.out.println("It's a Wednesday");
                break;
            case 5:
                System.out.println("It's a Thursday");
                break;
            case 6:
                System.out.println("It's a Friday");
                break;
            case 7:
                System.out.println("It's a Saturday");
                break;
            default:
                System.out.println("Please select the correct choice!!");
        }
    }
}
