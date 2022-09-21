public class DynamicPoly extends StaticPoly{
    @Override
    public void printer() {
        System.out.println("the DynamicPoly class printer method");
    }

    @Override
    public void display() {
        System.out.println("the DynamicPoly class display method");
    }

    public static void main(String[] args) {
        DynamicPoly dynamic = new DynamicPoly();
        dynamic.printer();
        dynamic.display();
    }
}
