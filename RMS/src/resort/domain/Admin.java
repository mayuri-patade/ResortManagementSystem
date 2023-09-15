package resort.domain;

import java.util.Scanner;

public class Admin {

	public static void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t\t\tWelcome Admin.");
		int ch, ch2, rn;
		char wish;
		x: do {
			System.out.println(
					"\n\t\t\t\t\t\tEnter your choice :\n\t\t\t\t\t\t1.Display room details\n\t\t\t\t\t\t2.Display room availability \n\t\t\t\t\t\t3.Book\n\t\t\t\t\t\t4.Checkout\n\t\t\t\t\t\t5.Exit\n");

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
				System.out.println(
						"\n\t\t\t\t\t\tChoose room type :\n\t\t\t\t\t\t1.Luxury Twin Room \n\t\t\t\t\t\t2.Deluxe Twin Room \n\t\t\t\t\t\t3.Luxury Solo Room\n\t\t\t\t\t\t4.Deluxe Solo Room\n");
				ch2 = sc.nextInt();
				ResortSubMenu.bookroom(ch2);
				break;

			case 4:
				System.out.println("Room Number: ");
				rn = sc.nextInt();
				if (rn > 60)
					System.out.println("Room doesn't exist");
				else if (rn > 40)
					ResortSubMenu.checkout(rn - 41, 4);
				else if (rn > 30)
					ResortSubMenu.checkout(rn - 31, 3);
				else if (rn > 10)
					ResortSubMenu.checkout(rn - 11, 2);
				else if (rn > 0)
					ResortSubMenu.checkout(rn - 1, 1);
				else
					System.out.println("Room doesn't exist");
				break;

			case 5:Info.exit();
			break;
				//break x;
			}
			System.out.println("\nContinue : (y/n)");
			wish = sc.next().charAt(0);
			if (!(wish == 'y' || wish == 'Y' || wish == 'n' || wish == 'N')) { //Other then y and n
				System.out.println("Invalid Option");
				System.out.println("\nContinue : (y/n)");
				wish = sc.next().charAt(0);
			}

		} while (wish == 'y' || wish == 'Y'); //Only y
	}
}
