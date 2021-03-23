package files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrhiUpdate extends Prhj
{
	public static void main(String[] args) throws SQLException
	{
		Scanner scan = new Scanner(System.in);
		
		String url="jdbc:mysql://localhost:3306?user=root&password=12345";

		String query="update test.studentinfo set firstname=? where mobileNumber=?";
		

		Connection connection=DriverManager.getConnection(url);
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		System.out.println("enter the name");
		preparedStatement.setString(1,scan.next());
		System.out.println("enter the mobile number");
		preparedStatement.setLong(2,scan.nextLong());
		preparedStatement.executeUpdate();
	}
}
