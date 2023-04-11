import java.util.Scanner;

public class MenuManager {
    public static void main(String[] args) {
        int num = 5;
        Scanner input = new Scanner(System.in);
        
        while (num != 6) {
            System.out.println("1. Checked-out Books");
            System.out.println("2. Returned Books");
            System.out.println("3. Edit Book Number");
            System.out.println("4. View All Books");
            System.out.println("5. Show a Menu");
            System.out.println("6. Exit");
            System.out.println("Select one number between 1-6: "); 
            num = input.nextInt();

            if (num == 1) {
                checkedOut();
            } else if (num == 2) {
                returned();    
            } else if (num == 3) {
                editBooks();    
            } else if (num == 4) {
                viewBooks();
            } else {
                continue;
            }
        }
    }

    public static void checkedOut() {
        Scanner input = new Scanner(System.in); 
        System.out.print("Student name: ");
        String studentName = input.next();
        System.out.print("Book title: "); 
        String bookTitle = input.next(); 
        System.out.print("Book Id: "); 
        String bookId = input.next();
        System.out.print("Lending date: "); 
        String lendingDate = input.next();
        System.out.print("Phone number: ");
        int phoneNumber = input.nextInt();
    }
       
    public static void returned() { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Book Id: ");
        int bookId = input.nextInt(); 
    }
       
    public static void editBooks() {
        Scanner input = new Scanner(System.in); 
        System.out.print("Book Id: ");
        int bookId = input.nextInt(); 
    }
       
    public static void viewBooks() {
        Scanner input = new Scanner(System.in); 
        System.out.print("Student ID: ");
        int studentId = input.nextInt(); 
    }
}

	



