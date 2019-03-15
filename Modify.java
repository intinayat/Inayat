package mphasis;
import java.sql.*;
import java.util.Scanner;

public class Modify {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Connection connection = null;
		connection = ConnecAss.getConnection();
		
		
		System.out.println("Enter your choice 1. Insert  2.Update  3.Delete  4.Select");
		int ch=sc.nextInt();
		switch(ch){
		
		case  1 :
		PreparedStatement ps = connection.prepareStatement("insert into employee values(?,?,?,?)");
		System.out.println("Insert values in employee table");
		int empid = sc.nextInt();
		String name= sc.next();
		String email=sc.next();
		int salary = sc.nextInt();
		ps.setInt(1, empid);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setInt(4, salary);
		ps.execute();
		System.out.println("Data Inserted");
		break;
		
	
		case 2:
		PreparedStatement gs = connection.prepareStatement("update  employee set salary=?  where empid=? ");
		System.out.println("enter empid to update");
		int empid1=sc.nextInt();
		System.out.println("enter salary to update");
		String salary1=sc.next();
		gs.setString(1, salary1);
		gs.setInt(2, empid1);
		

		gs.executeUpdate();
		System.out.println("Data updated");
		break;
		
		case 3:
			PreparedStatement ds = connection.prepareStatement("delete from  employee where empid=? ");
			System.out.println("enter empid to delete");
			int empid14= sc.nextInt();
			ds.setInt(1, empid14);
			ds.executeUpdate();
			System.out.println("Data deleted");
		break;
		
		
		case 4:
			PreparedStatement ss = connection.prepareStatement("select * from  employee ");
			ResultSet rs=ss.executeQuery();
			while (rs.next())
			System.out.println(rs.getInt(1)+", "+rs.getString(2)+", "+rs.getString(3)+", "+rs.getInt(4));
			break;
		}
	}
}
