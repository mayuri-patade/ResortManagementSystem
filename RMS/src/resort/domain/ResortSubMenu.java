package resort.domain;

import java.util.Scanner;

public class ResortSubMenu {
	static Scanner sc = new Scanner(System.in);

	static TwinRoom[] drl = new TwinRoom[10]; // Luxury Double Room
	static TwinRoom[] drd = new TwinRoom[20]; // Deluxe Double Room
	
	static SoloRoom[] srl = new SoloRoom[10]; // Luxury Single Room
	static SoloRoom[] srd = new SoloRoom[20]; // Deluxe Single Room

	public static void roomdetails(int ch) {
		switch (ch) {
		case 1:
			System.out.println("Number of double beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:5000 ");
			break;
		case 2:
			System.out.println("Number of double beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:3500  ");
			break;
		case 3:
			System.out.println("Number of single beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:2000  ");
			break;
		case 4:
			System.out.println("Number of single beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:1200 ");
			break;
		default:
			System.out.println("Enter valid option");
			break;
		}
	}

	public static void roomavailability(int ch) {
		int j, count = 0;
		switch (ch) {
		case 1:
			for (j = 0; j < 10; j++) {
				if (drl[j] == null)
					count++;
			}
			break;
		case 2:
			for (j = 0; j < drd.length; j++) {
				if (drd[j] == null)
					count++;
			}
			break;
		case 3:
			for (j = 0; j < srl.length; j++) {
				if (srl[j] == null)
					count++;
			}
			break;
		case 4:
			for (j = 0; j < srd.length; j++) {
				if (srd[j] == null)
					count++;
			}
			break;
		default:
			System.out.println("Enter valid option");
			break;
		}
		System.out.println("Number of rooms available : " + count);
	}

	public static void bookroom(int ch) {
		int i;
		int rn;
		System.out.println("Choose the room that you want to book: ");
		switch (ch) {
		case 1:
			for (i = 0; i < drl.length; i++) {
				if (drl[i] == null) {
					System.out.print(i + 1 + ",");
				}
			}
			System.out.print("\nEnter the room number that you want to select: ");
			try {
				rn = sc.nextInt();
				rn = rn - 1;
				if (drl[rn] != null)
					throw new NotAvailable();

				custDetail(ch, rn);
			} catch (Exception e) {
				System.out.println("Invalid Option");
				return;
			}
			break;
		case 2:
			for (i = 0; i < drd.length; i++) {
				if (drd[i] == null) {
					System.out.print(i + 11 + ",");
				}
			}
			System.out.print("\nEnter the room number that you want to select: ");
			try {
				rn = sc.nextInt();
				rn = rn - 11;
				if (drd[rn] != null)
					throw new NotAvailable();
				custDetail(ch, rn);
			} catch (Exception e) {
				System.out.println("Invalid Option");
				return;
			}
			break;
		case 3:
			for (i = 0; i < srl.length; i++) {
				if (srl[i] == null) {
					System.out.print(i + 31 + ",");
				}
			}
			System.out.print("\nEnter the room number that you want to select: ");
			try {
				rn = sc.nextInt();
				rn = rn - 31;
				if (srl[rn] != null)
					throw new NotAvailable();
				custDetail(ch, rn);
			} catch (Exception e) {
				System.out.println("Invalid Option");
				return;
			}
			break;
		case 4:
			for (i = 0; i < srd.length; i++) {
				if (srd[i] == null) {
					System.out.print(i + 41 + ",");
				}
			}
			System.out.print("\nEnter the room number that you want to select: ");
			try {
				rn = sc.nextInt();
				rn = rn - 41;
				if (srd[rn] != null)
					throw new NotAvailable();
				custDetail(ch, rn);
			} catch (Exception e) {
				System.out.println("Invalid Option");
				return;
			}
			break;
		default:
			System.out.println("Enter valid option");
			break;
		}
		System.out.println("Room Booked");
	}

