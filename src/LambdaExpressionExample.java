interface Display
{
    void print();
}

interface DisplayArgument
{
    int SumOfArray(int[] arr);
}
public class LambdaExpressionExample {
    public static void main(String[] args) {
        Display check = () ->
                System.out.println("Hello");
        check.print();


        int[] array = {1, 2, 3, 4, 5};
        DisplayArgument display = (arr) -> {
            int sum = 0;
            for(int item : arr)
                sum += item;
            return sum;
        };
        System.out.println(display.SumOfArray(array));

    }
}
