import java.util.Scanner;

public class Book{

    boolean isOpen;
    String contentGenre;
    int numberOfPages;
    String bookName;
    String bookAuthor;
    int currentPage;
    String bookCoverType;

    Scanner scan = new Scanner (System.in);

    public Book(String contentGenre, int numberOfPages, String bookName, String bookAuthor){
        this.isOpen = false;
        this.currentPage = 0;
    }

    public void openBook(){
        this.isOpen = true;
        System.out.println("The book was openned...");
    }

    public void openBookIn(){
        System.out.println("In what page do you want to open the book?\nR: ");
        currentPage = scan.nextInt();
        System.out.println("You openned the book in the page " + currentPage  );
    }

    public void turnThePage(){
        this.currentPage = this.currentPage + 1;
    }

    public void turnBackThePage(){
        this.currentPage = this.currentPage + 1;
    }
}
