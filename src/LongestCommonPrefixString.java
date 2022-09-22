import java.util.Scanner;

public class LongestCommonPrefixString {
    public String checkLongestPrefix(String[] arr)
    {
        int size = arr.length;
        int minLength = arr[0].length();
        String result = "";
        char current;
        for (int i = 1; i < size; i++)
        {
            if (arr[i].length() < minLength)
                minLength = arr[i].length();
        }
        for (int i = 0; i < minLength; i++)
        {
            current = arr[0].charAt(i);
            for (String item : arr)
            {
                if(item.charAt(i) != current)
                {
                    return result;
                }
            }
            result += current;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the array of Strings:");
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next();
        }
        LongestCommonPrefixString l = new LongestCommonPrefixString();
        String result = l.checkLongestPrefix(arr);
        if(result.length() != 0) {
            System.out.println("Longest common prefix is : " + result);
        }
        else
            System.out.println("common prefix is not present");
    }
}
