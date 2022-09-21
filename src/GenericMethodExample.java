public class GenericMethodExample{

    public <T, U> void printer(T t, U u)
    {
        System.out.print(t+"\t");
        System.out.println(u);
    }

    public static void main(String[] args) {
        GenericMethodExample genericsObj1 = new GenericMethodExample();
        genericsObj1.printer("GenericsValue", 2.2);
        GenericMethodExample genericsObj2 = new GenericMethodExample();
        genericsObj2.printer(25, 3.4);
    }
}
