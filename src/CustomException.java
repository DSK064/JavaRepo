import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        try {
            checkAge(age);
        }
        catch (InvalidAgeException e)
        {
            System.out.println("Exception occurred!!");
            System.out.println(e);
        }
        finally {
            System.out.println("Thank you..");
        }


    }

    public static void checkAge(int age) throws InvalidAgeException {
        if(age < 18)
            throw new InvalidAgeException("You are not eligible for vote.");
        else
            System.out.println("Please vote");


    }
}
class InvalidAgeException extends Throwable {
    public InvalidAgeException(String str)
    {
        super(str);
    }
}
