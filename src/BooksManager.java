import java.util.Scanner;

public class BooksManager {
	 Books books;
	 Scanner input;
	 BooksManager(Scanner input) {
		 this.input = input;
	 }
	 
    public void checkedOut() {
    	books = new Books();
        System.out.print("title: ");
        books.title = input.next(); 
        System.out.print("Book Id: "); 
        books.id = input.nextInt();
        System.out.print("Lending date: "); 
        books.date = input.next();
    }
       
    public void returned() { 
        System.out.print("Book ID: ");
        int bookId = input.nextInt();
        if (books == null) {
        	System.out.println("the books have not been registered");
        	return;
        }
        if (books.id == bookId) {
        	books = null;
        	System.out.println("the books are deleted");
        }
    }
    
       
    public void editBooks() {
        System.out.print("Book ID: ");
        int bookId = input.nextInt();
        if (books.id == bookId) {
        	books = null;
        	System.out.println("the books to be edited are" + bookId);
        }
    }
       
    public void viewBooks() {
        System.out.print("book ID: ");
        int bookId = input.nextInt();
        if (books.id == bookId) {
        	books.printInfo();
        }
    }
}


