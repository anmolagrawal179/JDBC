import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Anmol@123");
			Statement st =con.createStatement();
			st.executeUpdate("create table tab(id int primary key, name varchar(20))");
			st.executeUpdate("insert into tab values(1,'Anmol')");
			st.executeUpdate("insert into tab values(2,'Aryabh')");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
