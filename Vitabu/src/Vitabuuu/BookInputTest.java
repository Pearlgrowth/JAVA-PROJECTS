package Vitabuuu;
import java.util.Scanner;
public class BookInputTest {
    public static void main(String[] args) {
        Book myBook = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the title of the book ");
        myBook.title = scanner.nextLine();
        System.out.print("Please enter the author name ");
        myBook.author = scanner.nextLine();
        System.out.print("Please enter the number of pages ");
        myBook.numberOfPages = scanner.nextInt();
        System.out.println("The book title is: " + myBook.title);
        System.out.println("The book author is: " + myBook.author);
        System.out.println("The book has: " + myBook.numberOfPages+"pages" );
        scanner.close();
    }
}
