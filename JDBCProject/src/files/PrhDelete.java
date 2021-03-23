package files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrhDelete extends Prhj 
{
	public static void main(String[] args) throws SQLException 
	{

		Scanner scan = new Scanner(System.in);

		String url="jdbc:mysql://localhost:3306?user=root&password=12345";

		String query="delete from test.studentinfo where lastname=?";

		Connection connection=DriverManager.getConnection(url);

		PreparedStatement preparedStatement=connection.prepareStatement(query);

		System.out.println("enter the lastname");
		
		preparedStatement.setString(1,scan.next());

		preparedStatement.executeUpdate();

	}
}
