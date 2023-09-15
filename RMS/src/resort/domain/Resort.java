package resort.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

class Info {
	static Scanner sc = new Scanner(System.in);

	public static void start() {
		System.out.print(
				"\t\t _______________________________________________________________________________________\n");
		System.out.print("\t\t|											|\n");
		System.out.print("\t\t|											|\n");
		System.out.print("\t\t|											|\n");
		System.out.print("\t\t|											|\n");
		System.out.print("\t\t|											|\n");
		System.out.print("\t\t|											|\n");
		System.out.print("\t\t|			WELCOME TO RESORT MANAGEMENT SYSTEM			        |\n");
		System.out.print("\t\t|											|\n");
		System.out.print("\t\t|											|\n");
		System.out.print("\t\t|											|\n");
		System.out.print("\t\t|											|\n");
		System.out.print("\t\t|											|\n");
		System.out.print("\t\t|								-OWNED BY	        |\n");
		System.out.print("\t\t| 						  SANDESH NINAWE AND MAYURI PATADE	|\n");
		System.out.print("\t\t|											|\n");
		System.out.print("\t\t|											|\n");
		System.out.print(
				"\t\t|_______________________________________________________________________________________|\n");
	}

	public static int loginMenu() throws InputMismatchException{
		int ch;
		System.out.print(
				"\t\t _______________________________________________________________________________________\n");
		System.out.print("\t\t|				1.Login as Admin					|\n");
		System.out.print("\t\t|				2.Login as User					    	|\n");
		System.out.print("\t\t|				3.Login as Staff					|\n");
		System.out.print(
				"\t\t|_______________________________________________________________________________________|\n");
		System.out.print("\t				Select your Login Type : ");
		ch = sc.nextInt();
		return ch;
	}

	static void login() throws InputMismatchException {
		
		int a;
		String pass;
		System.out.print(
				"\t\t _______________________________________________________________________________________ \n");
		System.out.print("\n\t\t************************* WELCOME TO TREAT RESORT ************************************\n");
		System.out.print(
				"\t\t _______________________________________________________________________________________ \n");
		System.out.println("\n\n\t\t\t\t\t------------------------------");
		System.out.print("\t\t\t\t\t\t     LOGIN \n");
		System.out.print("\t\t\t\t\t------------------------------\n\n");
		System.out.print("\t\t\t\t\tEnter the Password: ");

		
			pass = sc.next();
			if (pass.equals("admin")) {
				System.out.print("\n\n\t\t\t\t\tAccess Granted!\n");
				pressAnyKeyToContinue();
				Admin.login();
			} else if (pass.equals("user")) {
				System.out.print("\n\n\t\t\t\t\tAccess Granted!\n");
				pressAnyKeyToContinue();
				User.login();
			} else if (pass.equals("staff")) {
				System.out.print("\n\n\t\t\t\t\tAccess Granted!\n");
				pressAnyKeyToContinue();
				Staff.login();
			} else {
				System.out.print("\n\n\t\t\t\t\tAccess Aborted...\n\t\t\t\t\t1.Try Again\n\n\t\t\t\t\t2.Exit");
				System.out.print("\n\n\t\t\t\t\tEnter the option: ");
				try {
					a = sc.nextInt();
					if (a == 1)
						login();
					else if (a == 2)
						Info.exit();
					else {
						System.out.print("\n\n\t\t\t\t\tInvalid Choice Login Again\n");
						Info.loginMenu();
					}
				} catch (InputMismatchException e) {
					System.out.println("\n\n\t\t\t\t*Enter the correct option!*\n\n");
				}
			}
		}

	

	private static void pressAnyKeyToContinue() {
		System.out.println("Press Enter key to continue...");
		try {
			System.in.read();

		} catch (Exception e) {
			System.out.println("Press 'Enter' key to continue!");
		}
	}

	public static void exit() {
		System.out.print(
				"\t\t _______________________________________________________________________________________\n");
		System.out.print("\t\t|											|\n");
		System.out.print("\t\t|											|\n");
		System.out.print("\t\t|			Thank you For Visiting TO OUR RESORT				|\n");
		System.out.print("\t\t|									        	|\n");
		System.out.print("\t\t| 						  					|\n");
		System.out.print(
				"\t\t|_______________________________________________________________________________________|\n");
		System.exit(0);
	}
}

public class Resort {

	public static void main(String args[]) {

		Info.start();
		try {
			while ((Info.loginMenu()) != 0) {
				Info.login();
			
			}
		} catch (InputMismatchException e) {
			System.out.println("\n\n\t\t\t\t*Enter the correct option!*\n\n");
		}
		Info.login();
		Info.exit();
	}

}
