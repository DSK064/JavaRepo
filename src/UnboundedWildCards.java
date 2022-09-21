import java.util.ArrayList;
import java.util.List;
class Test
{
    public void showList(List<?> list)
    {
        System.out.println(list);
    }
}
public class UnboundedWildCards {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Test t1 = new Test();
        t1.showList(list);
    }


}
