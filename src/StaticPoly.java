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
