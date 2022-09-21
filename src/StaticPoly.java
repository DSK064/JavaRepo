class Third extends First{
    int thirdVar = 30;

    public void thirdPrinter() {
        System.out.println("third class printer method");
    }
}
class Second extends First{
    int secondVar = 20;
    public void setSecondPrinter()
    {
        System.out.println("second class printer method");
    }
}

class First {
    int firstVar = 10;

    public void firstPrinter() {
        System.out.println("first class printer method");
    }
}

public class StaticPoly {
   public int addAll(int a, int b) {
        return a + b;
    }
   public int addAll(int a, int b, int c) {
        return a + b + c;
    }
    public void printer()
    {
        System.out.println("the staticPoly class printer method");
    }
    public void display()
    {
        System.out.println("the stticPoly class display method");
    }
    public static void main(String[] args) {
        StaticPoly stat = new StaticPoly();
        System.out.println(stat.addAll(1,2));
        System.out.println(stat.addAll(4,6,2));
        stat.printer();

    }
}
