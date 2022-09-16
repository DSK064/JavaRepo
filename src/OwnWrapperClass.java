
public class OwnWrapperClass {
    public static void main(String[] args) {
        IntToString i = new IntToString(10);
        System.out.println(i);
    }
}

class IntToString{
    public int number;
    public IntToString(int number)
    {
        this.number = number;
    }
    @Override
    public String toString()
    {
        return Integer.toString(number);
    }
}
