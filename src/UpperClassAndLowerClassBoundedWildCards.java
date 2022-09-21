import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperClassAndLowerClassBoundedWildCards {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Double> list2 = Arrays.asList(4.0,5.0,6.0);
        upperBoundMethod(list1);
        upperBoundMethod(list2);

        List<Integer> list3 = Arrays.asList(9, 7 ,4);
        lowerBoundMethod(list3);

    }
    public static void upperBoundMethod(List<? extends Number> list)
    {
        System.out.println(list);
    }

    public static void lowerBoundMethod(List<? super Integer> list)
    {
        System.out.println(list);
    }
}
