
import java.util.Iterator;
import java.util.Scanner;

class MyIterator {
    int[] arr;
    int pointer = 0;

    public MyIterator(int[] arr) {
        this.arr = arr;
    }


    public boolean hasNext() {
        return (pointer != (arr.length-1));
    }


    public int next() {
        pointer++;
        return arr[pointer];
    }

    public int peek()
    {
        return arr[pointer+1];
    }

}
public class PeekIterator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the integer array:");
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        MyIterator myIterator = new MyIterator(arr);
        System.out.println(myIterator.next());
        System.out.println(myIterator.hasNext());
        System.out.println(myIterator.peek());


    }
}
