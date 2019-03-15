package mphasis;

import java.sql.*;
import java.util.*;

public class MainClass {
	public static void main(String[] args) throws Exception {

		Connection connection = null;
		connection = ConnecAss.getConnection();

		Statement st = connection.createStatement();
		st.execute("create table employee (empid number, name varchar2(30), email varchar2(20), salary number)");
		System.out.println("Table created");
		
		

	}
}
