package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecordJDBC {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java200","root","root");
			//System.out.println(" successfully completed" +con);
			Statement  stmt = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println(" enter empid number for deleting row");
			System.out.println(" deleted");
			int res = stmt.executeUpdate("delete from ojasemployee where empid = +num");
			int num =sc.nextInt();
			//stmt.setInt(1, num);
			
			int result = stmt.executeUpdate("+num");
			stmt.close();
			con.close();
		}
		catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		
		}
		

	}

}
