package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class CreatingTable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java200","root","root");
			System.out.println(" successfully completed" +con);
			Statement  stmt = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println(" enter enum,ename,age");
			stmt.executeUpdate("create table ojasemployee(empid int primary key,ename varchar(20),eage int) ");
			System.out.println(" ya got it");
			stmt.close();
			con.close();
			
	
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

		
	}


