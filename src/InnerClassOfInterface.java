
interface OuterDemo {
    // private variable of the outer class
    int num = 175;

    // inner class
    class InnerDemo {
        public void getNum() {
            System.out.println("This is the getnum method of the inner class");
            System.out.println(num);
        }
    }
}

public class InnerClassOfInterface implements OuterDemo {

    public static void main(String[] args)
    {
        InnerDemo i = new InnerDemo();
        i.getNum();
    }
}