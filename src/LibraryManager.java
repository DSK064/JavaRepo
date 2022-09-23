import java.util.Scanner;

class Library{
    public String video;
    public String book;
    public String newsPaper;

    public Library(String video, String book, String newsPaper) {
        this.video = video;
        this.book = book;
        this.newsPaper = newsPaper;
    }
    public void displayLibrary()
    {
        System.out.println("book = "+book+"\n"+"video = "+video+"\n"+"newspaper = "+newsPaper);
    }
}

class GenericLibrary <T>
{
    T book, video, newsPaper;

    public GenericLibrary(T video, T book, T newsPaper) {
        this.book = book;
        this.video = video;
        this.newsPaper = newsPaper;
    }
    public void printGenericLibrary()
    {
        System.out.println("book = "+book+"\n"+"video = "+video+"\n"+"newspaper = "+newsPaper);
    }
}
public class LibraryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the media as video, book, newspaper:");
        String video = sc.nextLine();
        String book = sc.nextLine();
        String newsPaper = sc.nextLine();
        Library media1 = new Library(video, book, newsPaper);
        System.out.println("Library has:");
        media1.displayLibrary();
        System.out.println("--------------------");

        GenericLibrary<String> genericMedia = new GenericLibrary<>(video, book, newsPaper);
        System.out.println("GenericLibrary has:");
        genericMedia.printGenericLibrary();
    }
}
