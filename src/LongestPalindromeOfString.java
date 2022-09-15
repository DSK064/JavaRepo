import java.util.Scanner;

public class LongestPalindromeOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();

        int low, high;
        int first = 0, last = 0;
        for (int i = 0; i < str.length(); i++) {
            low = i;
            high = i + 1;
            while ((low >= 0) && (high < str.length()) && (str.charAt(low)) == str.charAt(high)) {
                if ((high - low) > last) {
                    first = low;
                    last = high - low;
                }
                low--;
                high++;
            }

            low = i;
            high = i + 2;
            while ((low >= 0) && (high < str.length()) && (str.charAt(low)) == str.charAt(high)) {
                if ((high - low) > last) {
                    first = low;
                    last = high - low;
                }
                low--;
                high++;
            }
        }

        int startIndex = first;
        int finalIndex = first + last;
        if((startIndex == 0) && (finalIndex == 0))
            System.out.println("Palindrome is not present in the given String");
        else {
            System.out.println("Longest palindrome is:");
            for (int i = startIndex; i <= finalIndex; i++)
                System.out.print(str.charAt(i));
        }
    }

}
