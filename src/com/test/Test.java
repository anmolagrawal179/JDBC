package com.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
			Statement st =con.createStatement();
			st.executeUpdate("create table tab(id int primary key auto_increment, name varchar(20) not null)");
			st.executeUpdate("insert into tab (name) values ('Anmol')");
			st.executeUpdate("insert into tab (name) values ('Aryabh')");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
