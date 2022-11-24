package Main;
import java.sql.*;
import java.util.Scanner;
public class Admin_ {
	public static void main(String[] args) {
	
		String custid ;
		String fname;
		String ltname;
		String mname;
		String city;
		long mobileno;
		String occupation;
		String dob;
		String newCust;
		String acnumber; 
		String atype;
		int openingbalance; 
		String AOD; 
		String tacc;
		String branch;
		String bid; 
		String bname; 
		String bcity;
		String astatus;
		
		
		
		while (true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose an option:");
		System.out.println("\nPress A - Add new customer \nPress B - View customer details \nPress C - Add new account \nPress D - View customer account "
				+ "\nPress E - Add new branch \nPress F - View branch \nPress G - View loan details \nPress H - View transaction details");
		String choice = scan.nextLine();
		
		switch (choice) {
		
		case "A": // works
					System.out.println("You have chosen to add a new customer \nEnter Customer ID: ");
			        custid = scan.nextLine();  
			        System.out.print("Enter First name: ");  
			        fname = scan.nextLine();  
			        System.out.print("Enter Last name: ");  
			        ltname = scan.nextLine();  
			        System.out.print("Enter Middle name: ");  
			        mname = scan.nextLine();  
			        System.out.println("City: ");
			        city = scan.nextLine();
			        System.out.println("Mobile Number: ");
			        mobileno = scan.nextLong();
			        System.out.println("Occupation: ");
			        scan.nextLine();
			        occupation = scan.nextLine();
			        System.out.println("Date of Birth: ");
			        dob = scan.nextLine();
			try 
			{ 
				Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Jichangwook57@");
			PreparedStatement stm = con.prepareStatement(" INSERT INTO customer  VALUES(?,?,?,?,?,?,?,?);"); 
			stm.setString(1, custid); 
			stm.setString(2, fname); 
			stm.setString(3, ltname); 
			stm.setString(4, mname); 
			stm.setString(5, city); 
			stm.setLong(6, mobileno); 
			stm.setString(7, occupation); 
			stm.setString(8, dob);
			int i= stm.executeUpdate(); 
			System.out.println(i+ " records inserted");    
			con.close(); 
			} 
			catch(Exception e) 
			{ 
			System.out.println(e); 
			} 
				
			break;
		case "B": //??????????????
			System.out.println("Enter customer ID");
			custid = scan.next();
			if (custid.equalsIgnoreCase(custid)) {
				System.out.println("Here are the customer details");
				try
				{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank1","root","Jichangwook57@");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from customer");
				
				while(rs.next())
				{
					System.out.println((rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString(4) + " " 
			 + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " " + rs.getString(8))); 
				}
				con.close();
				}
				catch(Exception e)
				{
				System.out.println(e);}
			}else {
				System.out.println("Invalid customer ID");}
				
		break;
		case "C"://--------?
			System.out.println("You have chosen to add a new account \nEnter Account No:"); 
	        acnumber = scan.nextLine();  
	        System.out.print("Enter Account type: ");  
	        atype = scan.nextLine();  
	        System.out.print("Enter Customer Id: ");  
	        custid = scan.nextLine();  
	        System.out.print("Enter branch Id: ");  
	        bid = scan.nextLine();
	        System.out.print("Enter Balance: ");  
	        openingbalance = scan.nextInt();  
	        System.out.println("Account opening date: ");
	        AOD = scan.nextLine(); 
	        scan.nextLine();  
	        System.out.println("Status"); 
	        astatus = scan.nextLine();
	        
		try{ 
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Jichangwook57@");
			PreparedStatement stm = con.prepareStatement(" INSERT INTO account  VALUES(?,?,?,?,?,?,?);"); 
			stm.setString(1, acnumber); 
			stm.setString(2, atype); 
			stm.setString(3, custid); 
			stm.setString(4, bid); 
			stm.setInt(5, openingbalance); 
			stm.setString(6, AOD); 
			stm.setString(7, astatus); 
			int i= stm.executeUpdate(); 
			System.out.println(i+ " records inserted");    
			con.close(); 
			} 
			catch(Exception e) 
			{ 
			System.out.println(e);
			} 
			
		break;
		case "D": //works only show if not else if
			System.out.println("Enter account number: ");
			acnumber = scan.next();
			if (acnumber == acnumber) {
				System.out.println("Here are the account details");
			try
			{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank1","root","Jichangwook57@");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from account");
			
			while(rs.next())
			{
				System.out.println((rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString(4) + " " 

		 + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7))); 
			}
			con.close();
			}
			catch(Exception e)
			{
			System.out.println(e);
			}	}else if (!acnumber.equals(acnumber)) { 
				System.out.println("Invalid account number");}
		
			
		break;
		case "E": // works
			System.out.println("You have chosen to add new branch \nEnter branch id:");
				bid = scan.next();
				System.out.println("Enter branch name: ");
				bname = scan.next();
				System.out.println("Enter branch city: ");
				bcity = scan.next();
			try{ 
				Class.forName("com.mysql.jdbc.Driver"); 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Jichangwook57@");
				PreparedStatement stm = con.prepareStatement(" INSERT INTO branch  VALUES(?,?,?);"); 
				stm.setString(1, bid); 
				stm.setString(2, bname); 
				stm.setString(3, bcity); 
				int i= stm.executeUpdate(); 
				System.out.println(i+ " records inserted");    
				con.close(); 
				} 
				catch(Exception e) 
				{ 
				System.out.println(e);
				}
		break;
		case "F": //worksssssss
			System.out.println("Viewing branch details");
			try
			{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank1","root","Jichangwook57@");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from branch");
			
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
			
			break;
		case "G": //I guess works, no invalid return
			System.out.println("To view loan details please enter both customer id:  ");
			custid = scan.next();
			System.out.println("branch id: ");
			bid = scan.next();
			if (custid.equalsIgnoreCase(custid)){
				System.out.println("Here are your loan details");
				}else {
				System.out.println("Invalid id, please try again");}	
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
		
			
		break; // works
		case "H":
			System.out.println("Viewing transaction details");
			try
			{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank1","root","Jichangwook57@");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from trandetails");
			while(rs.next())
			{
				System.out.println((rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3))); 
			}
			con.close();
			}
			catch(Exception e)
			{
			System.out.println(e); }
		break;
		default:
		System.out.println("Invalid request, go back to options");
		
		scan.close();

	}

	}
	}
}


