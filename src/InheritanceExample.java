interface FirstInterface {
    int i = 1;
    void printer();
}
interface SecondInterface {
    int j = 2;

    void display();
}
public class InheritanceExample extends Second implements FirstInterface,SecondInterface {
    public static void main(String[] args) {
        InheritanceExample i1 = new InheritanceExample();
        i1.firstPrinter();
        System.out.println(i1.firstVar);
        i1.setSecondPrinter();
        System.out.println(i1.secondVar);
        i1.printer();
        i1.display();


    }

    @Override
    public void printer() {
        System.out.println("FirstInterface printer");
    }

    @Override
    public void display() {
        System.out.println("SecondInterface printer");

    }
}