	public static void custDetail(int ch, int rn) {
		String name, contact, gender;
		String name2 = null, contact2 = null;
		String gender2 = "";
		System.out.print("\nEnter customer name: ");
		name = sc.next();
		System.out.print("Enter contact number: ");
		contact = sc.next();
		System.out.print("Enter gender: ");
		gender = sc.next();
		if (ch < 3) {
			System.out.print("Enter second customer name: ");
			name2 = sc.next();
			System.out.print("Enter contact number: ");
			contact2 = sc.next();
			System.out.print("Enter gender: ");
			gender2 = sc.next();
		}

		switch (ch) {
		case 1:
			drl[rn] = new TwinRoom(name, contact, gender, name2, contact2, gender2);
			break;
		case 2:
			drd[rn] = new TwinRoom(name, contact, gender, name2, contact2, gender2);
			break;
		case 3:
			srl[rn] = new SoloRoom(name, contact, gender);
			break;
		case 4:
			srd[rn] = new SoloRoom(name, contact, gender);
			break;
		default:
			System.out.println("Wrong option");
			break;
		}
	}

	public static void order(int rn, int ch) {
		int i, q;
		char wish;
		try {
			System.out.println(
					"\n==========\n   Menu:  \n==========\n\n1.Sandwich\tRs.100\n2.Pasta\t\tRs.130\n3.Noodles\tRs.150\n4.Coke\t\tRs.60\n");
			do {
				System.out.print("Enter your choice- ");
				i = sc.nextInt();
				System.out.print("Quantity- ");
				q = sc.nextInt();
				switch (ch) {
				case 1:
					drl[rn].food.add(new Food(i, q));
					if (i > 4 || q <= 0)
						drl[rn].food.remove(drl[rn].food.size() - 1);
					break;
				case 2:
					drd[rn].food.add(new Food(i, q));
					if (i > 4 || q <= 0)
						drd[rn].food.remove(drd[rn].food.size() - 1);
					break;
				case 3:
					srl[rn].food.add(new Food(i, q));
					if (i > 4 || q <= 0)
						srl[rn].food.remove(srl[rn].food.size() - 1);
					break;
				case 4:
					srd[rn].food.add(new Food(i, q));
					if (i > 4 || q <= 0)
						srd[rn].food.remove(srd[rn].food.size() - 1);
					break;
				}
				System.out.println("Do you want to order anything else ? (y/n)");
				wish = sc.next().charAt(0);
			} while (wish == 'y' || wish == 'Y');

			System.out.println("Do you want to see the bill ? (y/n)");
			wish = sc.next().charAt(0);
			if (wish == 'y' || wish == 'Y') {
				bill(rn, ch);
			}
		} catch (NullPointerException e) {
			System.out.println("\nRoom not booked");
		} catch (Exception e) {
			System.out.println("Cannot be done");
		}
	}

	
	public static void bill(int rn, int ch) {
		double amount = 0;
		String[] list = { "Sandwich", "Pasta", "Noodles", "Coke" };
		System.out.println("\n*******");
		System.out.println(" Bill:-");
		System.out.println("*******");

		switch (ch) {
		case 1:
			amount += 5000;
			System.out.println("Room Charges: " + 5000);
			System.out.println("\n===============");
			System.out.println("Food Charges:- ");
			System.out.println("===============");
			System.out.println("Item   Quantity    Price");
			System.out.println("-------------------------");
			for (Food bi : drl[rn].food) {
				amount += bi.getPrice();
				String format = "%-10s%-10s%-10s%n";
				System.out.printf(format, list[bi.getItem_no() - 1], bi.getQuantity(), bi.getPrice());
			}
			break;
		case 2:
			amount += 3500;
			System.out.println("Room Charge - " + 3500);
			System.out.println("\nFood Charges:- ");
			System.out.println("===============");
			System.out.println("Item   Quantity    Price");
			System.out.println("-------------------------");
			for (Food bi : drd[rn].food) {
				amount += bi.getPrice();
				String format = "%-10s%-10s%-10s%n";
				System.out.printf(format, list[bi.getItem_no() - 1], bi.getQuantity(), bi.getPrice());
			}
			break;
		case 3:
			amount += 2000;
			System.out.println("Room Charge - " + 2000);
			System.out.println("\nFood Charges:- ");
			System.out.println("===============");
			System.out.println("Item   Quantity    Price");
			System.out.println("-------------------------");
			for (Food bi : srl[rn].food) {
				amount += bi.getPrice();
				String format = "%-10s%-10s%-10s%n";
				System.out.printf(format, list[bi.getItem_no() - 1], bi.getQuantity(), bi.getPrice());
			}
			break;
		case 4:
			amount += 1200;
			System.out.println("Room Charge - " + 1200);
			System.out.println("\nFood Charges:- ");
			System.out.println("===============");
			System.out.println("Item   Quantity    Price");
			System.out.println("-------------------------");
			for (Food bi : srd[rn].food) {
				amount += bi.getPrice();
				String format = "%-10s%-10s%-10s%n";
				System.out.printf(format, list[bi.getItem_no() - 1], bi.getQuantity(), bi.getPrice());
			}
			break;
		default:
			System.out.println("Not valid");
			break;
		}
		System.out.println("\nTotal Amount- " + amount);
	}

	
	public static void checkout(int rn, int i) {
		char w;

		switch (i) {
		case 1:
			if (drl[rn] != null)
				System.out.println("This room is occupied by " + drl[rn].getName());
			else {
				System.out.println("Room is already vaccant!!!");
				return;
			}
			System.out.println("Do you want to checkout ?(y/n)");
			w = sc.next().charAt(0);
			if (w == 'y' || w == 'Y') {
				bill(rn, i);
				drl[rn] = null;
				System.out.println("Room CheckOut succesfully");
			} else {
				System.out.println("\nEnter valid option :(y/n) ");
				checkout(rn, i);
			}
			break;

		case 2:
			if (drd[rn] != null)
				System.out.println("This room is occupied by " + drd[rn].getName());
			else {
				System.out.println("Room is already vaccant!!!");
				return;
			}
			System.out.println("Do you want to checkout ?(y/n)");
			w = sc.next().charAt(0);
			if (w == 'y' || w == 'Y') {
				bill(rn, i);
				drd[rn] = null;
				System.out.println("Room CheckOut succesfully");
			} else {
				System.out.println("\nEnter valid option :(y/n) ");
				checkout(rn, i);
			}
			break;

		case 3:
			if (srl[rn] != null)
				System.out.println("This room is occupied by " + srl[rn].getName());
			else {
				System.out.println("Room is already vaccant!!!");
				return;
			}
			System.out.println("Do you want to checkout ?(y/n)");
			w = sc.next().charAt(0);
			if (w == 'y' || w == 'Y') {
				bill(rn, i);
				srl[rn] = null;
				System.out.println("Room CheckOut succesfully");
			} else {
				System.out.println("\nEnter valid option :(y/n) ");
				checkout(rn, i);
			}
			break;

		case 4:
			if (srd[rn] != null)
				System.out.println("This room is occupied by " + srd[rn].getName());
			else {
				System.out.println("Room is already vaccant!!!");
				return;
			}
			System.out.println("Do you want to checkout ?(y/n)");
			w = sc.next().charAt(0);
			if (w == 'y' || w == 'Y') {
				bill(rn, i);
				srd[rn] = null;
				System.out.println("Room CheckOut succesfully");
			} else {
				System.out.println("\nEnter valid option :(y/n) ");
				checkout(rn, i);
			}
			break;

		default:
			System.out.println("\nEnter valid option :(y/n) ");
			checkout(rn, i);
			break;
		}

	}

	public static void employeedetails() {
		Employee[] arr = EmployeeOperation.getArray();
		EmployeeOperation.printRecord(arr);
		
	}

}
