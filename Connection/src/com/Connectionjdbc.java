package com;
import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;


public class Connectionjdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java200","root","root");
			System.out.println(" successfully completed" +con);
			Statement  stmt = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println(" enter enum,ename,age");
		    int res = stmt.executeUpdate("insert into ojasemployee values(4,'reddy',25 )");
			int num =sc.nextInt();
		    String name = sc.next();
		    int age = sc.nextInt();
		    int result = stmt.executeUpdate("(+num+,");
			System.out.println(" ya got it");
			stmt.close();
			con.close();
			
	
		}
		catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		
	}

}
