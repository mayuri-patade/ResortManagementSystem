package resort.domain;

import java.util.Scanner;

public class Staff {

	public static void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t\t\tWelcome Staff.");
		int ch, ch2;
		char wish;
		x: do {
			System.out.println(
					"\n\t\t\t\t\t\tEnter your choice :\n\t\t\t\t\t\t1.Display room details\n\t\t\t\t\t\t2.Display room availability \n\t\t\t\t\t\t3.Display staff Details\n\t\t\t\t\t\t4.Exit\n");

			System.out.print("\t\t\t\t\tSelect your Choice : ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println(
						"\n\t\t\t\t\t\tChoose room type :\n\t\t\t\t\t\t1.Luxury Twin Room \n\t\t\t\t\t\t2.Deluxe Twin Room \n\t\t\t\t\t\t3.Luxury Solo Room \n\t\t\t\t\t\t4.Deluxe Solo Room\n");
				ch2 = sc.nextInt();
				ResortSubMenu.roomdetails(ch2);
				break;

			case 2:
				System.out.println(
						"\n\t\t\t\t\t\tChoose room type :\n\t\t\t\t\t\t1.Luxury Twin Room \n\t\t\t\t\t\t2.Deluxe Twin Room \n\t\t\t\t\t\t3.Luxury Solo Room\n\t\t\t\t\t\t4.Deluxe Solo Room\n");
				ch2 = sc.nextInt();
				ResortSubMenu.roomavailability(ch2);
				break;
				
			case 3:
				System.out.println("View Staff Details");
				ResortSubMenu.employeedetails();
				break;

			case 4:Info.exit();
			break;
				//break x;
			}
			System.out.println("\nContinue : (y/n)");
			wish = sc.next().charAt(0);
			if (!(wish == 'y' || wish == 'Y' || wish == 'n' || wish == 'N')) {
				System.out.println("Invalid Option");
				System.out.println("\nContinue : (y/n)");
				wish = sc.next().charAt(0);
			}

		} while (wish == 'y' || wish == 'Y');
	}
}
