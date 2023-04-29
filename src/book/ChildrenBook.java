package book;

import java.util.Scanner;

public class ChildrenBook extends Book {
	public void getUserInput(Scanner input) {
		System.out.print("title: ");
		String title = input.next();
		this.setTitle(title);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {

			System.out.print("Do you have an Book Id? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Book Id: ");
				int id = input.nextInt();
				this.setId(id);
				break;
			} else if (answer == 'n' || answer == 'N') {
				this.setId(0);
				break;
			} else {

			}
		}

		System.out.print("Book Id: ");
		int id = input.nextInt();
		this.setId(id);

		System.out.print("Lending date: ");
		String date = input.next();
		this.setDate(date);

	}

}
