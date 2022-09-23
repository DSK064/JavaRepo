import java.util.ArrayList;
import java.util.Scanner;

class BrowserHistoryClass{
    ArrayList<String> History = new ArrayList<>();
    int current=-1;
    public void homepage() {
        System.out.println("Welcome to browser home page..");
    }
    public void visitPage(String URL){
        History.add(current+1, URL);
        current++;
        if(current != (History.size() - 1)){
            History.subList(current+1, History.size()).clear();
            //System.out.println(History);
        }
        System.out.println("You've moved to "+URL);
    }
    public void backTab(int steps){
        if (steps > current)
            steps = current;
        current -= steps;
        System.out.println("You've moved to "+History.get(current));
    }
    public void forwardTab(int steps){
        if(steps>(History.size()-current - 1))
            steps=(History.size()-current - 1);
        current += steps;
        System.out.println("You've moved to "+History.get(current));
    }
}

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BrowserHistoryClass tab = new BrowserHistoryClass();
        String  url;
        int count;
        System.out.println("Enter the commands:");
        System.out.println("1. BrowserHistory");
        System.out.println("2. Visit");
        System.out.println("3. Back");
        System.out.println("4. Forward");
        System.out.println("5. Exit");
        while (true) {
            System.out.println("enter the commands:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    tab.homepage();
                    break;
                case 2:
                    System.out.print("Enter URL: ");
                    url = sc.next();
                    tab.visitPage(url);
                    break;
                case 3:
                    System.out.print("Enter steps to backward:");
                    count = sc.nextInt();
                    tab.backTab(count);
                    break;
                case 4:
                    System.out.print("Enter steps to forward:");
                    count = sc.nextInt();
                    tab.forwardTab(count);
                    break;
                case 5:
                    System.out.println("Thank you for visiting our website");
                    break;
                default:
                    System.out.println("please enter the correct choice!!");
                    System.exit(0);
            }
        }
    }
}