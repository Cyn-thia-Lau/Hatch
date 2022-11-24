package Main;

import java.util.Scanner;
public class Main_ {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Bank");
		
		System.out.println("Are you a user or an admin?");
		String userAdmin = scan.nextLine();
		
		if (userAdmin.equals("user")) {
			System.out.println("Confirm user? yes or no");
			String confirmation = scan.nextLine();
			int pin = 983;
			System.out.println("Please enter pin");
			pin = scan.nextInt();
			System.out.println("Verification complete"); //-------
		}else {
		System.out.println("Admin ID");
		String username = scan.nextLine();
		System.out.println("Password");
		String password = scan.nextLine();
		System.out.println("Verification complete");
	
		
		}
	}
	}
	

