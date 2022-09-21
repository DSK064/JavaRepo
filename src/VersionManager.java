import java.util.Scanner;

class RollBackException extends Throwable {
    public RollBackException(String str) {
        super(str);
    }
}
class Manager extends Throwable{
    public int major;
    public int minor;
    public int patch;
    public int previousMajor = -1;
    public int previousMinor = -1;
    public int previousPatch = -1;
    public Manager(int major, int minor, int patch)
    {
        this.major = major;
        this.minor = minor;
        this.patch = patch;
    }
    public void major()
    {
        previousMajor = major;
        previousMinor = minor;
        previousPatch = patch;
        major++;
        minor = 0;
        patch = 0;
    }
    public void minor()
    {
        previousMinor = minor;
        previousPatch = patch;
        minor++;
        patch = 0;
    }
    public void patch()
    {
        previousPatch = patch;
        patch++;
    }
    public void rollback() throws RollBackException {
        if(previousMajor == -1 && previousMinor == -1 && previousPatch == -1)
            throw new RollBackException("Can not roll back");
        else
        {
            if(previousMajor != -1)
            {
                major = previousMajor;
                previousMajor = -1;
            }
            if(previousMinor != -1)
            {
                minor = previousMinor;
                previousMinor = -1;
            }
            if(previousPatch != -1)
            {
                patch = previousPatch;
                previousPatch = -1;
            }
        }
    }
    public String release()
    {
        return (major+"."+minor+"."+patch);
    }
}
public class VersionManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial version:");
        String iv = sc.nextLine();
        String[] input = iv.split(".");
        int major, minor, patch;
        major = Integer.parseInt(input[0]);
        minor = Integer.parseInt(input[1]);
        patch = Integer.parseInt(input[2]);
        Manager manager = new Manager(major, minor, patch);
        while (true) {
            System.out.println("----------------");
            System.out.println("1. Major");
            System.out.println("2. Minor");
            System.out.println("3. Patch");
            System.out.println("4. Rollback");
            System.out.println("5. Exit");
            System.out.println("----------------");
            System.out.print("Enter the choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    manager.major();
                    break;
                case 2:
                    manager.minor();
                    break;
                case 3:
                    manager.patch();
                    break;
                case 4:
                    try {
                        manager.rollback();
                    }
                    catch (RollBackException e)
                    {
                        System.out.println("Exception occurred!!");
                        System.out.println(e);
                    }
                    break;
                case 5:
                    System.out.println("Changes saves");
                    System.out.print("Final released version is:");
                    System.out.println(manager.release());
                    System.exit(0);
            }
        }


    }
}
