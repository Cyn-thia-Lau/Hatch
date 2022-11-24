package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class User_ {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
System.out.println("Welcome to Bank");
		
		while (true) {
		System.out.println("Please select from below: ");
		System.out.println("Press A to Withdraw amount "
				+ "\nPress B to Deposit amount \nPress C for loan queiries"
				+ "\nPress any other key to Exit"); ///-------
		String option = scan.nextLine();
		
		if (option.equalsIgnoreCase("A")) { ///add transation details
			System.out.println("Please enter the amount to withdraw: ");
			int withdrawal = scan.nextInt();
			System.out.println("£" + withdrawal + " is this the correct withdawal amount? \nYes or No ");
			scan.nextLine();
			String yesNo =  scan.nextLine();
			switch(yesNo) {
			case "Yes":
			System.out.println("£" + withdrawal + " will be withdrawn\n");
			case "No":
					System.out.println(); ///-------   	
			}try
			{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank1","root","Jichangwook57@");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from trandetails");
			
			while(rs.next())
			{
				System.out.println((rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4)
				+ "  " + rs.getString(5)+ "  " + rs.getString(6))); 
			}
			con.close();
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
					
		}else if (option.equalsIgnoreCase("B")) {
			System.out.println("Please enter the amount you would like to deposit: ");
			int deposit = scan.nextInt();
			System.out.println("£" + deposit + " is this the correct deposit amount? \nYes or No ");
			scan.nextLine();
			String yesNo1 = scan.nextLine();
			switch(yesNo1) {
			case "Yes":
			System.out.println("£" + deposit + " will be deposited\n");
			case "No":
					System.out.println(); ///-------   	
			}try
				{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank1","root","Jichangwook57@");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from trandetails");
				
				while(rs.next())
				{
					System.out.println((rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4)
					+ "  " + rs.getString(5)+ "  " + rs.getString(6))); 
				}
				con.close();
				}
				catch(Exception e)
				{
				System.out.println(e);
				}
		
		
		}else if (option.equalsIgnoreCase("C")) { //works
			System.out.println("Press \nA existing loan \nor \nB applying for a loan");
			String loan = scan.nextLine();
			
			
			
				if (loan.equalsIgnoreCase("A")) {
					System.out.println("Please enter custid"); 
					String custid = scan.nextLine();
					try
					{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank1","root","Jichangwook57@");
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("select * from loan");
					
					while(rs.next())
					{
						System.out.println((rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3))); 
					}
					con.close();
					}
					catch(Exception e)
					{
					System.out.println(e);
					}
					//----------------------
				}else if(loan.equalsIgnoreCase("B")) {
					System.out.println("Are you currently living within the UK? Select Yes or No");
					String yesNo3 = scan.nextLine();
					switch (yesNo3) {
					case "Yes":
					System.out.println("You are eligible for a loan!");
					case "No":
					System.out.println("You are not eigible for a loan!\n");
				
				}

		}
		}
				
	
		}
		}

		
	}
	
