import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		int num =5;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("1. Add Books");
			System.out.println("2. Delete Books");
			System.out.println("3. Edit Books");
			System.out.println("4. View Books");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Sellect one number between 1-6:");
			num = input.nextInt();
			if (num == 1) {
				addBook();
				
			}
			else if (num == 2) {
				deleteBook();
				
			}
			else if (num == 3) {
				editBook();
				
			}
			else if (num == 4) {
				viewBook();
				
			}
			else {
				continue;
			}
		}
	}

	
	private static void viewBook() {

		
	}


	private static void editBook() {

		
	}


	private static void deleteBook() {

		
	}


	public static void addBook() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book ID:");
		 int BookId = input.nextInt();
		System.out.print("Book name:");
		String BooktName = input.next();
		System.out.print("Email address:");
		String BookEmail = input.next();
		System.out.println(BookEmail);
		System.out.print("Phone number:");
		String BookPhone = input.next();
	}
	
	public static void deleteStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book ID:");
		 int BookId = input.nextInt();
	}
	
	public static void editStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book ID:");
		 int BookId = input.nextInt();

	}

	public static void viewStudent() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book ID:");
		 int BookId = input.nextInt();

	}
	
}	
