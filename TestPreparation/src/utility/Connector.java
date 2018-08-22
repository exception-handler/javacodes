package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
	static Connection con=null;
	public static Connection connection()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			return con;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
