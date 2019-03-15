package mphasis;

import java.sql.*;

public class ConnecAss {
	private static Connection connection;
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" ,"system","tiger");
		return connection;
		
	}
	

}
