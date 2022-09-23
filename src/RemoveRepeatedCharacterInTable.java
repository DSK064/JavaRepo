import java.util.*;

public class RemoveRepeatedCharacterInTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of table:");
        System.out.print("enter the number of keys: ");
        int number = sc.nextInt();
        HashMap<Integer, HashSet<Character>> hMap = new HashMap<>();
        System.out.println("Enter the character values as strings:");
        for (int i = 1; i <= number; i++)
        {
            ArrayList<Character> aList = new ArrayList<>();
            String str = sc.next();
            for(int j = 0; j < str.length();j++) {
                aList.add(str.charAt(j));
            }
            HashSet<Character> set = new HashSet<>(aList);
            hMap.put(i, set);
        }
        System.out.println(hMap);
    }


}
